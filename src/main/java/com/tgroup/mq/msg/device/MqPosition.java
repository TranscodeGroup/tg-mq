package com.tgroup.mq.msg.device;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.util.RouteMatcher.Route;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tgroup.mq.msg.MqDeviceData;

/**
 * GPS位置信息
 */
public class MqPosition extends MqDeviceData {

    @JsonProperty("s")
    private int state; // 标志字段

    @JsonProperty("w")
    private int waring; // 速度 word

    private double lng; // 经度

    private double lat; // 纬度

    @JsonProperty("v")
    private int speed; // 速度 word

    @JsonProperty("h")
    private int height; // 海拔word

    @JsonProperty("a")
    private int azimuth; // 方位角word

    @JsonProperty("m")
    private double mileage; // 总里程

    private Map<String, Object> att = new HashMap<String, Object>(); // 附加消息

    private Route route; // 运行线路信息

    @Override
    public String toString() {
        return "Position [imei=" + getImei() + ",time=" + getEventTime() + ",lng=" + lng + ",lat=" + lat + ",km="
            + mileage + "]";
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getWaring() {
        return waring;
    }

    public void setWaring(int waring) {
        this.waring = waring;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(int azimuth) {
        this.azimuth = azimuth;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Map<String, Object> getAtt() {
        Iterator<Map.Entry<String, Object>> it = att.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            if (entry.getValue() == null)
                it.remove();// 使用迭代器的remove()方法删除null元素
        }
        return att;
    }

    public void setAtt(Map<String, Object> att) {
        this.att = att;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

}
