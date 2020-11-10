package com.tgroup.mq.pojo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 缓存GPS数据
 * 
 * @author eason
 * @date 2019/12/16
 */
@Data
public class Location {

    /**
     * 企业ID
     */
    @JsonProperty("cid")
    private String companyId;

    /**
     * 设备唯一码
     */
    @JsonProperty("imei")
    private String imei = "";

    /**
     * 报警标志位 4字节无符号
     */
    @JsonProperty("w")
    private int waring;
    /**
     * 状态位 4字节无符号
     */
    @JsonProperty("s")
    private int state;
    /**
     * 经度 WGS-84坐标系 小数点度
     */
    private double lng;
    /**
     * 纬度 WGS-84坐标系 小数点度
     */
    private double lat;
    /**
     * 海拔高度 米
     */
    @JsonProperty("h")
    private int height;
    /**
     * 速度 KM/H
     */
    @JsonProperty("v")
    private int speed;
    /**
     * 方位角 0~359
     */
    @JsonProperty("a")
    private int azimuth;
    /**
     * 实时里程 KM
     */
    @JsonProperty("m")
    private double mileage;
    /**
     * 最后有效GPS定位时间戳
     */
    @JsonProperty("et")
    private long eventTime;
    /**
     * 最后GPS数据上报数据时间戳
     */
    @JsonProperty("rt")
    private long receiveTime;

    /**
     * 最后一次ACC开启有效时间
     */
    @JsonProperty("at")
    private Long accOnTime;

    /**
     * 最后一次移动时间戳
     */
    @JsonProperty("mt")
    private long moveTime;
    /**
     * 刷卡信息
     */
    private Map<String, Object> card = new HashMap<String, Object>();
    /**
     * 其他附加信息
     */
    private Map<String, Object> att = new HashMap<String, Object>();
    /**
     * 附加线路信息
     */
    private Route route;

}
