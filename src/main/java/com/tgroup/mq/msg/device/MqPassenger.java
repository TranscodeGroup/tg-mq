package com.tgroup.mq.msg.device;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tgroup.mq.msg.MqDeviceData;
import com.tgroup.mq.util.Long2DateDeserializer;

/**
 * 客流上报
 */
public class MqPassenger extends MqDeviceData {

    /**
     * 开始时间
     */
    @JsonDeserialize(using = Long2DateDeserializer.class)
    private Date startTime;
    /**
     * 结束时间
     */
    @JsonDeserialize(using = Long2DateDeserializer.class)
    private Date endTime;
    /**
     * 上车人数
     */
    private int upNumber;
    /**
     * 下车人数
     */
    private int downNumber;
    /**
     * 上传时间
     */
    @JsonDeserialize(using = Long2DateDeserializer.class)
    private Date uploadTime;

    @Override
    public String toString() {
        return "Passenger [imei=" + getImei() + ",start_time=" + startTime + ",end_time=" + endTime + ",up=" + upNumber
            + ",down=" + downNumber + ",upload_time=" + uploadTime + "]";
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getUpNumber() {
        return upNumber;
    }

    public void setUpNumber(int upNumber) {
        this.upNumber = upNumber;
    }

    public int getDownNumber() {
        return downNumber;
    }

    public void setDownNumber(int downNumber) {
        this.downNumber = downNumber;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

}
