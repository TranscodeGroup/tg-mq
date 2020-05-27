package com.tgroup.mq.msg.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tgroup.mq.msg.MqDeviceData;

/**
 * 到离站信息上报 0x0B02
 * </p>
 * 车辆到站、离站时向平台上报信息
 * </p>
 * 车辆离站时，应填充乘客计数数据项
 * </p>
 * 当区分自动、手动报站时，应填充标志字段中对应的状态位
 */
public class MqStop extends MqDeviceData {

    /**
     * 线路编码
     */
    private long routeCode;
    /**
     * 到离站类型 1到站 2离站
     */
    private short flag;
    /**
     * 业务类型 内含方向
     */
    private Integer type;
    /**
     * 站台编码
     */
    private long stopCode;
    /**
     * 站序
     */
    private short serial;
    /**
     * 标志字段,手动触发,补发,定位,首末站,等
     */
    private short state;
    /**
     * 经度
     */
    private double lng;
    /**
     * 纬度
     */
    private double lat;
    /**
     * 海拔
     */
    @JsonProperty("h")
    private int height;
    /**
     * 速度
     */
    @JsonProperty("v")
    private int speed;
    /**
     * 方位角
     */
    @JsonProperty("a")
    private int azimuth;
    /**
     * 总里程
     */
    @JsonProperty("m")
    private double mileage;

    @Override
    public String toString() {
        return "Stop [imei=" + getImei() + ",time=" + getEventTime() + ",route_code=" + routeCode + ",flag="
            + getFlagStr() + ",dir=" + getTypeStr() + ",serial=" + serial + ",mileage=" + mileage + ",state="
            + getStateStr() + "]";
    }

    public String getStateStr() {
        String str1 = (state & 1) == 1 ? "手动报站" : "自动报站";
        String str2 = (state & 2) == 2 ? "补发" : "实时";
        String str3 = (state & 4) == 4 ? "定位" : "未定位";
        String str4 = "普通站";
        if ((state & 8) == 8)
            str4 = "起点站";
        if ((state & 16) == 16)
            str4 = "终点站";
        return String.format("%s %s %s %s", str1, str2, str3, str4);
    }

    public String getFlagStr() {
        if (flag == 1)
            return "到站";
        if (flag == 2)
            return "离站";
        return String.valueOf(flag);
    }

    public String getTypeStr() {
        if (type == null) {
            return "Null";
        }
        switch (type) {
            case 1:
                return "上行";
            case 2:
                return "下行";
            default:
                return String.valueOf(type);
        }
    }

    public Integer getDirection() {
        if (type <= 2) {
            return type;
        }
        return 0;
    }

    public long getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(long routeCode) {
        this.routeCode = routeCode;
    }

    public short getFlag() {
        return flag;
    }

    public void setFlag(short flag) {
        this.flag = flag;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public long getStopCode() {
        return stopCode;
    }

    public void setStopCode(long stopCode) {
        this.stopCode = stopCode;
    }

    public short getSerial() {
        return serial;
    }

    public void setSerial(short serial) {
        this.serial = serial;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

}
