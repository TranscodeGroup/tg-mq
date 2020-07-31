package com.tgroup.mq.pojo;

import lombok.Data;

/**
 * 乘客计数项
 * 
 * @author eason
 * @date 2020/07/22
 */
@Data
public class Passenger {
    /**
     * 门编号
     */
    private Integer doorId;
    /**
     * 上客数
     */
    private Integer getOn;
    /**
     * 下客数
     */
    private Integer getOff;
}
