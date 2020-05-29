package com.tgroup.mq.msg.safety;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 报警文件上传完成通知
 * 
 * @author eason
 * @date 2020/05/29
 */
@Setter
@Getter
@ToString(callSuper = true)
public class MqAlarmFileComplete {
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 文件类型
     */
    private Integer fileType;
    /**
     * 文件大小
     */
    private Integer fileSize;
    /**
     * 物理路径
     */
    private String absolutePath;
    /**
     * 相对路径
     */
    private String relativePath;
}
