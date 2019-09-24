package 笔试题;

import java.util.Scanner;

/**
 * @Author dingxin
 * @Date 2019/8/16 11:51
 **/
public class Pailie {

    public static void main(String[] args){
        int [] arr = new int [4];
        for(int i =0 ; i<arr.length ; i++){
            Scanner sc =new Scanner(System.in);
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }

        Pai(arr);
    }

    public static void Pai(int [] arr){
        int value=0;
        for(int i =0 ; i<arr.length;i++){
            for(int j =0 ; j<arr.length;j++){
                if(i==j){
                    continue;
                }
                for(int k =0 ; k<arr.length;k++){
                    if(k==i||k==j){
                        continue;
                    }
                    for(int z=0 ; z<arr.length;z++){
                        if(z==i||z==j||z==k){
                            continue;
                        }
                        value++;
                        System.out.print(arr[i]+""+arr[j]+""+arr[k]+""+arr[z]+"  ");
                        if(value%6==0){
                            System.out.println("/n");
                        }
                    }
                }
            }
        }
    }
}