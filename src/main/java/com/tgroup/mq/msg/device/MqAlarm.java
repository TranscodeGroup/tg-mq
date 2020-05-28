package com.tgroup.mq.msg.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 终端报警信息
 * 
 * @author eason
 * @date 2020/05/28
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqAlarm extends MqDeviceData {

    /**
     * 状态位
     */
    @JsonProperty("s")
    private int state;
    /**
     * 报警位
     */
    @JsonProperty("w")
    private int waring;
    /**
     * 经度
     */
    private double lng;
    /**
     * 纬度
     */
    private double lat;

    /**
     * 速度 word
     */
    @JsonProperty("v")
    private int speed;

    /**
     * 海拔word
     */
    @JsonProperty("h")
    private int height;
    @JsonProperty("a")

    /**
     * 方位角word
     */
    private int azimuth;

    /**
     * 总里程
     */
    @JsonProperty("m")
    private double mileage;

    /**
     * 终端报警类型ID
     */
    @JsonProperty("aid")
    private Integer alarmId;

    /**
     * 附加信息
     */
    @JsonProperty("att")
    private Object attachment;

}
