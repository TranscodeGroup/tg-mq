package com.tgroup.mq.info;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 终端上传音视频属性
 * 
 * @author eason
 * @date 2020/07/20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AvPropertyInfo extends AbstractInfo {
    /**
     * 音频编码方式byte
     */
    private byte audioEncode;
    /**
     * 音频声道数 byte
     */
    private byte audioChannel;
    /**
     * 音频采样率 byte 0:8kHz 1:22.05kHz 2:44.1kHz 3:48kHz
     */
    private byte audioSampling;
    /**
     * 音频采样位数 byte 0:0位 1:16位 2:32位
     */
    private byte audioSamplingBit;
    /**
     * 音视频帧长度 word
     */
    private int frameLength;
    /**
     * 是否支持音频输出 byte
     */
    private byte audioOutput;
    /**
     * 视频编码方式 byte
     */
    private byte videoEncode;
    /**
     * 支持最大的音频物理通道 byte
     */
    private byte maxAudio;
    /**
     * 支持最大的视频物理通道 byte
     */
    private byte maxVideo;

}
