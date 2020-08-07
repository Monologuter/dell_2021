package dell.Day01;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        System.out.print("请输入多少小时：");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
//        System.out.println("输入的数据为："+ b);
        //输入一个数 判断是不是水仙花数
//        int c = b / 100;   //百位数
//        int d = (b / 10) %  10;   //十位数
//        int e = b % 10;      //个位数
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        if ((c*c*c + d*d*d + e*e*e) == b){
////            System.out.println(b + "是水仙花数");
////        }else {
////            System.out.println(b + "不是水仙花数");
////        }

        int x = b / 24;
        int y = b%24;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+"天"+y+"小时");

    }
}
