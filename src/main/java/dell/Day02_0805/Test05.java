package dell.Day02_0805;

import java.util.Scanner;

/*
键盘中输入一个十进制的数  将此十进制的数
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.print("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bytes(n);
    }

    public static  void  bytes(int n){
        String str = "";
        while (n != 0) {
            str = n%2 + str;
            n = n/2;
        }
        System.out.println(str);
    }
}
