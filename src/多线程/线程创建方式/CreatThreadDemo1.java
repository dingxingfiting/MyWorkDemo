package 多线程.线程创建方式;

/**
 * @Author dingxin
 * @Date 2019/8/18 17:43
 * 继承Thread类,作为线程对象存在(继承Thread对象)
 **/
public class CreatThreadDemo1 extends Thread {

    public CreatThreadDemo1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(!interrupted()){
            System.out.println(getName()+"线程执行了...");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CreatThreadDemo1 demo1 = new CreatThreadDemo1("线程一");
        CreatThreadDemo1 demo2 = new CreatThreadDemo1("线程二");

        demo1.start();
        demo2.start();

        demo2.interrupt();



    }
}
