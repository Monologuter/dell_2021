package MyselfTest.Test_0817;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/17 19:12
 * @Version 1.0
 * @Description:
 */
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        int b;
        while (sc.hasNextInt()){
             a = sc.nextInt();
             b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
