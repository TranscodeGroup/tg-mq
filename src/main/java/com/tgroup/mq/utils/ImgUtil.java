package com.tgroup.mq.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * 
 * TG图片处理公共单元
 */
public class ImgUtil {

    /**
     * 将接收的字符串转换成图片保存
     * 
     * @param imgByte
     *            图片数据流
     * @param imgPath
     *            图片的保存路径
     * @param imgName
     *            图片的名称
     * @return 0保存失败 1保存正常
     */
    public static int saveImg(byte[] imgByte, String imgPath, String imgName) {
        int state = 0;
        if (imgByte != null && imgByte.length > 0) {
            try {
                InputStream in = new ByteArrayInputStream(imgByte);
                // 路径不存在先创建
                if (!new File(imgPath).exists()) {
                    new File(imgPath).mkdirs();
                }
                File file = new File(imgPath, imgName);// 可以是任何图片格式.jpg,.png等
                FileOutputStream fos = new FileOutputStream(file);

                byte[] b = new byte[1024];
                int nRead = 0;
                while ((nRead = in.read(b)) != -1) {
                    fos.write(b, 0, nRead);
                }
                fos.flush();
                fos.close();
                in.close();
                state = 1;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
        }
        return state;
    }

}