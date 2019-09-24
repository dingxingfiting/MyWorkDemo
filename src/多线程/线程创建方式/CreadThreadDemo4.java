package 多线程.线程创建方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author dingxin
 * @Date 2019/8/18 22:10
 * 创建带返回值的线程
 **/
public class CreadThreadDemo4 implements Callable {
    @Override
    public Object call() throws Exception {
        int result=1;
        System.out.println("业务逻辑计算中...");
        Thread.sleep(1000);

        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CreadThreadDemo4 demo4 = new CreadThreadDemo4();
        FutureTask<Integer> task = new FutureTask<Integer>(demo4);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("我可以在这里做点别的业务逻辑...因为Future是提前完成任务");
        //拿出线程执行的返回值
        Integer result=task.get();
        System.out.println("线程中运算的结果为: " + result);

    }
}
