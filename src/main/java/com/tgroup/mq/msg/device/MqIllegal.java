package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 终端违规
 * 
 * @author eason
 * @date 2020/12/22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class MqIllegal extends MqDeviceData {

    /** 线路编码 */
    private Long routeCode;
    /** 违规类型 */
    private Integer illegalType;
    /** 违规值 */
    private Integer illegalValue;
    /** 违规标准 */
    private Integer standardValue;
    /** 纬度DWORD */
    private Double lat;
    /** 经度DWORD */
    private Double lng;
    /** 海拔WORD */
    private Integer height;
    /** 速度WORD */
    private Integer speed;
    /** 方位角WORD */
    private Integer azimuth;
    /** 补发 */
    private Integer makeUp;
    /** 违规标志 */
    private String attachment;
}
