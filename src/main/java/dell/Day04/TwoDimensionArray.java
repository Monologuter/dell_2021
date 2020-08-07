package dell.Day04;

import java.util.Arrays;

/**
 * @Author 马小姐
 * @Date 2020/8/7 15:17
 * @Version 1.0
 * @Description:
 */
/*
* 二维数组：
* 素组的数组
* 存放的方式  首先是一个一维数组
* 使用：
* 二维数组的声明和初始化
*
*
*
* */
public class TwoDimensionArray {
    public static void main(String[] args) {
        //声明
        //静态初始化
        int [] a  =  new int[]{1,2,3};  //一维数组静态初始化

        int[][] array = new int[][]{{1,2,3},{5,6,7},{7,8,9}};  //二维数组的静态初始化第一种方式
        int[][] array2 = {{1,2,3},{5,6,7},{7,8,9}};//第二种方式


        //动态初始化
        int[][] array3 = new int[4][3]; //动态初始化的第一种方式
        int[][] array4 = new int[4][];  //第二种方式

        System.out.println(array4[0]); //null
        System.out.println(array4[0][2]);//无法编译
        System.out.println(array4);//地址值

        array4[0] = new int[5];
        System.out.println(array4[0][2]);// 0



        //获取二维数组的长度
        System.out.println(array.length);
        System.out.println(array[0].length);


        //访问数组元素
        System.out.println(array[1][0]);


        //二维数组的遍历  2个for循环  看做矩阵
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]);
            }
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("================================================");


        //二维阶梯数组
        for (int i = 0; i < array4.length; i++) {
                array4[i] = new int[i+1];  //含义：给每一个数组赋值长度  下标为0的数组的长度为1  下标为1的数组长度为2
            System.out.println(Arrays.toString(array4[i]));
        }



    }
}
