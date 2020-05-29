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
     * 报警文件上传完成通知
     */
    public static final String TG_ALARM_FILE_COMPLETE = "TG_ALARM_FILE_COMPLETE";

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

}
