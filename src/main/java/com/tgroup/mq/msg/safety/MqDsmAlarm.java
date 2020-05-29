package com.tgroup.mq.msg.safety;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
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

    @JsonIgnore
    public String getAlarmInfo() {
        return String.valueOf(fatigueLevel);
    }
}