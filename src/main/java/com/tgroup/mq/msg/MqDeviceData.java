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

    /**
     * 接收时间
     */
    private long time;

    @JsonIgnore
    public Date getEventDateTime() {
        return new Date(getEventTime() * 1000L);
    }

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
        if (eventTime == null) {
            return this.time;
        }
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public Long getReceiveTime() {
        if (receiveTime == null) {
            return this.time;
        }
        return receiveTime;
    }

    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}
