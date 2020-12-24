package com.tgroup.mq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 
 * 车辆运行线路和到站信息
 *
 */
@Data
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

}
