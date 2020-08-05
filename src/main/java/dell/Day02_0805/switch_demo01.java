package dell.Day02_0805;

import java.util.Scanner;

/*

switch ......case  用于多分支比较
switch(参数){
    case1: 比较值1：
    code1;
    break;

    case1: 比较值1：
    code1;
    break;


    case1: 比较值1：
    code1;
    break;


    default :
    code;
}
 */
public class switch_demo01 {
    public static void main(String[] args) {
        System.out.print("请输入1-7之间的整数:");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("今天是星期一");
                break;
            case 2 :
                System.out.println("今天是星期二");
                break;
             case 3 :
                 System.out.println("今天是星期三");
                 break;
             case 4 :
                 System.out.println("今日是星期四");
                 break;
             case 5 :
                 System.out.println("今天是星期五");
                 break;

            case 6:
                System.out.println("今天是星期六");
                break;
             case 7 :
                 System.out.println("今天是星期天");
                 break;
            default:
                System.out.println("你的输入不合法");
        }



    }
}
