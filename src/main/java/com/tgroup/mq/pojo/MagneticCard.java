package com.tgroup.mq.pojo;

import org.springframework.util.StringUtils;

import lombok.Data;

/**
 * 泰国磁条卡
 * 
 * @author eason
 * @date 2020/12/24
 */
@Data
public class MagneticCard {
    /**
     * 完整数据
     */
    private String cardInfo;
    /**
     * 姓
     */
    private String firstName;
    /**
     * 名
     */
    private String lastName;
    /**
     * 尊称
     */
    private String mister;
    /**
     * 国家代码
     */
    private String country;
    /**
     * 身份证
     */
    private String personal;
    /**
     * 有效期
     */
    private String expire;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 卡类型
     */
    private String cardType;
    /**
     * 性别
     */
    private String sex;
    /**
     * 卡号
     */
    private String carId;
    /**
     * 区域代码
     */
    private String placeCode;

    public MagneticCard() {}

    public MagneticCard(String rfid) {
        if (StringUtils.isEmpty(rfid)) {
            return;
        }
        String tmp = rfid;
        // 完整姓名
        String fullName;
        int begin;
        int end;
        // full name
        begin = tmp.indexOf('%', 0);
        end = tmp.indexOf('?', 0);
        fullName = tmp.substring(begin + 1, end);
        // 名字使用$或者空格分割
        if (fullName.indexOf('$', 0) >= 0) {
            // SURENAME
            begin = tmp.indexOf('^', 0);
            end = tmp.indexOf('$', 0);
            firstName = tmp.substring(begin + 1, end);
            // NAME
            tmp = tmp.substring(end);
            begin = tmp.indexOf('$', 0);
            end = tmp.indexOf('$', 1);
            lastName = tmp.substring(begin + 1, end);
            // TITLE
            tmp = tmp.substring(end);
            begin = tmp.indexOf('$', 0);
            end = tmp.indexOf('^', 1);
            mister = tmp.substring(begin + 1, end);
        } else {
            String[] names = fullName.trim().split("\\s+");
            firstName = names[0];
            lastName = names[1];
            mister = names[2];
        }

        // COUNTRY
        tmp = tmp.substring(end);
        begin = tmp.indexOf(';', 0);
        end = begin + 7;
        country = tmp.substring(begin + 1, end);
        // PERSONAL
        tmp = tmp.substring(end);
        begin = 0;
        end = tmp.indexOf('=', 0);
        personal = tmp.substring(begin, end);
        // EXPIRE
        tmp = tmp.substring(end);
        begin = 0;
        end = begin + 5;
        expire = tmp.substring(begin + 1, end);
        // BIRTHDAY
        tmp = tmp.substring(end);
        begin = 0;
        end = begin + 8;
        birthday = tmp.substring(begin, end);
        // OTHER
        end = tmp.indexOf('+', 0);
        tmp = tmp.substring(end + 1);
        String tmpStr = "";
        int j = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if ((tmp.charAt(i) != ' ') && (tmp.charAt(i) != '?')) {
                tmpStr += tmp.charAt(i);
            } else {
                if (!tmpStr.trim().equals("")) {
                    switch (j) {
                        case 0:
                            cardType = tmpStr;
                            break;
                        case 1:
                            sex = tmpStr;
                            break;
                        case 2:
                            carId = tmpStr;
                            break;
                        case 3:
                            placeCode = tmpStr;
                            break;
                        default:
                            break;
                    }
                    j++;
                    tmpStr = "";
                }
            }
        }
        cardInfo = rfid.replace((char)0x0d, ' ').replace((char)0x0a, ' ');
    }
}
