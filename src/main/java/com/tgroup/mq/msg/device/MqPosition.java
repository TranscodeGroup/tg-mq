package com.tgroup.mq.msg.device;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tgroup.mq.msg.MqDeviceData;
import com.tgroup.mq.pojo.Route;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 车辆GPS位置信息
 * 
 * @author eason
 * @date 2019/12/16
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqPosition extends MqDeviceData {
    /**
     * 状态位
     */
    @JsonProperty("s")
    private Integer state;
    /**
     * 报警位
     */
    @JsonProperty("w")
    private Integer waring;

    /**
     * 经度
     */
    private Double lng;
    /**
     * 纬度
     */
    private Double lat;

    /**
     * 速度
     */
    @JsonProperty("v")
    private Integer speed;

    /**
     * 方位角
     */
    @JsonProperty("a")
    private Integer azimuth;

    /**
     * 海拔
     */
    @JsonProperty("h")
    private Integer height;

    /**
     * 总里程
     */
    @JsonProperty("m")
    private Double mileage;

    /**
     * 扩展位
     */
    private Map<String, Object> att;

    /**
     * 公交运行线路
     */
    private Route route;

}
