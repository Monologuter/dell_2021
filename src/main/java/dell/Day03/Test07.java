package dell.Day03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/6 17:16
 * @Version 1.0
 * @Description:
 */
/*
* 向有序的数组中插入一个数  使得插入后的数组仍然有序
*
* */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入初始化数组元素的个数：");
        Scanner sc = new Scanner(System.in);

        //num表示初始的时候数组的长度
        int num = sc.nextInt();
        int[] Array = new int[num+1];

        System.out.println("数组长度为："+Array.length);


        System.out.print("请输入"+num+"个数：");
        for (int i = 0; i <Array.length ; i++) {
            Array[i] = sc.nextInt();
        }

        //数组排序
        Arrays.sort(Array);//Arrays是util包
        for(int j : Array){
        }

        for (int n = 0;  n<=Array.length-1 ; n++) {
            if (n==0){
                System.out.print("打印出来的数组为："+"["+Array[0]+",");
            }else{
                if(n==Array.length-1){
                    System.out.print(Array[n]+"]");
                }else if(n<Array.length-1){
                    System.out.print(Array[n]+",");
                }
            }
        }



        //克隆数组  clone(); 方法
        int  ArraySecond [] = Array.clone();


    }
}
