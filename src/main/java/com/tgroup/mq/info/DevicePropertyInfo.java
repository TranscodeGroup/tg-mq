package com.tgroup.mq.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询终端属性,应答
 * 
 * @author eason
 * @date 2020/07/20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DevicePropertyInfo extends AbstractInfo {
    /**
     * 终端类型 WORD
     */
    private int devtype;
    /**
     * 制造商ID
     */
    private String producer;
    /**
     * 终端型号
     */
    private String devmodel;
    /**
     * 终端ID
     */
    private String devgid;
    /**
     * 终端SIM卡ICCID
     */
    private String iccid;
    /**
     * 硬件版本号
     */
    private String hardware;
    /**
     * 固件版本号
     */
    private String firmware;
    /**
     * GNSS模块
     */
    private short gnss;

    /**
     * 通讯模块
     */
    @JsonProperty("cn")
    private short communicationModule;

}
