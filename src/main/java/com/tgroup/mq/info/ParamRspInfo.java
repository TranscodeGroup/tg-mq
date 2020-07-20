package com.tgroup.mq.info;

import com.tgroup.mq.pojo.ParamInfo;

/**
 * 查询终端参数-应答
 * 
 * @author eason
 * @date 2020/07/20
 */
public class ParamRspInfo extends AbstractInfo {
    /**
     * 应答参数个数
     */
    private int size;

    /**
     * 应答参数明细
     */
    private ParamInfo[] params;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ParamInfo[] getParams() {
        return params;
    }

    public void setParams(ParamInfo[] params) {
        this.params = params;
    }

}
