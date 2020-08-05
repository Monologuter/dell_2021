package dell.Day02_0805;
/*
从键盘中输入2019年的月份序号和天数序号
算出该日期是2019年的第几天

 */
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {



        int month ;   //你输入的月份序号
        int day;     //你输入的日期序号
        int dayFirst = 0;  //初始的时候天数
        System.out.print("请输入你的月份序号：");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        System.out.print("请输入你的天数序号：");
        Scanner sc1 = new Scanner(System.in);
        day = sc1.nextInt();
        switch (month){
            case 12:
                dayFirst += 30;
            case 11:
                dayFirst += 31;
            case 10:
                dayFirst += 30;
            case 9:
                dayFirst += 31;
            case 8:
                dayFirst += 31;
            case 7:
                dayFirst += 30;
            case 6:
                dayFirst += 31;
            case 5:
                dayFirst += 30;
            case 4:
                dayFirst += 31;
            case 3:
                dayFirst += 29;
            case 2:
                dayFirst += 31;
            case 1:
                break;
        }
        day = day+dayFirst;

        System.out.println("你输入的日期为2019年的第"+ day + "天");
    }
}
