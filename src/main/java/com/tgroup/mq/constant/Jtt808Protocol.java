package com.tgroup.mq.constant;

/**
 * 连接类型
 * 
 * @author eason
 * @date 2020/12/16
 */
public enum Jtt808Protocol {

    /**
     * 808,1078设备
     */
    JTT_808,
    /**
     * 单独调度设备
     */
    JTT_808_ITS,
    /***
     * 单独视频设备
     */
    JTT_808_DVR;

    public static final String JTT808_PROTOCOL_KEY = "jtt808";

    public static Jtt808Protocol toProtocol(String protocol) {
        if (protocol == null) {
            return JTT_808;
        }
        switch (protocol.toUpperCase()) {
            case "ITS":
                return JTT_808_ITS;
            case "DVR":
                return JTT_808_DVR;
            default:
                return JTT_808;
        }
    }
}
