package com.tgroup.mq.utils;

/**
 * 字符串连接函数
 * 
 * @author eason
 * @date 2020/05/29
 */
public class StringConcat {

    /**
     * 连接字符串 "-"
     * 
     * @param str
     * @return
     */
    public static String concat(Object... arg) {
        StringBuilder builder = new StringBuilder();
        int len = arg.length;
        if (len > 0) {
            builder.append(arg[0]);
            if (len > 1) {
                for (int i = 1; i < len; i++) {
                    builder.append("-").append(arg[i]);
                }
            }
        }
        return builder.toString();
    }
}
