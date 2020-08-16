package dell.Day09.teacherTest.view;


import dell.Day09.teacherTest.model.User;
import dell.Day09.teacherTest.service.UserService;

import java.util.Scanner;

public class UserView {
    UserService userService=new UserService(10);
    Scanner scanner=new Scanner(System.in);
    //打印菜单
    public void printMenu(){
        System.out.println("\t\t\t1.用户列表");
        System.out.println("\t\t\t2.新增用户");
        System.out.println("\t\t\t3.删除用户");
        System.out.println("\t\t\t4.修改用户");

    }
    //展示用户列表
    public void showUserList(){
        System.out.println("\t编号\t姓名\t年龄\t性别\t电话\t邮箱");
        User[] users=userService.getUserList();
        for(int i=0;i<users.length;i++){
            System.out.println("\t"+(i+1)+"\t\t"+users[i].getName()+"\t\t"
                    +users[i].getAge()+"\t\t"+users[i].getGender()
                    +"\t\t"+users[i].getPhone()+"\t"+users[i].getEmail());
        }
        System.out.println("共有"+userService.getTotal()+"条数据");
    }
    /**
     * 新增用户
     */
    public void addUser(){
        System.out.println("\t\t\t-----新增用户------");
        System.out.println("请输入姓名：");
        String name=scanner.next();
        System.out.println("请输入性别：");
        char gender=scanner.next().charAt(0);
        System.out.println("请输入年龄：");
        int age=scanner.nextInt();
        System.out.println("请输入电话：");
        String phone=scanner.next();
        System.out.println("请输入邮箱：");
        String email=scanner.next();
        User user=new User(userService.getTotal(),name,gender,age,phone,email);
        userService.addUser(user);
    }
    /**
     * 删除用户
     */
    public void deleteUser(){
        System.out.println("\t\t\t-----删除用户------");
        System.out.println("请输入要删除的用户编号：");
        int userId=scanner.nextInt();
//        if(userId>userService.getTotal()){
////            System.out.println("当前用户不存在");
////            return;
////        }
        System.out.println("确定删除Y/N：");
        char yesOrNo=scanner.next().charAt(0);
        if(yesOrNo=='Y'){
            if(userService.deleteUser(userId)){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            return;
        }


    }
    //修改用户
    public void updateUser(){
        System.out.println("\t\t\t-----修改用户------");
        User[] users=userService.getUserList();
        System.out.println("请输入修改用户的编号：");
        int id=scanner.nextInt();
        if(id>users.length){
            System.out.println("当前用户不存在");
            return;
        }
        System.out.println("请输入姓名：");
        String name= scanner.next();;
        System.out.println("请输入性别：");
        char gender=scanner.next().charAt(0);
        System.out.println("请输入年龄：");
        int age=scanner.nextInt();
        System.out.println("请输入电话：");
        String phone=scanner.next();
        System.out.println("请输入邮箱：");
        String email=scanner.next();
        User user=new User(id,name,gender,age,phone,email);
        System.out.println("确定修改Y/N：");
        char yesOrNo=scanner.next().charAt(0);
        if(yesOrNo=='Y') {
            if (userService.updateUser(user)) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        }else{
            return;
        }
    }


    public void poolFunction() {
        while (true) {
            printMenu();
            System.out.println("请输入指令");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    showUserList();
                    break;
                case 2:
                    addUser();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    updateUser();
                    break;
                default:
                    System.out.println("输入指令错误");
                    break;
            }
        }
    }
}
