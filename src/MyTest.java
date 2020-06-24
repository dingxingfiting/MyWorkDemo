import org.junit.Test;
/**
 * @author Administrator
 */
public class MyTest {

    public static void main(String[] args) {

        //打印*号三角形
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");
            }
            //
            for (int k = 0; k <=i*2 ; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    @Test
    public void test() {
        System.out.println("测试test注解");
    }




}