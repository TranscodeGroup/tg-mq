package com.tgroup.mq.pojo;

import lombok.Data;

/**
 * 泰国定制刷卡数据格式,通力附加在GPS内
 * 
 * @author eason
 * @date 2020/12/24
 */
@Data
public class Card {
    /**
     * 0签退 1签到
     */
    public Short checkin;
    /**
     * 0非法 1合法
     */
    public Short valid;
    /**
     * 刷卡数据
     */
    public String rfid;

}
