package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 图像抓拍
 * 
 * @author eason
 * @date 2019/12/23
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
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

    /**
     * 经度
     */
    private Double lng;

    /**
     * 纬度
     */
    private Double lat;
}
