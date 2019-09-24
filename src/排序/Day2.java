package 排序;

/**
 * @Author dingxin
 * @Date 2019/8/15 16:27
 **/
public class Day2 {

    public static void main(String[] args) {


        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");  //输出空格
            }
            for (int j = 0; j <=2*i ; j++) {
                System.out.print("*");   //输出*
            }
            System.out.println();

        }
    }
}
