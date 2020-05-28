package com.tgroup.mq.pojo;

/**
 * 
 * 泰国定制刷卡数据格式
 *
 */
public class Card {

    public Short checkin; // 0签退 1签到
    public Short valid; // 0非法 1合法
    public String rfid; // 刷卡数据

    @Override
    public String toString() {
        return "Card [checkin=" + checkin + "valid=" + valid + "rfid=" + rfid + "]";
    }

    public Short getCheckin() {
        return checkin;
    }

    public void setCheckin(Short checkin) {
        this.checkin = checkin;
    }

    public Short getValid() {
        return valid;
    }

    public void setValid(Short valid) {
        this.valid = valid;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

}
