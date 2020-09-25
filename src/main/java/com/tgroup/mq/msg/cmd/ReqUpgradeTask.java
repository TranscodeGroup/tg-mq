package com.tgroup.mq.msg.cmd;

import lombok.Data;

/**
 * 请求升级任务
 * 
 * @author eason
 * @date 2020/09/25
 */
@Data
public class ReqUpgradeTask {

    /**
     * 需要升级的IMEI
     */
    private String imei;

    /**
     * 升级设备的KEY
     */
    private String key;

}
