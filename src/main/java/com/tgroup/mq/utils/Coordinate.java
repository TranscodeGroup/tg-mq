package com.tgroup.mq.utils;

/**
 * 
 * 经纬度
 *
 */
public class Coordinate {
    private double wgLng; // ­113°46' 西经180-本出子午线(0度)-东经180
    private double wgLat; // 22°27' 南纬90-0-北纬90

    public Coordinate(double wgLat, double wgLng) {
        setWgLat(wgLat);
        setWgLng(wgLng);
    }

    public double getWgLat() {
        return wgLat;
    }

    public void setWgLat(double wgLat) {
        this.wgLat = wgLat;
    }

    public double getWgLng() {
        return wgLng;
    }

    public void setWgLng(double wgLng) {
        this.wgLng = wgLng;
    }

    @Override
    public String toString() {
        return wgLat + "," + wgLng;
    }
}