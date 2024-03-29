package com.tgroup.mq.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 通用附加数据
 *
 */
@JsonInclude(Include.NON_NULL)
public class Attachment {

    /**
     * 卫星数量
     */
    @JsonProperty("sat")
    public Number satellites;

    /**
     * GSM信号
     */
    @JsonProperty("gsm")
    public Number gsmSignal;

    /**
     * 视频丢失
     */
    @JsonProperty("vl")
    public Number videoLoss;

    /**
     * 视频遮挡
     */
    @JsonProperty("vs")
    public Number videoShade;

    /**
     * 存储器故障
     */
    @JsonProperty("se")
    public Number storageError;

    /**
     * 异常驾驶行为
     */
    @JsonProperty("ud")
    public Number unusualDriving;

    /**
     * 疲劳等级
     */
    @JsonProperty("fl")
    public Number fatigueLevel;

    /**
     * 油量电压
     */
    @JsonProperty("ad2")
    public Number ad2;

    /***
     * 电池电压
     */
    @JsonProperty("bv")
    public Double batteryV;

    /***
     * 电源电压
     */
    @JsonProperty("pv")
    public Double powerV;

    /**
     * 扩展车辆信号状态位
     */
    @JsonProperty("io")
    public Number io;

    /**
     * 激烈驾驶扩展位
     */
    @JsonProperty("fm")
    public Integer fm;

    /**
     * 公交业务类型
     */
    @JsonProperty("bt")
    public Integer businessType;

    /**
     * 温感
     */
    @JsonProperty("temps")
    public List<Temperature> temps;

    public Number getSatellites() {
        return satellites;
    }

    public void setSatellites(Number satellites) {
        this.satellites = satellites;
    }

    public Number getGsmSignal() {
        return gsmSignal;
    }

    public void setGsmSignal(Number gsmSignal) {
        this.gsmSignal = gsmSignal;
    }

    public Number getVideoLoss() {
        return videoLoss;
    }

    public void setVideoLoss(Number videoLoss) {
        this.videoLoss = videoLoss;
    }

    public Number getVideoShade() {
        return videoShade;
    }

    public void setVideoShade(Number videoShade) {
        this.videoShade = videoShade;
    }

    public Number getStorageError() {
        return storageError;
    }

    public void setStorageError(Number storageError) {
        this.storageError = storageError;
    }

    public Number getUnusualDriving() {
        return unusualDriving;
    }

    public void setUnusualDriving(Number unusualDriving) {
        this.unusualDriving = unusualDriving;
    }

    public Number getFatigueLevel() {
        return fatigueLevel;
    }

    public void setFatigueLevel(Number fatigueLevel) {
        this.fatigueLevel = fatigueLevel;
    }

    public Number getAd2() {
        return ad2;
    }

    public void setAd2(Number ad2) {
        this.ad2 = ad2;
    }

    public Number getIo() {
        return io;
    }

    public void setIo(Number io) {
        this.io = io;
    }

    public List<Temperature> getTemps() {
        return temps;
    }

    public void setTemps(List<Temperature> temps) {
        this.temps = temps;
    }

    @JsonIgnore
    public void addTemperature(Temperature temp) {
        if (temps == null) {
            temps = new ArrayList<>();
        }
        temps.add(temp);
    }

    public Double getBatteryV() {
        return batteryV;
    }

    public void setBatteryV(Double batteryV) {
        this.batteryV = batteryV;
    }

    public Double getPowerV() {
        return powerV;
    }

    public void setPowerV(Double powerV) {
        this.powerV = powerV;
    }

    public Integer getFm() {
        return fm;
    }

    public void setFm(Integer fm) {
        this.fm = fm;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

}
