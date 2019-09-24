package 关键字;

/**
 * @Author dingxin
 * @Date 2019/9/18 12:07
 **/
public class StaticTest {

    int a=100;
    static int b=112;
    static StaticTest st=new StaticTest();

    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }


    public static void main(String[] args) {
        staticFunction();
    }


    StaticTest() {
        System.out.println("3");
        System.out.println("a="+a+"b="+b);
    }


    public static void staticFunction() {
        System.out.println("4");
    }



}
