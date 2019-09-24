package 笔试题;

import java.util.Scanner;

/**
 * @Author dingxin
 * @Date 2019/8/16 12:34
 **/
public class PailieSJ {

    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i <4 ; i++) {
            Scanner scanner = new Scanner(System.in);
            int i1 = scanner.nextInt();
            arr[i]=i1;
        }
        pailie(arr);
    }

    public static void pailie(int[] arr){
        int value=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (i==j){
                    continue;
                }
                for (int k = 0; k <arr.length ; k++) {
                    if (k==i||k==j){
                        continue;
                    }
                    for (int l = 0; l <arr.length ; l++) {
                        if (l==i||l==k||l==j){
                            continue;
                        }
                        value++;
                        System.out.print(arr[i]+""+arr[j]+""+arr[k]+""+arr[l]+"  ");
                        if(value%6==0){
                            System.out.println("/n");
                        }
                    }
                }
            }
        }
    }
}
