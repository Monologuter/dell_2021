package dell.Day04_0807.test;

/**
 * @Author 马小姐
 * @Date 2020/8/7 16:17
 * @Version 1.0
 * @Description:
 */
/*
* 遍历二维数组求出所有元素的值
*
* */
public class Test2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3},{5,6,7},{7,8,9}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("二维数组所有元素的和为："+sum);

    }
}
