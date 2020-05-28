package com.tgroup.mq.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * TG日期公共单元库
 **/
public class DateUtil {

    /**
     * 长日期格式
     */
    public static final String DATE_FULL = "yyyy-MM-dd HH:mm:ss";
    /**
     * 短日期格式
     */
    public static final String DATE_SHORT = "yyMMddHHmmss";
    /**
     * 东八区
     */
    public static final String TZ_GMT8 = "GMT+8";
    /**
     * UTC时区
     */
    public static final String TZ_GMT = "GMT";

    /**
     * 字符串转日期通用函数
     * 
     * @param dateStr
     *            日期字符串
     * @param format
     *            日期格式
     * @param timeZone
     *            时区 如GMT+8
     * @return
     */
    public static Date strToDate(String dateStr, String format, String timeZone) {
        if (dateStr == null || dateStr.equals("")) {
            return null;
        }

        if (format == null || timeZone == null) {
            return null;
        }

        Date date = null;
        DateFormat df = new SimpleDateFormat(format);
        df.setTimeZone(TimeZone.getTimeZone(timeZone));
        try {
            date = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 字符串转日期通用函数
     * 
     * @param date
     *            日期
     * @param format
     *            日期格式
     * @param timeZone
     *            时区 如GMT+8
     * @return
     */
    public static String dateToStr(Date date, String format, String timeZone) {
        if (date == null || format == null || timeZone == null) {
            return null;
        }

        DateFormat df = new SimpleDateFormat(format);
        df.setTimeZone(TimeZone.getTimeZone(timeZone));
        String dateStr = df.format(date);
        return dateStr;
    }

    /**
     * 时间戳转UTC时间字符串
     * 
     * @param tz
     *            时间戳,单位秒
     * @return
     */
    public static String tzToStr(long tz) {
        Date date = new Date(tz * 1000);
        return dateToStr(date, DATE_FULL, TZ_GMT);
    }

    /**
     * 时间戳转UTC时间字符串,外加引号
     * 
     * @param tz
     *            时间戳,单位秒
     * @return
     */
    public static String tzToQuotedStr(long tz) {
        String scr = tzToStr(tz);
        return "\'" + scr + "\'";
    }

    /**
     * 当前时间戳,单位秒
     *
     */
    public static long currentTime() {
        return System.currentTimeMillis() / 1000L;
    }

    /**
     * 时间差,单位秒
     * 
     * @param tz1
     *            对比目标时间
     * @return 返回目标时间与服务器时间差,单位秒
     */
    public static long timeDiff(long tz1) {
        return timeDiff(currentTime(), tz1);
    }

    /**
     * 时间差,单位秒
     * 
     * @param tz1
     * @param tz2
     * @return 返回日期或日期时间表达式tz1 和tz2 之间的秒数差
     */
    public static long timeDiff(long tz1, long tz2) {
        if ((tz1 == 0) || (tz2 == 0))
            return 0;
        return Math.abs(tz1 - tz2);
    }
}
