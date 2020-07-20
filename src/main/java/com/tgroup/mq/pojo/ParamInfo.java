package com.tgroup.mq.pojo;

import lombok.Data;

/**
 * 终端参数
 * 
 * @author eason
 * @date 2020/05/27
 */
@Data
public class ParamInfo {
    /**
     * 参数ID +2
     */
    private long id;

    /**
     * 参数值
     */
    public Object value;

}
