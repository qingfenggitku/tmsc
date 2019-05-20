package cn.jlw.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Description:随机生成16位订单号
 * @Author: 杨轩
 * @CreateDate: 2019/4/17 13:04
 */
public class OrderId {
    public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="";
        Random random=new Random();
        for(int i=1;i<3;i++){
            result+=random.nextInt(10);
         }
        return newDate+result;
        }
}
