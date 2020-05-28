package com.tgroup.mq.msg.safety;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DSM：驾驶员状态监测
 * 
 * @author eason
 * @date 2020/05/25
 */

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqDsmAlarm extends MqSafety {

    /** 报警/事件类型 **/
    private Integer alarmType;
    /** 报警级别 **/
    private Integer alarmLevel;
    /** 疲劳程度 **/
    private Integer fatigueLevel;
    /** 预留 **/
    private Integer reserved1;

}