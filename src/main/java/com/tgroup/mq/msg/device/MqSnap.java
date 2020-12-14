package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 图像抓拍
 * 
 * @author eason
 * @date 2019/12/23
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MqSnap extends MqDeviceData {
    /**
     * 通道
     */
    private Integer chn;
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

    /**
     * 经度
     */
    private Double lng;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 抓拍指令KEY
     */
    private String key;
}
