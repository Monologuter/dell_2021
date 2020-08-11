package dell.Day04;

import java.util.Arrays;

/**
 * @Author 马小姐
 * @Date 2020/8/7 9:42
 * @Version 1.0
 * @Description:
 */

/*
* 数组的冒泡排序：
*   无序数组：[11,15,14,23,34,35,65,42];
* */
public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[]{20,2,4,34,23,21,7,3};
        Sort(arr);
    }

    //冒泡排序
    public static  void Sort(int[]  arr) {
        //外层的循环的次数
        for (int i = 0; i < arr.length; i++) {
//            每次循环之后下次需要村换的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= tmp;
                }
            }

//            System.out.println(arr[i]);
        }


        //按照规定的格式打印数组
        System.out.println("打印规整的数组："+Arrays.toString(arr));

        //下面是按照规则打印数组 不为啥就是为了好看 规整  不要好看一句print就好了
        for (int n = 0;  n<=arr.length-1 ; n++) {
            if (n==0){
                System.out.print("打印出来的数组为："+"["+arr[0]+",");
            }else{
                if(n==arr.length-1){
                    System.out.print(arr[n]+"]");
                }else if(n<arr.length-1){
                    System.out.print(arr[n]+",");
                }
            }
        }

        System.out.println();

        //寻找数组的中位数
        for (int k = 0; k <arr.length-1 ; k++) {
            double middle ;
            if (arr.length % 2 ==0){
                middle = arr[arr.length/2 -1] + arr[(arr.length/2)];
                System.out.println("中位数："+middle/2);
                break;

            }else {
                middle = (arr[arr.length/2]) ;
                System.out.println("中位数："+middle);
                break;
            }
        }


    }
}
