package dell.Day02_0805;

import java.util.Scanner;
/*
输入任意一个整数 判断是奇数还是偶数
 */
public class if_demo01 {
    public static void main(String[] args) {
        System.out.print("请输入你要测试的数：");
        //接收从键盘中输入的值
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        //对2取余数 判断是否是奇数还是偶数
        if (i%2 == 0){
            System.out.println("您输入的数是偶数");
        }else {
            System.out.println("您输入的数是奇数");
        }
    }
}
