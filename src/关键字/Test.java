package 关键字;


//类中代码执行顺序
public class Test {

    public Test() {
        System.out.print("默认构造方法！--");
    }

    //非静态代码块
    {
        System.out.print("非静态代码块！--");
    }

    //静态代码块
    static {
        System.out.print("静态代码块！--");
    }

    public static void test() {
        System.out.print("静态方法中的内容! --");
        {
            System.out.print("静态方法中的代码块！--");
        }
    }

    public static void main(String[] args) {

        Test test = new Test();
        Test.test();

        //第二次new只执行了非静态代码块,静态代码块一次只执行一次
        Test test2 = new Test();
    }
}
