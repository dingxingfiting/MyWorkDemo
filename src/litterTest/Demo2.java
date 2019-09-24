package litterTest;

import java.util.Calendar;

public class Demo2 {
    //如何取得年月日，小时分秒？
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,0);
        c.set(Calendar.DAY_OF_MONTH,31);
        System.out.println(c.get(Calendar.YEAR)+"  "+(c.get(Calendar.MONTH)+1)+"  "+c.get(Calendar.DAY_OF_MONTH));
        
    }
}
