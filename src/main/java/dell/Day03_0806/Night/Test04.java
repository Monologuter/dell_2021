package dell.Day03_0806.Night;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/7 9:30
 * @Version 1.0
 * @Description:
 */
public class Test04 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,7,9,2,6,89};
        System.out.print("请输入需要查找的元素:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]){
                System.out.print("需要查找元素的索引为："+i);
            }
        }
    }
}
