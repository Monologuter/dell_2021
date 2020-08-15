package dell.Day09.AdminTest.view;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/13 11:41
 * @Version 1.0
 * @Description:登录入口函数
 */

public class AdministratorLogin {
    private String loginAccount; //管理员账号
    private int loginPassword; //管理员密码

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public int getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(int loginPassword) {
        this.loginPassword = loginPassword;
    }

    public void AdminLogin(){
        AdministratorLogin administrator = new AdministratorLogin();
        administrator.setLoginAccount("cyy");
        administrator.setLoginPassword(123456);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的账号：");
        String account = scanner.next();

        System.out.print("请输入你的密码：");
        int password = scanner.nextInt();
        if (account.equals(administrator.getLoginAccount()) == true)  {
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
            System.out.println("                    登录成功！");
            System.out.println("               欢迎进入用户管理系统");
            System.out.println("          ******************************");
            System.out.println("      ***************************************");
            System.out.println("******************请进行系统功能选择*********************");
            //调用系统控制类函数 控制系统的操作
            SystemControl systemControl = new SystemControl();
            SystemControl.systemFunction();
            //调用增加用户的函数
            //调用查找用户的函数
            //调用删除用户的函数
            //调用获取用户的函数

        }else {
            System.out.println("你输入的账号不合法！");
            System.exit(0);
        }
    }
}
