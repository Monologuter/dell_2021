package dell.Day04_0807.test;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/7 15:17
 * @Version 1.0
 * @Description:
 */

/*
* 获取二维数组指定下标的元素值
*
*
*
* */
public class TwoDimensionArray_Demo02 {
    public static void main(String[] args) {

        int[][] array = new int[][]{{1,2,3},{5,6,7},{7,8,9}};
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int p = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }
        }
        System.out.println(array[k-1][p-1]);
    }
}
