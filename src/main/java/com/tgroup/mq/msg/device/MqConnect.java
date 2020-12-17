package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * 终端连接与断开
 * 
 * @author eason
 * @date 2020/12/17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MqConnect extends MqDeviceData {
    /**
     * 终端生产企业
     */
    private String company;
    /***
     * 0建立连接 1断开连接
     */
    private Integer flag;
    /**
     * 连接时间
     */
    private Long connecttime;
    /**
     * 远程地址
     */
    private String address;
    /**
     * 终端断开原因备注
     */
    private String remark;

}
