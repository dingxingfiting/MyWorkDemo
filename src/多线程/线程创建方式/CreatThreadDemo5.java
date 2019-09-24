package 多线程.线程创建方式;


import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author dingxin
 * @Date 2019/8/18 22:24
 * 定时器Timer
 **/
public class CreatThreadDemo5 {

    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时器线程执行了...");
            }
        }, 0, 1000);   //延迟0，周期1s


    }
}