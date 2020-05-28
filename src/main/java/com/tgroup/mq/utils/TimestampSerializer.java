package com.tgroup.mq.utils;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 将日期类型序列化成时间戳,单位秒
 * 
 * @JsonSerialize(using = TimestampSerializer.class)
 *
 */
public class TimestampSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value, JsonGenerator jgen, SerializerProvider serializers)
            throws IOException, JsonProcessingException {
        // 去掉时间戳的毫秒部份
        jgen.writeNumber(value.getTime() / 1000);
    }
}
