package com.tgroup.mq.msg.safety;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 主动安全
 * 
 * @author eason
 * @date 2020/05/25
 */
@Setter
@Getter
@ToString(callSuper = true)
public class MqSafety extends MqDeviceData {

    /** 报警 ID,从 0开始循环累加 **/
    private Long alarmId;
    /** 标志状态 **/
    private Integer flagStatus;
    /** 速度 **/
    private Integer speed;
    /** 海拔 **/
    private Integer height;
    /** 纬度 **/
    private Double lat;
    /** 经度 **/
    private Double lng;
    /** 车辆状态 **/
    private Integer vehicleState;
    /** 终端ID **/
    private String terminalId;
    /** 时间 **/
    private Long markTime;
    /** 序号 **/
    private Integer serialNumber;
    /** 附件数量 **/
    private Integer attachedCount;
    /** 预留 **/
    private Integer reserved;
}
