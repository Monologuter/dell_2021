package dell.Day09.JavaBean;
/**
 * @Author 马小姐
 * @Date 2020/8/13 10:06
 * @Version 1.0
 * @Description:
 */
/*
* javaBean是一种java语言写成的重要的组件
* 是一种类  类是公共的  有一个无参的公共构造函数  有属性以及对应的set get方法
*
*
*
* */
public class Person {
    private  String name;
    private  int age;
    private char sex;
    private int height;

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
