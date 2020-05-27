package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

/**
 * 图像抓拍
 * 
 * @author eason
 * @date 2019/12/23
 */
public class MqSnap extends MqDeviceData {
    /**
     * 通道
     */
    private Byte chn;
    /**
     * 抓拍类型
     */
    private Integer snapType;
    /**
     * 抓拍时间
     */
    private Long snapTime;
    /**
     * 存储URL
     */
    private String imgUrl;

    private Double lng;

    private Double lat;

    @Override
    public String toString() {
        return "Snap [imei=" + getImei() + ",snap_time=" + snapTime + ",img_Url=" + imgUrl + ",lng=" + lng + ",lat="
            + lat + "]";
    }

    public Byte getChn() {
        return chn;
    }

    public void setChn(Byte chn) {
        this.chn = chn;
    }

    public Integer getSnapType() {
        return snapType;
    }

    public void setSnapType(Integer snapType) {
        this.snapType = snapType;
    }

    public Long getSnapTime() {
        return snapTime;
    }

    public void setSnapTime(Long snapTime) {
        this.snapTime = snapTime;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

}
