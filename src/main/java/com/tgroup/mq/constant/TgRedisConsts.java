package com.tgroup.mq.constant;

/**
 * 缓存常量
 * 
 * @author eason
 * @date 2020/05/15
 */
public class TgRedisConsts {
    /**
     * 用户登录信息
     */
    public final static String TOKEN_BUS = "TOKEN:BUS";
    public final static String TOKEN_BUS_ = "TOKEN:BUS:";
    public final static String TOKEN_BUS_ALL = "TOKEN:BUS:*";

    /**
     * 缓存用户信息到HttpServletRequest
     */
    public final static String TOKEN_MODEL = "TOKEN_MODEL";

    /**
     * 电子站牌存储KEY
     */
    public final static String BUS_EBOARD = "BUS:EBOARD";

    /**
     * 电子站牌位置信息
     */
    public final static String BUS_EBOARD_LOCATION = "BUS:EBOARD:LOCATION:%s";

    /**
     * 车辆位置信息,企业ID
     */
    public final static String BUS_LOCATION = "BUS:LOCATION:%s";

    /**
     * 最新的速度
     */
    public final static String SUMMARY_VELOCITY_LATEST = "SUMMARY:VELOCITY:LATEST:%s:%s";
    /**
     * 每日时段平均速度
     */
    public final static String SUMMARY_VELOCITY = "SUMMARY:VELOCITY:%s:%s";

    /**
     * 每日主动安全
     */
    public final static String SUMMARY_SAFETY = "SUMMARY:SAFETY:%s:%s";

    /**
     * 每日单车主动安全
     */
    public final static String SUMMARY_SAFETY_VEHICLE = "SUMMARY:SAFETY:VEHICLE:%s:%s";

    /**
     * 车辆每日评分
     */
    public final static String SUMMARY_SAFETY_SCORE = "SUMMARY:SAFETY:SCORE:%s:%s";

    /**
     * 当天单车总里程,参数=企业,日期,设备号
     */
    public final static String SUMMARY_MILEAGE = "SUMMARY:MILEAGE:%s:%s";

    /**
     * 车距提醒,参数=企业,日期,设备号
     */
    public final static String SUMMARY_DISTANCE = "SUMMARY:DISTANCE:%s:%s";

    /**
     * 客流前前几站台和数, 参数=日期
     */
    public final static String PASSENGER_TOP = "PASSENGER:TOP:%s";

    /**
     * 站台日客流,企业,日期
     */
    public final static String PASSENGER_STOP_UP = "PASSENGER:STOP-UP:%s:%s";
    public final static String PASSENGER_STOP_DOWN = "PASSENGER:STOP-DOWN:%s:%s";
    /**
     * 线路日客流,企业,日期
     */
    public final static String PASSENGER_ROUTE_UP = "PASSENGER:ROUTE-UP:%s:%s";
    public final static String PASSENGER_ROUTE_DOWN = "PASSENGER:ROUTE-DOWN:%s:%s";
    /**
     * 时段日客流,企业,日期
     */
    public final static String PASSENGER_TIME_UP = "PASSENGER:TIME-UP:%s:%s";
    public final static String PASSENGER_TIME_DOWN = "PASSENGER:TIME-DOWN:%s:%s";

    /**
     * 超速开始,企业-终端-时间
     */
    public final static String SPEEDING_START = "SPEEDING:START:%s:%s:%s";

    /**
     * 行程开始,企业-终端
     */
    public final static String TRIP_START = "TRIP:START:%s:%s";

    /**
     * 上一次进出站,企业-终端
     */
    public final static String TRIP_DEPART_ARRIVE = "TRIP:DEPART:ARRIVE:%s:%s";

    /**
     * REDIS,设备最后连接状态
     */
    public static final String MQ_DEVICE_STATE = "MQ:DEVICE:STATE";
    public static final String MQ_DEVICE_MDVR = "MQ:DEVICE:MDVR";
    public static final String MQ_DEVICE_LAST = "MQ:DEVICE:LAST:%s";

    /***
     * 查询终端属性
     */
    public static final String GPS_COMMAND_DEVICE_PROPERTY = "GPS:COMMAND:REPLY:%s:DEVPROPERTY";
    /***
     * 查询终端音视频属性
     */
    public static final String GPS_COMMAND_DEVICE_AV_PROPERTY = "GPS:COMMAND:REPLY:%s:AVPROPERTY";

    /**
     * 视频播放KEY
     */
    public static String APP_FLAG_LIVE = "live";
    public static String APP_FLAG_RECORD = "record";
    public static String MQ_VIDEO_PLAY = "MQ:PLAY:%s:%s_%d";
    public static String MQ_VIDEO_PLAY_LIVE = "MQ:PLAY:live:%s_%d";
    public static String MQ_VIDEO_PLAY_RECORD = "MQ:PLAY:record:%s_%d";
}
