package com.tgroup.mq.msg.device;

import com.tgroup.mq.msg.MqDeviceData;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 设备切换线路上报
 * 
 * @author eason
 * @date 2020/05/28
 */

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class MqChangeRoute extends MqDeviceData {

    /** 切换类型 1手动切换 2平台下发命令切换 **/
    private short chgType;

    /** 切换前线路编号 **/
    private long orgRoute;

    /** 切换前上下行 */
    private short orgDir;

    /** 切换前站点序号 **/
    private short orgSerial;

    /** 切换后线路编号 **/
    private long destRoute;

    /** 切换后上下行 */
    private short destDir;

    /** 切换后站点序号 **/
    private short destSerial;

    /** 补传标志 0首次发送 1补发 **/
    private short flag;
}
