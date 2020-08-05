package dell.Day02_0805;

import java.util.Scanner;

public class switch_demo02 {
    public static void main(String[] args) {
        System.out.print("请输入你的身高,单位cm：");
        Scanner sc = new Scanner(System.in);
        double hgiht =  sc.nextDouble();

        System.out.print("请输入你的财富,单位万元：");
        Scanner sc1 = new Scanner(System.in);
        double money = sc1.nextDouble();

        System.out.print("你是不是很帅？1代表是2代表不是：");
        Scanner sc2 = new Scanner(System.in);
        int appearance = sc2.nextInt();

        if(hgiht>180 && money>1000 && appearance == 1){
            System.out.println("爱了爱了");
        }else if(hgiht <180 && money <1000 && appearance != 1){
            System.out.println("从我的视线里消失！");
        }
        else{
            System.out.println("勉强嫁了吧！");
        }


    }
}
