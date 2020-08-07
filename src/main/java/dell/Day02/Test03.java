package dell.Day02;

import java.util.Scanner;

/*
i是你输入的数
k是i的算是平方根

 */
public class Test03 {
    public static void main(String[] args) {
        boolean isPrime = true;  //默认为一个素数
        System.out.print("请输入：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
//        if (i>0){
//            int k = (int)Math.sqrt(i);
//            for (int j = 2; j < k; j++) {
//                if(i % j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println("素数");
//        }else {
//            System.out.println("不是素数");
//        }

//        for (int j = 2; j < i / 2 + 1; j++) {
        for (int j = 2; j <= (int)Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(i+"是素数");
        }else {
            System.out.println(i+"不是素数");
        }

    }
}
