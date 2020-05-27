package com.tgroup.mq.msg;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tgroup.mq.MqHeader;

/**
 * MQ消息体,回写消息头,方便业务
 * 
 * @author eason
 * @date 2020/05/27
 */

public abstract class BaseMqData {

    @JsonIgnore
    private MqHeader header;

    public MqHeader getHeader() {
        return header;
    }

    public void setHeader(MqHeader header) {
        this.header = header;
    }
}
