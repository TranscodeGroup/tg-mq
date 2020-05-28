package com.tgroup.mq.msg.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tgroup.mq.msg.MqDeviceData;

/**
 * 报警数据
 */
public class MqAlarm extends MqDeviceData {

    @JsonProperty("s")
    private int state; // 标志字段

    @JsonProperty("w")
    private int waring; // 速度 word

    private double lng; // 经度

    private double lat; // 纬度

    @JsonProperty("v")
    private int speed; // 速度 word

    @JsonProperty("h")
    private int height; // 海拔word

    @JsonProperty("a")
    private int azimuth; // 方位角word

    @JsonProperty("m")
    private double mileage; // 总里程

    private Integer aid; // 终端报警类型ID
    private Object att; // 附加消息

    @Override
    public String toString() {
        return "MQAlarm [imei=" + getImei() + ",aid=" + aid + ",time=" + getEventTime() + "]";
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getWaring() {
        return waring;
    }

    public void setWaring(int waring) {
        this.waring = waring;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public short getHeight() {
        return (short)height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(int azimuth) {
        this.azimuth = azimuth;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Object getAtt() {
        return att;
    }

    public void setAtt(Object att) {
        this.att = att;
    }

}
