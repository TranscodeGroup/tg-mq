package com.tgroup.mq;

/**
 * REIDS订阅消息结构
 * @author YI
 */
public class MqMessage {
    /**
     * 指令头
     */
    private MqHeader header;
    /**
     * 指令数据体
     */
    private Object data;
    
    public MqHeader getHeader() {
        return header;
    }

    public void setHeader(MqHeader header) {
        this.header = header;
    }

    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "RedisMessage [header=" + header + "]";
    }
}
