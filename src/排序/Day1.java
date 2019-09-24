package 排序;

import java.util.Arrays;

/**
 * @Author dingxin
 * @Date 2019/8/15 15:58
 **/
public class Day1 {


    public static void main(String[] args) {
       int [] arr=new int[8];
        arr[0]=9;
        arr[1]=2;
        arr[2]=3;
        arr[3]=6;
        arr[4]=7;
        arr[5]=1;
        arr[6]=7;
        arr[7]=8;

        maopao(arr);

        System.out.println(Arrays.toString(arr));

    }


    public static void maopao(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {  //表示趟数
            for (int j = 0; j <arr.length-1-i ; j++) {     //内层循环控制每一趟排序多少次
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
