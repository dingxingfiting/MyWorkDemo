package 集合数组;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest02 {

    public static void main(String[] args) {

        int[] myArray = { 1, 2, 3 };
        List myList = Arrays.asList(myArray);
        System.out.println(myList.size());
        //1
        System.out.println(myList.get(0));
        //数组地址值
        //System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
        int [] array=(int[]) myList.get(0);
        System.out.println(array[2]);
        //1
        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        System.out.println(list);
        Collections.reverse(list);
        s=list.toArray(new String[0]);
        System.out.println("调用Collections.reverse方法反转后的数组s=");
        for (String i:s
             ) {
            System.out.print(i+".");

        }
        //没有指定类型的话会报错


    }
}
