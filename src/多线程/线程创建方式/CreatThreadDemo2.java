package 多线程.线程创建方式;

/**
 * @Author dingxin
 * @Date 2019/8/18 19:18
 * 实现runnable接口,作为线程任务存在
 **/
public class CreatThreadDemo2 implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("线程执行了...");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //将线程任务传给线程对象
        Thread thread = new Thread(new CreatThreadDemo2());
        //启动线程
        thread.start();
    }
}
