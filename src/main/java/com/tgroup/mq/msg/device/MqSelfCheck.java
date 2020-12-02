package com.tgroup.mq.msg.device;

import java.util.List;

import com.tgroup.mq.msg.MqDeviceData;
import com.tgroup.mq.pojo.StorageStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 刷卡数据上报
 * 
 * @author eason
 * @date 2020/05/28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MqSelfCheck extends MqDeviceData {

    /** 应答流水号 */
    private Integer rspSerial;

    /** 自检信息长度 */
    private Integer infoLength;

    /** 录像通道数 */
    private Short recordChnNumber;

    /** 录像状态 */
    private Integer recordStatus;

    /** 无线模块类型 */
    private Short wirelessType;

    /** 无线模块状态 */
    private Short wirelessStatus;

    /** gps模块状态 */
    private Short gpsStatus;

    /** 电源模块状态 */
    private Short powerStatus;

    /** 调度屏 */
    private Short screenStatus;

    /** 存储信息列表数 */
    private Short storageNumber;

    /** 存储信息列表数 */
    private List<StorageStatus> storageList;

}
