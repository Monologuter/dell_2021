package dell.Day09.AdminTest.view;

import dell.Day09.AdminTest.Service.UserService;
import dell.Day09.AdminTest.model.Student;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/14 0:20
 * @Version 1.0
 * @Description:操作界面提示信息打印函数
 */
public class SystemControl {

    public static void  systemFunction(){
        Student[] students = new Student[100];
        while (true){
            System.out.println("1.显示用户");
            System.out.println("2.新增用户");
            System.out.println("3.删除用户");
            System.out.println("4.修改用户");
            System.out.println("5.查询用户");
            System.out.println("6.安全退出");
            System.out.print("请输入你需要进行的操作选项：");
            Scanner scanner = new Scanner(System.in);
            int controlId = scanner.nextInt();
            UserService userService = new UserService();
            switch (controlId){
                case 1:
                    //输出用户信息
                    userService.output();
                    break;
                case 2:
                    //添加用户信息
                    userService.add();
                    break;
                case 3:
                    userService.delete();
                    //删除用户函数
                    break;
                case 4:
                    //修改用户信息
                    userService.update();
                    break;
                case 5:
                    //查找用户信息
                    userService.find();
                    break;
                case 6:
                    System.out.println("退出系统");
                    System.exit(0);
                default:
                    System.out.println("输入的操作不合法,请重新输入：");
                    systemFunction();
                    break;
            }
        }
    }
}
