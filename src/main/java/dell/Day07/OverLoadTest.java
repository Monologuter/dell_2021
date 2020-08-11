package dell.Day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/11 9:01
 * @Version 1.0
 * @Description:方法的重载
 */
/*

* 数组工具类
*代码的封装
*
* 求最大值
* 最小值
* 平均数
* 中位数
* 数组逆序
* 数组排序
* 数组复制
* 数组遍历打印
* 在数组中找出给定值下标
*
 */

public class OverLoadTest {
    public static void main(String[] args) {
        int[] array = new int[]{11,33,56,78,90,12};
        arrMax(array);
        arrMin(array);
        Sum(array);
        midArray(array);
        sortArray(array);
        arrayCopy(array);
        getMumber(array);


    }

    //数组的最大值
    public static  void arrMax(int array[]){
        int index = 0;
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("最大值为："+max);
        System.out.println("最大值下标为："+index);
    }

    //数组的最小值
    public static  void arrMin(int array[]){
        int index = 0;
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<min){
                min = array[i];
                index = i;
            }
        }
        System.out.println("最小值为："+min);
        System.out.println("最小值下标为："+index);
    }

    //数组的求和
    public static  void Sum(int array[]){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        System.out.println("数组的和为："+sum);
    }



    //数组的中位数
    public static  void midArray(int arr[]){
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


    //数组的排序
    public static  void sortArray(int arr[]){
        Arrays.sort(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }


    //数组的复制
    public static  void arrayCopy(int arr[]) {
        int[] arraydemo =  new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arraydemo[i] = arr[i];
            System.out.print(arr[i]+ " ");
        }
    }


    //找出指定元素的下标
    public static  void getMumber(int array[]){
        int index = -1;    //-1代表找不到
        System.out.println("请输入需要查找的元素：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==num){
                index = i;
            }
        }
        System.out.println("需要查找的元素下标为："+index);
    }
}


