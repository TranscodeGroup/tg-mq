package com.tgroup.mq.info;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 运行线路、方向、站序变化通知 手工换线,等待应答,但是目前SF重连网络,没有应答
 * 
 * @author eason
 * @date 2020/07/20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ChangeRouteInfo extends AbstractInfo {
    /**
     * 切换类型 1手动切换 2平台下发命令切换
     */
    private short chgType;
    /**
     * 切换前线路编号
     */
    private long orgRoute;
    /**
     * 切换前上下行
     */
    private short orgDir;
    /**
     * 切换前站点序号
     */
    private short orgSerial;
    /**
     * 切换后线路编号
     */
    private long destRoute;
    /**
     * 切换后上下行
     */
    private short destDir;
    /**
     * 切换后站点序号
     */
    private short destSerial;
    /**
     * 时间
     */
    private long time;
    /**
     * 补传标志 0首次发送 1补发
     */
    private short flag;

}
