package com.tgroup.mq.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Jackson序列化和反序列,JAVA驼峰
 * 
 * @author eason
 * @date 2020/07/11
 */
public class JacksonUtil {

    private static ObjectMapper objectMapper = null;
    static {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        }
    }

    public static String objToJson(Object object) {
        String json = null;
        if (objectMapper != null) {
            try {
                json = objectMapper.writeValueAsString(object);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return json;
    }

    /**
     * 将json反序列换成对象
     * 
     * @param json
     *            json字符串
     * @param cls
     *            反序列化类
     * @return 反序列化对象
     */
    public static <T> T jsonToObj(String json, Class<T> cls) {
        T t = null;
        if (json == null) {
            return null;
        }
        if (objectMapper != null) {
            try {
                t = objectMapper.readValue(json, cls);
            } catch (JsonParseException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return t;
    }

    /**
     * LinkHashMap转对象
     * 
     * @param map
     * @param clazz
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T mapToObj(Object map, Class<T> clazz) {
        if (map == null || clazz == null) {
            return null;
        }
        return clazz.equals(String.class) ? (T)map : objectMapper.convertValue(map, clazz);
    }

}
