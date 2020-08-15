package dell.Day010.inherit;

/**
 * @Author 马小姐
 * @Date 2020/8/15 10:04
 * @Version 1.0
 * @Description:
 */
public class Person {
    private String name;
    private int age;
    private char sex;
    private double height;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void sleep(){
        System.out.println(this.name+"正在睡觉");
    }

    public void eat(){
        System.out.println(this.name+"正在吃饭");
    }
}
