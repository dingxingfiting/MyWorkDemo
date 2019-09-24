package litterTest;

import java.util.Calendar;

public class Demo4 {
    /*
     * 如何获取某个日期是当月的最后一天？
     *当前日期加一天，若当前日期与结果的月份不相同，就是最后一天。
     *取下一个月的第一天，下一个月的第一天-1
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DAY_OF_MONTH, 31);
        Calendar c1 = (Calendar) c.clone();
        System.out.println(c.get(Calendar.YEAR) + "  " + (c.get(Calendar.MONTH) + 1) + "  " + c.get(Calendar.DAY_OF_MONTH));
        c.add(Calendar.DAY_OF_MONTH, 1);
        if (c.get(Calendar.MONTH) != c1.get(Calendar.MONTH)) {
            System.out.println("是最后一天");
        }
    }
}
