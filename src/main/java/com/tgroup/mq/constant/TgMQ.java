package com.tgroup.mq.constant;

/**
 * MQ相关常量
 */
public final class TgMQ {
    // 终端消息发布
    public static final String TG_GPS = "TG_GPS";// GPS数据
    public static final String TG_ALM = "TG_ALM";// 报警数据
    public static final String TG_HB = "TG_HB";// 终端心跳数据
    public static final String TG_CARD = "TG_CARD";// 刷卡数据
    public static final String TG_STOP = "TG_STOP";// 进出站点
    public static final String TG_CONN = "TG_CONN";// 终端连接
    public static final String TG_RSP = "TG_RSP";// 消息指令应答
    public static final String TG_CHG_ROUTE = "TG_CHG_ROUTE";// 线路换线
    public static final String TG_VERSION = "TG_VER";// 设备版本上报
    public static final String TG_PASSENGER = "TG_PASSENGER";// 客流数据
    public static final String TG_SNAP = "TG_SNAP";// 图片抓拍

    // REDIS订阅消息ID 下发REQ 上传RSP
    public static final String REQ_MM_SNAP = "REQ_MM_SNAP"; // 摄像头立即拍摄命令
    public static final String REQ_AV_PROPERTY = "REQ_AV_PROPERTY"; // 查询终端音视频属性
    public static final String REQ_AV_LIVE_UPLOAD = "REQ_AV_LIVE_UPLOAD";// 实时音视频传输请求
    public static final String REQ_AV_LIVE_CONTROL = "REQ_AV_LIVE_CONTROL";// 实时音视频传输控制
    public static final String REQ_AV_LIVE_NOTIFY = "REQ_AV_LIVE_NOTIFY";// 实时音视频传输状态通知
    public static final String REQ_AV_RECORD_LIST = "REQ_AV_RECORD_LIST";// 查询资源列表
    public static final String REQ_AV_RECORD_UPLOAD = "REQ_AV_RECORD_UPLOAD";// 平台下发远程录像回放请求
    public static final String REQ_AV_RECORD_CONTROL = "REQ_AV_RECORD_CONTROL";// 平台下发远程录像回放控制
    public static final String REQ_AV_FILE_UPLOAD = "REQ_AV_FILE_UPLOAD";// 文件上传指令
    public static final String REQ_AV_FILE_CONTROL = "REQ_AV_FILE_CONTROL";// 文件上传控制

    // 发布到网关消息频道 MQ:CMD:GATEWAY
    public static final String REQ_DEV_TEXT = "REQ_DEV_TEXT";// 下发文本到终端
    public static final String REQ_DEV_PLAN = "REQ_DEV_PLAN";// 下发计划到终端
    public static final String REQ_DEV_OPERATE = "REQ_DEV_OPERATE";// 业务变更指令
    public static final String REQ_DEV_OTA = "REQ_DEV_OTA";// 请求远程升级
    public static final String REQ_DEV_CTL = "REQ_DEV_CTL";// 终端控制

    public static final String REQ_DEV_PARAM_QRY = "REQ_DEV_PARAM_QRY";// 查询终端参数
    public static final String REQ_DEV_PARAM_PART = "REQ_DEV_PARAM_PART";// 查询终端参数
    public static final String REQ_DEV_PROPERTY = "REQ_DEV_PROPERTY";// 查询终端属性
    public static final String REQ_DEV_PARAM_SET = "REQ_DEV_PARAM_SET"; // 设置终端参数
    public static final String REQ_DEV_CONTROL = "REQ_DEV_CONTROL"; // 终端控制
    public static final String REQ_DEV_POSITION = "REQ_DEV_POSITION"; // 位置信息查询
    public static final String REQ_DEV_TRACK = "REQ_DEV_TRACK"; // 临时位置跟踪控制
    public static final String REQ_DEV_EVENT = "REQ_DEV_EVENT"; // 事件设置

    // 扩展信息
    public static final String ATT_GSM = "gsm"; // GSM信号
    public static final String ATT_SAT = "sat";// 卫星个数
    public static final String ATT_BATTERYV = "bv";// 电池电压
    public static final String ATT_POWERV = "pv";// 电源电压
    public static final String ATT_RFID = "rfid";// 刷卡数据
    public static final String ATT_LBS = "lbs"; // 基站信息
    public static final String ATT_OIL = "oil"; // 油量
    public static final String ATT_AD2 = "ad2"; // 油量
    public static final String ATT_IO = "io"; // IO状态
    public static final String ATT_TEMPS = "temps"; // 温感
    // 视频
    public static final String CHANNEL_ID = "chn";// 通道
    public static final String PACKET_LOSS = "loss";// 丢包率
    public static final String VIDEO_LOSS = "vl";// 视频信号丢失报警状态
    public static final String VIDEO_SHADE = "vs";// 视频信号遮挡报警状态
    public static final String STORAGE_ERROR = "se";// 存储器故障报警状态
    public static final String UNUSUAL_DRIVING = "ud";// 异常驾驶行为报警
    public static final String FATIGUE_LEVEL = "fl";// 疲劳驾驶程度
    // 报警

}
