package dell.Day46_0922;

import java.io.Serializable;

/**
 * @Author 马小姐
 * @Date 2020-09-22 09:33
 * @Version 1.0
 * @Description:  序列化和反序列化的时候会抛出 NotSerializableException 异常
 *                原因：
 *                  类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
 *                  可序列化类的所有子类型本身都是可序列化的。序列化接口没有方法或字段，仅用于标识可序列化的语义。
 *                  Serializable 也被称为标记性接口 要进行序列化和反序列化的类必须实现Serializable接口  就会给该类增加一个标记 当我们序列化和反序列化的时候就会检测
 *                  该类是否含有该标记 如果有就可以实现序列化和反序列化 没有就会抛出 NotSerializableException 异常
 *
 *
 *
 *
 */
public class Person implements Serializable {
    private String name;
    private  int age;

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
}
