package dell.Day09.ThisKeyword.Test;

/**
 * @Author 马小姐
 * @Date 2020/8/13 14:17
 * @Version 1.0
 * @Description:
 */
/*
* 设计User类，里面有私有属性编号id、姓名name、性别gender、年龄age、电话phone、邮箱email，分别对应生成get和set方法
编写UserService类，在类中创建用户对象数组User[] users ,用户总数int total两个属性，创建构造方法，对对象数组进行初始化值。
编写方法getUserList()，参数自由设计，实现对所有用户信息的查看
编写addUser()方法，参数自由设计，实现对用户的添加
编写deleteUser()方法，参数自由设计，实现会用户的删除操作
编写updateUser()方法，参数自由设计，实现对用户的修改操作
编写测试类进行测试
* */
public class User {
    private int id;
    private String name;
    private String sex;
    private int age;
    private long phone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
