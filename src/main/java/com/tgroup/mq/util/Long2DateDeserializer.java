package com.tgroup.mq.util;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * 长整型反序列化成日期
 * 
 * @author eason
 * @date 2019/12/09
 */
public class Long2DateDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        Long tz = p.getLongValue();
        String tzString = String.valueOf(tz);
        // 秒转日期
        if (tzString.length() == 10) {
            return new Date(tz * 1000L);
        }
        // 毫秒转日期
        if (tzString.length() == 13) {
            return new Date(tz);
        }
        return null;
    }

}
