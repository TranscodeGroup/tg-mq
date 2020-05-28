package com.tgroup.mq.msg;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 终端MQ消息
 * 
 * @author eason
 * @date 2019/12/12
 */
public class MqDeviceData extends BaseMqData {

    /**
     * 终端唯一码
     */
    @JsonProperty("did")
    private String imei;

    /**
     * 终端企业ID
     */
    @JsonProperty("cid")
    private String companyId;

    /**
     * 事件时间
     */
    @JsonProperty("et")
    private Long eventTime;

    /**
     * 接收时间
     */
    @JsonProperty("rt")
    private Long receiveTime;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Long getEventTime() {
        return this.eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    @JsonIgnore
    public Date getEventDateTime() {
        return new Date(this.eventTime * 1000L);
    }

    public Long getReceiveTime() {
        return this.receiveTime;
    }

    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }

}
