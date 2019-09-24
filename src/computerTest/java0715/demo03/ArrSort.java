package computerTest.java0715.demo03;

public class ArrSort {

    public static void main(String[] args) {
        int[] arr={0,5,8,6,7,2,1,7,2,47};
        insertionSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }


    //冒泡排序基本思想：两个数比较大小，较大的数下沉，较小的数冒起来。
   public static void bubbleSort(int[] arr){
       for (int i = 0; i < arr.length; i++) { //表示趟数，一共arr.length-1次。
           for (int j = arr.length-1; j >i; j--) {

               if (arr[j]<arr[j-1]){
                   int temp = arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               }

           }

       }
   }



   /*
   选择排序基本思想
   在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
   第二次遍历n-2个数，找到最小的数值与第二个元素交换；
    。。。
   第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成。*/
   public static void selctionSort(int[] arr){
       for (int i = 0; i <arr.length-1 ; i++) {
           int minIndex=i;
           for (int j = i+1; j <arr.length ; j++) {
               if (arr[j]<arr[minIndex]){
                   minIndex=j;
               }
           }
           if (minIndex!=i){
               int temp=arr[i];
               arr[i]=arr[minIndex];
               arr[minIndex]=temp;
           }
       }

   }



  /* 插入排序基本思想
    在要排序的一组数中，假定前n-1个数已经排好序，
    现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。
    如此反复循环，直到全部排好顺序。
   */
    public static void insertionSort(int array[]){

        int temp;

        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j] < array[j-1]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }else{         //不需要交换
                    break;
                }
            }
        }
    }

}
