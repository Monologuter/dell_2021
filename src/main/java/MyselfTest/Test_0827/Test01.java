package MyselfTest.Test_0827;

import java.util.Random;
import java.util.Scanner;

/**
 * 二分法猜数小游戏
 *
 * @author 马小姐
 * @create 2020-08-27 15:12
 *
 * 首先是要产生一个随机数  并且不再变化 用Random中的nextInt方法
 * 需要键盘输入  所以需要Scanner函数
 * 接收从键盘中输入的数字 用Scanner当中的NextInt方法
 * 已经得到了两个数字 判断一三种情况
 * 如果太大或者太小就重试提示再来一次    正确  游戏结束
 *
 *
 *
 **/
public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while ( true ) {
            System.out.println("请输入你要猜测的数字");
            int answer  = scanner.nextInt();
            if (answer > randomNum){
                System.out.println("输入的太大了,请重试");

            }else if (answer < randomNum) {
                System.out.println("输入的太小了,请重试");

            }else {
                System.out.println("恭喜你输入正确");
                System.exit(0);
            }

            i++;
            if (i ==5){
                System.out.println("你猜个锤子猜！垃圾");
                System.exit(0);
            }
        }
    }




}
