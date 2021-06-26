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
     * 泰国定制部分
     */
    /** 0签退 1签到 */
    private Short checkin;

    /** 0非法 1合法 */
    private Short valid;

    /** 磁条卡刷卡完整数据 */
    private String rfid;

    /**
     * 808协议部分
     */
    /** 简易卡ID或者员工编号 */
    private String cardId;

    /** 考勤类型 1上班 2下班 3签到 4签退 5例检 **/
    private Short type;

    /** 考勤方式 1员工卡考勤 2输工号考勤 自定义200=GPS附加, 210透传 **/
    private Short origin;

    /***
     * 扩展GPS
     */

    /** 状态位 */
    @JsonProperty("s")
    private Integer state;

    /** 报警位 */
    @JsonProperty("w")
    private Integer warning;

    /** 速度 */
    @JsonProperty("v")
    private Integer speed;

    /** 海拔 */
    @JsonProperty("h")
    private Integer height;

    /** 经度 */
    private Double lng;

    /** 纬度 */
    private Double lat;

    /** 方位角 */
    @JsonProperty("a")
    private Integer azimuth;

    /** 当前累计里程 */
    @JsonProperty("m")
    private Double mileage;

}
