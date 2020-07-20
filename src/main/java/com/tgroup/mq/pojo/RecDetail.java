package com.tgroup.mq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 录像文件信息
 * 
 * @author eason
 * @date 2020/05/27
 */
@Data
public class RecDetail {
    /**
     * 逻辑通道号 byte
     */
    private short chn;
    /**
     * 开始时间 BCD6 start time
     */
    private long st;
    /**
     * 结束时间 BCD6 end time
     */
    private long et;
    /**
     * 报警状态位 8 byte warn
     */
    @JsonProperty("w")
    private long warn;

    /**
     * 音视频资源属性 0音视频 1音频 2视频 3视频或音频 byte
     */
    private byte av;
    /**
     * 0所有码流 1主码流 2次码流 byte steam
     */
    private byte sm;
    /**
     * 0所有存储器 1主存储器 2灾备存储器 byte storage
     */
    private byte se;
    /**
     * 文件大小,单位字节 DWORD file size
     */
    private long fs;

}
