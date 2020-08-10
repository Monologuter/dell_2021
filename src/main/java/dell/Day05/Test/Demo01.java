package dell.Day05.Test;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/9 23:08
 * @Version 1.0
 * @Description:
 */
/*
* 输入密码三次及以上冻结用户
* */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String password = "cyy123456";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户的密码：");
            String pwd = sc.nextLine();
            boolean b = password.equals(pwd);
            if (b == true){
                System.out.println("成功！");
                break;
            }if (i == 2 && b==false){
                System.out.println("密码已经输错三次，账号已被冻结！");
            }
        }
    }
}
