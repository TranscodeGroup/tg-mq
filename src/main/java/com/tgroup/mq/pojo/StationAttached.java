package com.tgroup.mq.pojo;

import lombok.Data;

/**
 * 进出站附加
 * 
 * @author eason
 * @date 2021/09/20
 */
@Data
public class StationAttached {

    /**
     * 进站，计算上一站到本站用时,秒
     */
    private Integer driving;

    /**
     * 进站，计算上一站到本站距离,千米
     */
    private Double km;

    /**
     * 出站, 计算停靠时长,秒
     */
    private Integer stop;

    /**
     * 时区, 默认东八区
     */
    private String tz;

}
