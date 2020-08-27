package MyselfTest.Test_0827;

/**
 * @Author 马小姐
 * @Date 2020-08-27 16:10
 * @Version 1.0
 * @Description:
 */
public class Person {
    private  String name;
    private  int  age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
