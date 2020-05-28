package com.tgroup.mq.pojo;

/**
 * 温度传感器
 * 
 * @author eason
 *
 */
public class Temperature {
    /**
     * 传感器ID
     */
    private Integer id;

    /**
     * 温度
     */
    private Double temp;

    @Override
    public String toString() {
        return "Temperature [id=" + id + ",temp=" + temp + "]";
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
