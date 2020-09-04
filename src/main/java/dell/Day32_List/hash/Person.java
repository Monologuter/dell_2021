package dell.Day32_List.hash;

/**
 * @Author 马小姐
 * @Date 2020-09-04 11:43
 * @Version 1.0
 * @Description:
 */
/*
* 什么是哈希值
* 是一个十进制的整数由系统随机给出是一个逻辑地址不是指实际的存储物理地址
*
*
*
*
* */
public class Person  extends  Object{


    public static void main(String[] args) {
        Person person = new Person();
        int i = person.hashCode();
        System.out.println(i);
        System.out.println(person);

        Person person1 =  new Person();
        System.out.println(person1.hashCode());
        System.out.println(person1);


        String s = new String("金合欢花");
        System.out.println(s.hashCode());





    }
}
