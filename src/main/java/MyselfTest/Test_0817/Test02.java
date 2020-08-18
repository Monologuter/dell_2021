package MyselfTest.Test_0817;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/17 19:24
 * @Version 1.0
 * @Description: 求整数n之内所有元素的和
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }

    public static  int sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
