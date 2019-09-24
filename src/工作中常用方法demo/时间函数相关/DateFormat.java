package 工作中常用方法demo.时间函数相关;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author dingxin
 * @Date 2019/9/19 15:26
 **/
public class DateFormat {

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat df2 = new SimpleDateFormat("HHmmssSSS");
        System.out.println(df.format(new Date()));
        System.out.println(df2.format(new Date()));
    }
}
