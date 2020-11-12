package com.tgroup.mq.msg.safety;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tgroup.mq.constant.TgSafetyConsts;

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

    /** 疲劳程度 **/
    private Integer fatigueLevel;
    /** 预留 **/
    private Integer reserved1;

    @JsonIgnore
    public String getAlarmInfo() {
        return String.valueOf(fatigueLevel);
    }

    @JsonIgnore
    @Override
    public String getSafetyType() {
        return TgSafetyConsts.DSM;
    }

}