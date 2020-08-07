package dell.Day03_0806;

import java.util.*;

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
        System.out.println("请输入数组的长度：");
        Scanner sc = new Scanner(System.in);

        //num表示初始的时候数组的长度
        int num = sc.nextInt();
        int[] Array = new int[num];


        System.out.print("请输入"+num+"个数：");
        for (int i = 0; i <Array.length ; i++) {
            Array[i] = sc.nextInt();
        }

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

        System.out.println("\n");
        System.out.println("请输入你想要插入的数字个数：");
        int numSecond = sc.nextInt();
        System.out.print("我想要插入"+numSecond+"个数：");



        for (int i = 0; i <Array.length+numSecond ; i++) {
            Array[i] = sc.nextInt();
        }

        Arrays.sort(Array);//Arrays是util包
        for(int j : Array){
        }

        /*
        * 下面插入操作没有做出来 数组一旦创建数组的长度就不可改变
        * 应该使用集合做插入数据操作
        *
        *
        *
        * */

        for (int n = 0;  n<=Array.length-1+numSecond ; n++) {
            if (n==0){
                System.out.print("打印出来的数组为："+"["+Array[0]+",");
            }else{
                if(n==Array.length-1+numSecond){
                    System.out.print(Array[n]+"]");
                }else if(n<Array.length-1+numSecond){
                    System.out.print(Array[n]+",");
                }
            }
        }


    }
}
