package dell.Day01.Night;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        double b = 0.0001f;
        System.out.print("请输入你的月薪:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a <= 10){
            b = a*1.1;
        }else if (a <= 20) {
            b = 10 * 1.1 + (a-10)*1.075;
        }else if (a <= 40){
            b = 10 * 1.1+(a-10)*1.075 + (a-20)*1.05;
        }else if (a <= 60) {
            b = 10 * 1.1+(a-10)*1.075 + (a-20)*1.05 + (a-40)*1.03;
        }else if(a <= 100){
            b = 10 * 1.1+(a-10)*1.075 + (a-20)*1.05 + (a-40)*1.03 + (a-60)*1.015;
        }else{
            b = 10 * 1.1+(a-10)*1.075 + (a-20)*1.05 + (a-40)*1.03 + (a-60)*1.015 + (a-100)*1.01;
        }
        System.out.println("应该发放的奖金金额为:"+b+"万元");

    }
}
