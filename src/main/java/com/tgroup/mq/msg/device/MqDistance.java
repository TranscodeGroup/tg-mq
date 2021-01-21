package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 车距提醒
 * 
 * @author eason
 * @date 2020/12/21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MqDistance extends MqDeviceData {

    /** 是否有前车 1有前车;0无 **/
    private int hasFrontCar;
    /** 前车距离告警属性 **/
    private int frontCarFlag;
    /** 前车距离文本,带单位，多少米或多少站 **/
    private String frontCarDistance;
    /** 车牌或终点站 **/
    private String frontCarText;

    /** 车牌或终点站 **/
    private int hasBackCar;
    /** 后车距离告警属性, 2过近;1过远;0正常 **/
    private int backCarFlag;
    /** 后车距离文本, 多少米或多少站 **/
    private String backCarDistance;
    /** 车牌或起点站 **/
    private String backCarText;

    /** 标准最小车距文本 , 带单位 **/
    private String minStandardDistance;
    /** 标准最大车距文本 , 带单位 **/
    private String maxStandardDistance;

}
