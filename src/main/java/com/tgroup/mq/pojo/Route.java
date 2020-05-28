package com.tgroup.mq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 车辆运行线路和到站信息
 *
 */
public class Route {
    /**
     * 0x16 线路编码 dword
     */
    @JsonProperty("code")
    public long code;

    /**
     * 0非运营 1下行 2上行
     */
    // 0x17
    @JsonProperty("dir")
    public int direction;

    /**
     * 0 进站/站内 1出站/站外
     */
    // 0x18
    public int flag;

    /**
     * 站点序号 byte
     */
    @JsonProperty("sn")
    public int serial;

    /**
     * 进站时间
     */
    @JsonProperty("dt")
    public Long departTime;

    /**
     * 出站时间
     */
    @JsonProperty("at")
    public Long arriveTime;

    /**
     * 距离下一站距离 米
     */
    @JsonProperty("dist")
    public Integer distance;

    /**
     * 下一站计划到达Estimated Time of Departure
     */
    @JsonProperty("eta")
    public Long eta;
    /**
     * 下一站计划发车Estimated Time of Arrival
     */
    @JsonProperty("etd")
    public Long etd;

    /**
     * 起点计划发车
     */
    @JsonProperty("pdt")
    public Long planDepart;

    /**
     * 终点计划到达
     */
    @JsonProperty("pat")
    public Long planArrive;

    @Override
    public String toString() {
        return "Route [code=" + code + ",dir=" + direction + ",flag=" + flag + ",serial=" + serial + ",dist=" + distance
                + "]";
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public Long getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Long departTime) {
        this.departTime = departTime;
    }

    public Long getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Long arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Long getEtd() {
        return etd;
    }

    public void setEtd(Long etd) {
        this.etd = etd;
    }

    public Long getEta() {
        return eta;
    }

    public void setEta(Long eta) {
        this.eta = eta;
    }

    public Long getPlanDepart() {
        return planDepart;
    }

    public void setPlanDepart(Long planDepart) {
        this.planDepart = planDepart;
    }

    public Long getPlanArrive() {
        return planArrive;
    }

    public void setPlanArrive(Long planArrive) {
        this.planArrive = planArrive;
    }

}
