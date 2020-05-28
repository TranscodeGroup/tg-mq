package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MQ消息应答
 * 
 * @author eason
 * @date 2020/05/28
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqRspCmd extends MqDeviceData {

    /**
     * MQ消息唯一ID
     */
    private String rspMqId;

    /**
     * 结果 Byte 0成功 1失败 2消息有误 3不支持4报警
     */
    private Integer reply;

}
