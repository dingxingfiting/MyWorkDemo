package litterTest;

import java.util.Calendar;

import static java.lang.StrictMath.max;

public class Main {

    public static void main1() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());
        test();

    }

    public static void main(String[] args) {
        //死循环,会报出StackOverflowError
        main1();
    }



    private static  void  test(){
        int max = max(1,2);
        System.out.println(max);

        main1();
    }
}
