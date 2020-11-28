package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 客流数据上报
 * 
 * @author eason
 * @date 2020/05/28
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqPassenger extends MqDeviceData {

    /**
     * 开始时间
     */
    private Long startTime;
    /**
     * 结束时间
     */
    private Long endTime;
    /**
     * 上车人数
     */
    private Integer upNumber;
    /**
     * 下车人数
     */
    private Integer downNumber;
    /**
     * 车厢内人数
     */
    private Integer inCarNumber;
    /**
     * 线路编号
     */
    private Integer routeCode;
    /**
     * 线路方向
     */
    private Integer direction;
    /**
     * 站点编号
     */
    private Integer serial;
    /**
     * 站台编号
     */
    private Integer stopCode;
    /**
     * 当天总上车人数
     */
    private Integer totalToday;
    /**
     * 上传时间
     */
    private Long uploadTime;

}
