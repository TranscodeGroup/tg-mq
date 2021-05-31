package com.tgroup.mq.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 
 * 表14 超速报警附加信息消息体数据格式
 *
 */
@Data
public class Speeding {
    /**
     * 位置类型0：无特定位置；1：圆形区域； 2：矩形区域；3：多边形区域；4：路段；
     */
    public Short sitetype;

    /**
     * 区域或路段ID 若位置类型为0，则该字段置0
     */
    public Long siteid;

    /**
     * 限速值 单位：km/h
     */
    public Integer limit;

    /**
     * 超速峰值速度 仅在超速报警解除时含该字段，单位：km/h
     */
    public Integer maxv;

    /**
     * 超速持续时长 仅在超速报警解除时含该字段，单位：秒
     */
    public Integer duration;

    /**
     * 磁卡信息
     */
    public String cardid;

    /**
     * 司机姓名
     */
    public String driver;
    /**
     * 超速平均速度 仅在超速报警解除时含该字段，单位：km/h
     */
    public Integer avgv; 

    @Override
    public String toString() {
        if (speedEnd()) {
            return "Speed End [limit=" + limit + ",maxv=" + maxv + ",duration=" + duration + "]";
        } else {
            return "Speed Start [limit=" + limit + "]";
        }
    }

    /**
     * 超速状态 0超速开始 1超速恢复
     * 
     */
    @JsonIgnore
    public boolean speedEnd() {
        if (maxv != null && duration != null)
            return true;
        return false;
    }

}
