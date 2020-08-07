package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件上传
 * 
 * @author eason
 * @date 2020/08/06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MqFileUpload extends MqDeviceData {

    /** KEY */
    private String key;

    /** 状态 0初始化 1下载中 2完成 3失败 */
    private Integer state;

    /** socket会话ID */
    private String session;

    /** 应答流水号 **/
    private Integer serial;

    /** 文件路径 **/
    private String path;

}
