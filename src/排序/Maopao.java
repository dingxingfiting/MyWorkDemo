package 排序;

import java.util.Scanner;

/**
 * @Author dingxin
 * @Date 2019/8/14 11:58
 **/
public class Maopao {

    public static void main(String[] args) {
        int[] arr=new int[8];
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            Scanner scanner = new Scanner(System.in);
            int sc=scanner.nextInt();
            arr[i]=sc;
        }
/*
        arr[0]=9;
        arr[1]=2;
        arr[2]=3;
        arr[3]=6;
        arr[4]=7;
        arr[5]=1;
        arr[6]=7;
        arr[7]=8;
*/

        Day1.maopao(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }


}
