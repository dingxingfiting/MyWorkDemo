package 多线程;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Author dingxin
 * @Date 2019/8/8 20:52
 **/
public class CallableDemo {

    public static void main(String[] args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Random random = null;

                return ""+ random.nextInt(100);

            }
        };
    }
}
