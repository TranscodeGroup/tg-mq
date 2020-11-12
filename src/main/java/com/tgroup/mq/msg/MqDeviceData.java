package com.tgroup.mq.msg;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 终端MQ消息
 * 
 * @author eason
 * @date 2019/12/12
 */
@Setter
@Getter
@ToString(callSuper = true)
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
     * 事件时间,秒
     */
    @JsonProperty("et")
    private Long eventTime;

    /**
     * 接收时间,秒
     */
    @JsonProperty("rt")
    private Long receiveTime;

    /**
     * 车辆ID
     */
    @JsonIgnore
    private String carId;
    /***
     * 车辆名称
     */
    @JsonIgnore
    private String carName;

    @JsonIgnore
    public Date getEventDateTime() {
        return new Date(this.eventTime * 1000L);
    }

    public Long getReceiveTime() {
        if (receiveTime == null) {
            return new Date().getTime() / 1000L;
        } else {
            return this.receiveTime;
        }
    }

}
