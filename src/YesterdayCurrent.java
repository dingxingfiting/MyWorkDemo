import java.util.Calendar;
//如何获得去年的今天
public class YesterdayCurrent {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        System.out.println(cal.getTime());
    }
    }
