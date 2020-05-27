package com.tgroup.mq.msg.safety;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MqSafety extends MqDeviceData {

    /** 报警 ID,从 0开始循环累加 **/
    private long alarmId;
    /** 标志状态 **/
    private int flagStatus;

    /** 速度 **/
    private int speed;
    /** 海拔 **/
    private int height;
    /** 纬度 **/
    private double lat;
    /** 经度 **/
    private double lng;
    /** 事件时间 **/
    // private long eventTime;
    /** 车辆状态 **/
    private int vehicleState;
    /** 终端ID **/
    private String terminalId;
    /** 时间 **/
    private long markTime;
    /** 序号 **/
    private int serialNumber;
    /** 附件数量 **/
    private int attachedCount;
    /** 预留 **/
    private int reserved;

}
