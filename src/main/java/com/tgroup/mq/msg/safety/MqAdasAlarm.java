package com.tgroup.mq.msg.safety;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tgroup.mq.constant.TgSafetyConsts;
import com.tgroup.mq.utils.StringConcat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ADAS：高级驾驶辅助系统报警
 * 
 * @author eason
 * @date 2020/05/25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MqAdasAlarm extends MqSafety {

    /** 前车车速 **/
    private Short frontSpeed;
    /** 前车距离 **/
    private Short frontDistance;
    /** 偏离类型 **/
    private Short deviationType;
    /** 道路标识类型 **/
    private Short roadSignType;
    /** 道路标识数值 **/
    private Short roadSignValue;

    @JsonIgnore
    public String getAlarmInfo() {
        return StringConcat.concat(frontSpeed, frontDistance, deviationType, roadSignType, roadSignValue);
    }

    @JsonIgnore
    @Override
    public String getSafetyType() {
        return TgSafetyConsts.ADAS;
    }
}