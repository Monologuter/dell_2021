package MyselfTest.Test_0805;
/*
  从键盘中输入一个数 判断是奇数还是偶数
*/

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.print("请大侠随意输入一个数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println(a+"是偶数");
        }else {
            System.out.println(a+ "是奇数");
        }

    }
}
