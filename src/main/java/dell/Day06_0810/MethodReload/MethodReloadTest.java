package dell.Day06_0810.MethodReload;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/10 17:07
 * @Version 1.0
 * @Description:
 */
public class MethodReloadTest {
    public static void main(String[] args) {
        System.out.println("请输入长方形的长：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入长方形的宽：");
        int b = scanner.nextInt();


        MethodReload num = new MethodReload();
        num.methodPrint(a,b);
    }
}
