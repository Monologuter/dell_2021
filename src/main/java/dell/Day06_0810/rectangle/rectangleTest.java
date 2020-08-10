package dell.Day06_0810.rectangle;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/10 16:34
 * @Version 1.0
 * @Description:
 */
/*
* 局部变量放在栈内存
* 成员变量放在堆内存
*
* 声明的位置不一样
* 成员变量在类里面
* 局部变量在方法里面或者形参列表或者代码块里面
*
*
*
* */
public class rectangleTest {
    public static void main(String[] args) {
        System.out.println("请输入长方形的长：");
        Scanner scanner = new Scanner(System.in);
        double rectangleLong = scanner.nextDouble();
        System.out.println("请输入长方形的宽：");
        double rectangleWidth = scanner.nextDouble();

        rectangleClass  rectangle = new rectangleClass();
        rectangle.area(rectangleLong,rectangleWidth);
        rectangle.perimeter(rectangleLong,rectangleWidth);
    }
}
