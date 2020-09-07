package MyselfTest.Test_0827;

/**
 * @Author 马小姐
 * @Date 2020-08-27 16:10
 * @Version 1.0
 * @Description:
 */
public class Person implements  Comparable<Person> {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    //重写排序的规则  返回0表示元素都是相同的
    @Override
    public int compareTo(Person o) {
//        return 0;
        //自定义比较的规则 比较两个人的年龄  this.年龄   this.姓名
        return this.getAge()-o.getAge();  //按照年龄升序排序

    }
}
