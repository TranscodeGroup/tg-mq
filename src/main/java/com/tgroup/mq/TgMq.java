package com.tgroup.mq;

/**
 * MQ消息头
 * 
 * @author eason
 * @date 2020/05/27
 */
public final class TgMq {

    /**
     * 终端消息发布
     */
    /**
     * GPS数据
     */
    public static final String TG_GPS = "TG_GPS";
    /**
     * 报警数据
     */
    public static final String TG_ALM = "TG_ALM";
    /**
     * 终端心跳数据
     */
    public static final String TG_HB = "TG_HB";
    /**
     * 刷卡数据
     */
    public static final String TG_CARD = "TG_CARD";
    /**
     * 进出站点
     */
    public static final String TG_STOP = "TG_STOP";
    /**
     * 终端连接
     */
    public static final String TG_CONN = "TG_CONN";
    /**
     * 消息指令应答
     */
    public static final String TG_RSP = "TG_RSP";
    /**
     * 线路换线
     */
    public static final String TG_CHG_ROUTE = "TG_CHG_ROUTE";
    /**
     * 设备版本上报
     */
    public static final String TG_VERSION = "TG_VER";
    /**
     * 客流数据
     */
    public static final String TG_PASSENGER = "TG_PASSENGER";
    /**
     * 图片抓拍
     */
    public static final String TG_SNAP = "TG_SNAP";

    /**
     * 高级驾驶辅助系统
     */
    public static final String TG_ADAS = "TG_ADAS";

    /**
     * 驾驶员状态监控系统
     */
    public static final String TG_DSM = "TG_DSM";

    /**
     * 签到签退
     */
    public static final String REQ_SIGN_IN = "REQ_SIGN_IN";

    /**
     * 报警文件上传完成通知
     */
    public static final String TG_ALARM_FILE_COMPLETE = "TG_ALARM_FILE_COMPLETE";

    /**
     * 视频文件上传完成通知
     */
    public static final String TG_FILE_COMPLETE = "TG_FILE_COMPLETE";

    /**
     * 终端自检
     */
    public static final String TG_SELF_CHECK = "TG_SELF_CHECK";

    /**
     * 终端违规
     */
    public static final String TG_ILLEGAL = "TG_ILLEGAL";

    /**
     * 司机手动命令请求
     */
    public static final String TG_REQ = "TG_REQ";

    /**
     * 车距提醒
     */
    public static final String REQ_DISTANCE = "REQ_DISTANCE";

    /**
     * REDIS订阅消息ID 下发REQ 上传RSP
     */
    /**
     * 摄像头立即拍摄命令
     */
    public static final String REQ_MM_SNAP = "REQ_MM_SNAP";
    /**
     * 查询终端音视频属性
     */
    public static final String REQ_AV_PROPERTY = "REQ_AV_PROPERTY";
    /**
     * 实时音视频传输请求
     */
    public static final String REQ_AV_LIVE_UPLOAD = "REQ_AV_LIVE_UPLOAD";
    /**
     * 实时音视频传输控制
     */
    public static final String REQ_AV_LIVE_CONTROL = "REQ_AV_LIVE_CONTROL";
    /**
     * 实时音视频传输状态通知
     */
    public static final String REQ_AV_LIVE_NOTIFY = "REQ_AV_LIVE_NOTIFY";
    /**
     * 查询资源列表
     */
    public static final String REQ_AV_RECORD_LIST = "REQ_AV_RECORD_LIST";
    /**
     * 平台下发远程录像回放请求
     */
    public static final String REQ_AV_RECORD_UPLOAD = "REQ_AV_RECORD_UPLOAD";
    /**
     * 平台下发远程录像回放控制
     */
    public static final String REQ_AV_RECORD_CONTROL = "REQ_AV_RECORD_CONTROL";
    /**
     * 文件上传指令
     */
    public static final String REQ_AV_FILE_UPLOAD = "REQ_AV_FILE_UPLOAD";
    /**
     * 文件上传控制
     */
    public static final String REQ_AV_FILE_CONTROL = "REQ_AV_FILE_CONTROL";

    /**
     * 发布到网关消息频道 MQ:CMD:GATEWAY
     */

    /**
     * 下发文本到终端
     */
    public static final String REQ_DEV_TEXT = "REQ_DEV_TEXT";
    /**
     * 下发计划到终端
     */
    public static final String REQ_DEV_PLAN = "REQ_DEV_PLAN";
    /**
     * 业务变更指令
     */
    public static final String REQ_DEV_OPERATE = "REQ_DEV_OPERATE";
    /**
     * 请求远程升级
     */
    public static final String REQ_DEV_OTA = "REQ_DEV_OTA";
    /**
     * 终端控制
     */
    public static final String REQ_DEV_CTL = "REQ_DEV_CTL";

    /**
     * 查询终端参数
     */
    public static final String REQ_DEV_PARAM_QRY = "REQ_DEV_PARAM_QRY";
    /**
     * 查询终端参数
     */
    public static final String REQ_DEV_PARAM_PART = "REQ_DEV_PARAM_PART";
    /**
     * 查询终端属性
     */
    public static final String REQ_DEV_PROPERTY = "REQ_DEV_PROPERTY";
    /**
     * 设置终端参数
     */
    public static final String REQ_DEV_PARAM_SET = "REQ_DEV_PARAM_SET";
    /**
     * 终端控制
     */
    public static final String REQ_DEV_CONTROL = "REQ_DEV_CONTROL";
    /**
     * 位置信息查询
     */
    public static final String REQ_DEV_POSITION = "REQ_DEV_POSITION";
    /**
     * 临时位置跟踪控制
     */
    public static final String REQ_DEV_TRACK = "REQ_DEV_TRACK";
    /**
     * 事件设置
     */
    public static final String REQ_DEV_EVENT = "REQ_DEV_EVENT";
    /**
     * 乘客信息发布
     */
    public static final String REQ_DEV_PASSENGER = "REQ_DEV_PASSENGER";
    /**
     * 扩展信息
     */

