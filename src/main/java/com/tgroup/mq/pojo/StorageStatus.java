package com.tgroup.mq.pojo;

import lombok.Data;

/**
 * 存储器状态
 * 
 * @author eason
 * @date 2020/12/02
 */
@Data
public class StorageStatus {

    /**
     * 存储类型
     */
    private Short type;
    /**
     * 状态
     */
    private Short status;
    /**
     * 总容量
     */
    private Integer total;
    /**
     * 剩余容量
     */
    private Integer surplus;

}
