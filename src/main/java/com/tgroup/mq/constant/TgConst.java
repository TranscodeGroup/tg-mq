package com.tgroup.mq.constant;

/**
 * TG内部定义常量
 */
public final class TgConst {
    // 车辆超速
    public static final int SPEEDING_START = 0;// 开始
    public static final int SPEEDING_END = 1;// 恢复

    // 终端连接
    public static final int CONNECT_DISCON = 0;// 断开
    public static final int CONNECT_ACTIVE = 1;// 连接

    // 远程升级
    public static final int OTA_CANCEL = -1;// 断开
    public static final int OTA_UNEXEC = 0;// 待执行
    public static final int OTA_EXEC = 1;// 执行中
    public static final int OTA_DONE = 2;// 成功
    public static final int OTA_FAIL = 3;// 失败

}
