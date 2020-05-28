package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 终端版本上报
 * 
 * @author eason
 * @date 2020/05/28
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqVersion extends MqDeviceData {
    /**
     * 协议版本
     */
    private String protocol;
    /**
     * 固件版本
     */
    private String firmware;
    /**
     * 报站文件版本
     */
    private String site;

}
