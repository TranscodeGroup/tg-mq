package com.tgroup.mq.msg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 终端MQ消息
 * 
 * @author eason
 * @date 2019/12/12
 */
@Setter
@Getter
@ToString(callSuper = true)
public class MqCarData extends MqDeviceData {

    /**
     * 车辆ID
     */
    private String carId;

    /**
     * 车辆名称
     */
    private String carName;

}
