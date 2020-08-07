package dell.Day02;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        int b = 0;
        int max = 0;
        int min = 0;
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            System.out.print("请输入：");
            int a =sc.nextInt();
            b+=a;
            if (i == 0){
                max = a;
                min = a ;
            }else {
                if (a > max) {
                    max = a;
                }else if (a < min) {
                    min = a;
                }
            }
        }
        System.out.println("五个数的和为"+b);
        System.out.println("最大值为"+max);
        System.out.println("最小值为"+min);
    }
}
