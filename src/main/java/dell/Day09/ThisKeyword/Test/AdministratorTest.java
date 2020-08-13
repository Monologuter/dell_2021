package dell.Day09.ThisKeyword.Test;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/13 11:41
 * @Version 1.0
 * @Description:
 */


public class AdministratorTest {
    public static void main(String[] args) {
        int i;
        Administrator administrator = new Administrator();
        administrator.setLoginAccount("cyy");
//        System.out.println(administrator.getLoginAccount());
        administrator.setLoginPassword(123456);
//        System.out.println(administrator.getLoginPassword());
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的账号：");
        String account = scanner.next();

        System.out.print("请输入你的密码：");
        int password = scanner.nextInt();
        if (account.equals(administrator.getLoginAccount()) == true) {
            //下面注释部分代码是不加判断的输出
//            if (password != administrator.getLoginPassword()) {
//                System.out.println("你输入的密码不对,请重新输入！");
//            }else {
//                System.out.println("登录成功！");
//            }
            for (int j = 1; j <6; j++) {
                if (password != administrator.getLoginPassword()){
                    System.out.println("您输入的密码错误"+j+"次,请重新输入");
                    System.out.print("请输入你的密码：");
                    password = scanner.nextInt();
                    if (j==5){
                        System.out.println("你输错密码的次数已经达到五次！");
                        System.exit(0);
                    }
                }
            }
            System.out.println("登录成功！");
        }else {
            System.out.println("你输入的账号不合法！");
            System.exit(0);
        }
    }
}
