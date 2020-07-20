package com.tgroup.mq.info;

/**
 * 抽象的终端应答数据
 * 
 * @author eason
 * @date 2020/07/20
 */
public abstract class AbstractInfo {
    /**
     * 终端ID
     */
    private String imei;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
