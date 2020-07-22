package com.tgroup.mq.msg.device;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tgroup.mq.msg.MqDeviceData;
import com.tgroup.mq.pojo.Passenger;

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

    /**
     * 车厢内人数
     */
    private Integer inCarNumber;

    /**
     * 车门数
     */
    private Integer doorCount;

    /**
     * 门内乘客上下详情
     */
    private List<Passenger> passengers;

    /**
     * 是否补发
     */
    @JsonIgnore
    public boolean isReissue() {
        return (state & 0x02) == 0x02;
    }

    /**
     * 
     * 读取车辆到站 0站内 1站外
     */
    @JsonIgnore
    public int getOnway() {
        if (flag == 2) {
            // 出站
            return 1;
        } else {
            return 0;
        }

    }

    /**
     * 获取运行方向
     * 
     * @return
     */
    @JsonIgnore
    public short getDirection() {
        if (type <= 2) {
            return type;
        }
        return 0;
    }

}
