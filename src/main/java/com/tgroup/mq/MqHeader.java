package com.tgroup.mq;

import java.util.HashMap;

import lombok.Data;

/**
 * REDIS订阅消息头
 * 
 * @author YI
 */
@Data
public class MqHeader {
    /**
     * 指令
     */
    private String cmd;
    /**
     * 发送者标识
     */
    private String sender;
    /**
     * 目标标识
     */
    private String target;
    /**
     * 流水号 从0开始 0-MaxInt
     */
    private int serial;
    /**
     * 发送时间
     */
    private long time;

    /***
     * 扩展信息
     */
    private HashMap<String, Object> properties;
}
