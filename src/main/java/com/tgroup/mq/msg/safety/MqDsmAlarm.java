package com.tgroup.mq.msg.safety;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DSM：驾驶员状态监测
 * 
 * @author eason
 * @date 2020/05/25
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class MqDsmAlarm extends MqSafety {

    /** 报警/事件类型 **/
    private int alarmType;
    /** 报警级别 **/
    private int alarmLevel;
    /** 疲劳程度 **/
    private int fatigueLevel;
    /** 预留 **/
    private long reserved1;

}