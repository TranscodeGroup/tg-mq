package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

/**
 * 终端连接与断开
 */
public class MqConnect extends MqDeviceData {
    // 企业
    private String company;
    // 0建立连接 1断开连接
    private Integer flag;
    // 连接时间
    private Long connecttime;
    // 远程地址
    private String address;

    @Override
    public String toString() {
        return "GpsConnect [devid=" + getImei() + ",company=" + company + ",flag=" + flag + ",time=" + getEventTime()
                + ",connecttime=" + connecttime + "]";
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Long getConnecttime() {
        return connecttime;
    }

    public void setConnecttime(Long connecttime) {
        this.connecttime = connecttime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
