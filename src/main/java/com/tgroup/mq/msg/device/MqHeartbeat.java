package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 终端心跳
 * 
 * @author eason
 * @date 2020/05/28
 */

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqHeartbeat extends MqDeviceData {

}
