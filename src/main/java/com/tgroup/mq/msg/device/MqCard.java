package com.tgroup.mq.msg.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 刷卡数据上报
 * 
 * @author eason
 * @date 2020/05/28
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqCard extends MqDeviceData {

    /**
     * 0签退 1签到
     */
    private Short checkin;
    /**
     * 0非法 1合法
     */
    private Short valid;
    /**
     * 刷卡完整数据
     */
    private String rfid;
    /**
     * 简易卡ID
     */
    private String cardId;

    /**
     * 状态位
     */
    @JsonProperty("s")
    private Integer state;

    /**
     * 报警位
     */
    @JsonProperty("w")
    private Integer warning;

    /**
     * 速度
     */
    @JsonProperty("v")
    private Integer speed;

    /**
     * 海拔
     */
    @JsonProperty("h")
    private Integer height;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 方位角
     */
    @JsonProperty("a")
    private Integer azimuth;

    /**
     * 当前累计里程
     */
    @JsonProperty("m")
    private Double mileage;

}
