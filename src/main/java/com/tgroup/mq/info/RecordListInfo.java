package com.tgroup.mq.info;

import com.tgroup.mq.pojo.RecDetail;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询音视频文件列表-应答
 * 
 * @author eason
 * @date 2020/07/20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RecordListInfo extends AbstractInfo {
    /**
     * 资源总数 DWORD
     */
    private int total;

    /**
     * 资源列表 28*n
     */
    private RecDetail[] rows;

}
