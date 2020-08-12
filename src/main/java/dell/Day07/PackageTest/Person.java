package dell.Day07.PackageTest;

/**
 * @Author 马小姐
 * @Date 2020/8/11 17:18
 * @Version 1.0
 * @Description:
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>130){
            System.out.println("你的年龄不合法，请重新输入！");
        }else {
            System.out.println("你的年龄是："+age);
        }
    }

//    public int show(int age){
//        if(age<0 || age>130){
//            System.out.println("你的年龄不合法，请重新输入");
//        }
//        System.out.println("你的年龄是："+age);
//        return age;
//    }

}
