package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 客流数据上报
 * 
 * @author eason
 * @date 2020/05/28
 */
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqPassenger extends MqDeviceData {

    /**
     * 开始时间
     */
    private long startTime;
    /**
     * 结束时间
     */
    private long endTime;
    /**
     * 上车人数
     */
    private int upNumber;
    /**
     * 下车人数
     */
    private int downNumber;
    /**
     * 车厢内人数
     */
    private int inCarNumber;
    /**
     * 上传时间
     */
    private long uploadTime;

}
