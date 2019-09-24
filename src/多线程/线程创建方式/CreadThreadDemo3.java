package 多线程.线程创建方式;

/**
 * @Author dingxin
 * @Date 2019/8/18 19:29
 **/
public class CreadThreadDemo3 {
    public static void main(String[] args) {
        //创建无参线程对象
        new Thread(){
            @Override
            public void run() {
                System.out.println("线程执行了....");
            }
        }.start();

        //创建带线程任务的线程对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行了....");
            }
        }).start();

        //创建带线程任务并且重写run方法的线程对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run 线程执行了...");
            }
        })
        {
            @Override
            public  void  run(){
                System.out.println("Override run 线程执行了...");
            }
        }.start();
    }
}
