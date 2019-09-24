package litterTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Demo5 {
    //如何格式化日期？
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dat=new Date();
        //把日期转化为字符串
        String str=sdf.format(dat);
        System.out.println(str);
    }
}
