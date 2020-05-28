package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 业务请求,司机指令
 * 
 * @author eason
 * @date 2020/03/27
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqBusinessRequest extends MqDeviceData {

    /**
     * 线路编号
     */
    private long routeCode;
    /**
     * 员工编号
     */
    private String empId;
    /**
     * 业务代码 1请求排班 2请求交班
     */
    private int code;

}
