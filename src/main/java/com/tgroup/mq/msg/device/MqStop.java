package com.tgroup.mq.msg.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 车辆进出车站
 * 
 * @author eason
 * @date 2019/12/16
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
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
    private short type;
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

}
