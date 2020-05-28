package com.tgroup.mq.utils;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 日期序列化成长整型
 * 
 * @author eason
 * @date 2019/12/09
 */
public class Date2LongSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value, JsonGenerator jgen, SerializerProvider serializers)
            throws IOException, JsonProcessingException {
        // 去掉时间戳的毫秒部份
        jgen.writeNumber(value.getTime() / 1000);
    }
}
