package dell.Day34.ThreadDemo;

/**
 * @Author 马小姐
 * @Date 2020-09-08 14:50
 * @Version 1.0
 * @Description:
 */

/*
* 并发和并行的区别是什么？
*   并发：指两个或多个事件在同一个时间段发生
*   并行：指两个或多个事件在同一时间发生
*   注意：同一个时间段和同一时间的区别是什么？
* */

public class Demo01 {
    public static void main(String[] args) {
        Person person = new Person("小青");
        Person person1= new Person("小陈");

        person.run();
        person1.run();

    }
}