    /**
     * GSM信号
     */
    public static final String ATT_GSM = "gsm";
    /**
     * 卫星个数
     */
    public static final String ATT_SAT = "sat";
    /**
     * 电池电压
     */
    public static final String ATT_BATTERYV = "bv";
    /**
     * 电源电压
     */
    public static final String ATT_POWERV = "pv";
    /**
     * 刷卡数据
     */
    public static final String ATT_RFID = "rfid";
    /**
     * 基站信息
     */
    public static final String ATT_LBS = "lbs";
    /**
     * 油量
     */
    public static final String ATT_OIL = "oil";
    /**
     * AD2
     */
    public static final String ATT_AD2 = "ad2";
    /**
     * IO状态
     */
    public static final String ATT_IO = "io";
    /**
     * 温感
     */
    public static final String ATT_TEMPS = "temps";

    /** 里程日期 */
    public static final String ATT_WORK_DAY = String.valueOf("day");

    /** 当天最小里程 */
    public static final String ATT_MIN_KM = String.valueOf("min_km");

    /** 当天最大里程 */
    public static final String ATT_MAX_KM = String.valueOf("max_km");

    /** 附加乘客对象 */
    public static final String PASSENGER = String.valueOf("passenger");

    /** 5s客流上 */
    public static final String PASSENGER_REAL_ON = String.valueOf("on_real");
    /** 5s客流下 */
    public static final String PASSENGER_REAL_OFF = String.valueOf("off_real");
    /** 行程客流上 */
    public static final String PASSENGER_TRIP_ON = String.valueOf("on_trip");
    /** 行程客流下 */
    public static final String PASSENGER_TRIP_OFF = String.valueOf("off_trip");
    /** 一天客流上 */
    public static final String PASSENGER_DAY_ON = String.valueOf("on_day");
    /** 一天客流下 */
    public static final String PASSENGER_DAY_OFF = String.valueOf("off_day");
    /** 最后更新站序 */
    public static final String PASSENGER_SERIAL = String.valueOf("serial");
    /** 最后更新时间 */
    public static final String PASSENGER_TIME = String.valueOf("time");

    /**
     * 视频部分
     */

    /**
     * 通道
     */
    public static final String CHANNEL_ID = "chn";
    /**
     * 丢包率
     */
    public static final String PACKET_LOSS = "loss";
    /**
     * 视频信号丢失报警状态
     */
    public static final String VIDEO_LOSS = "vl";
    /**
     * 视频信号遮挡报警状态
     */
    public static final String VIDEO_SHADE = "vs";
    /**
     * 存储器故障报警状态
     */
    public static final String STORAGE_ERROR = "se";
    /**
     * 异常驾驶行为报警
     */
    public static final String UNUSUAL_DRIVING = "ud";
    /**
     * 疲劳驾驶程度
     */
    public static final String FATIGUE_LEVEL = "fl";
    /**
     * 行驶200米一次记录时间
     */
    public static final String MOVE_200M = "move_200m";

    /***
     * 驾驶员刷卡附加REDIS -> card,为了兼容track,不要改动
     */

    /** 完整姓名 */
    public static final String MAGNETIC_CARD_NAME = String.valueOf("n");
    /** 卡类型 */
    public static final String MAGNETIC_CARD_TYPE = String.valueOf("t");
    /** 性别 */
    public static final String MAGNETIC_CARD_SEX = String.valueOf("s");
    /** 卡号 */
    public static final String MAGNETIC_CARD_LICENSE = String.valueOf("l");
    /** 区域代码 */
    public static final String MAGNETIC_CARD_PLACECODE = String.valueOf("p");
    /** 身份证号 */
    public static final String MAGNETIC_CARD_PERSONALID = String.valueOf("pi");
    /** 刷卡时间 */
    public static final String MAGNETIC_CARD_TIME = String.valueOf("e");
    /** 0非法 1合法 **/
    public static final String MAGNETIC_CARD_VALID = String.valueOf("v");
    /** 0签退 1签到 **/
    public static final String MAGNETIC_CHECK_IN = String.valueOf("in");

    /***
     * 驾驶员刷磁条卡或按键签到
     */

    /** 驾驶员RFID卡号 */
    public static final String DRIVER_CARD_ID = String.valueOf("dci");
    /** 驾驶员RFID刷卡时间 */
    public static final String DRIVER_CARD_TIME = String.valueOf("dct");
    /** 驾驶员工号 */
    public static final String DRIVER_EMPLOYEE_ID = String.valueOf("dei");
    /** 驾驶员姓名 */
    public static final String DRIVER_EMPLOYEE_NAME = String.valueOf("den");
    /** 0未知, 1签到, 2签退 **/
    public static final String DRIVER_CHECK_IN = String.valueOf("dci");

    /***
     * 乘务员刷磁条卡
     */
    /*** 乘务员RFID卡号 */
    public static final String CONDUCTOR_CARD_ID = String.valueOf("cci");
    /** 乘务员刷RFID时间 */
    public static final String CONDUCTOR_CARD_TIME = String.valueOf("cct");
    /** 乘务员刷RFID工号 */
    public static final String CONDUCTOR_EMPLOYEE_ID = String.valueOf("cei");
    /** 乘务员刷RFID姓名 */
    public static final String CONDUCTOR_EMPLOYEE_NAME = String.valueOf("cen");
    /** 0未知, 1签到, 2签退 **/
    public static final String CONDUCTOR_CHECK_IN = String.valueOf("cci");

}
