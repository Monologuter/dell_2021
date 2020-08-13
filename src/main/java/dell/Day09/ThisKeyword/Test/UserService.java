package dell.Day09.ThisKeyword.Test;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/13 14:18
 * @Version 1.0
 * @Description:
 */
/*
设计User类，里面有私有属性编号id、姓名name、性别gender、年龄age、电话phone、邮箱email，分别对应生成get和set方法
编写UserService类，在类中创建用户对象数组User[] users ,用户总数int total两个属性，创建构造方法，对对象数组进行初始化值。
编写方法getUserList()，参数自由设计，实现对所有用户信息的查看
编写addUser()方法，参数自由设计，实现对用户的添加
编写deleteUser()方法，参数自由设计，实现会用户的删除操作
编写updateUser()方法，参数自由设计，实现对用户的修改操作
编写测试类进行测试
 */
public class UserService {
    int total = 5;
    User[] users = new User[total];

    public UserService() {
    }

    public UserService(int total, User[] users) {
        this.total = total;
        this.users = users;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    //添加信息
    public User[] addUser(){

        for (int i = 0; i < total; i++) {

        }

        return  users;
    }


    //获取信息
    public User[] getUserList() {

        return users;
    }

    //删除信息
    public User[] deleteUser(){
        return  users;
    }

    public User[] updateUser(){
        return  users;
    }
    //更新信息


    public static void main(String[] args) {
        User user = new User();
        System.out.println("请输入用户id：");
        Scanner scanner = new Scanner(System.in);
        user.setId(scanner.nextInt());
        System.out.println("请输入你的姓名：");
    }
}
