package com.tgroup.mq;

/**
 * REDIS订阅消息头
 * @author YI
 */
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
     * 流水号 从0开始 0-65535
     */
    private int serial;
    /**
     * 发送时间
     */
    private long time;
    
    public String getCmd() {
        return cmd;
    }
    
    public void setCmd(String cmd) {
        this.cmd = cmd;
    }
    
    public String getSender() {
        return sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public String getTarget() {
        return target;
    }
    
    public void setTarget(String target) {
        this.target = target;
    }
    
    public int getSerial() {
        return serial;
    }
    
    public void setSerial(int serial) {
        this.serial = serial;
    }
    
    public long getTime() {
        return time;
    }
    
    public void setTime(long time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
        return "Header [cmd=" + cmd + ", sender=" + sender + ", target=" + target + ", serial=" + serial + ", time="
                + time + "]";
    }
}
