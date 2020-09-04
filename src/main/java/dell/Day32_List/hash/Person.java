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


        String s = new String("哈哈哈");
        String s1 = new String("哈哈哈");
        System.out.println("s的哈希值为："+s.hashCode());
        System.out.println("s1的哈希值为："+s1.hashCode());

        System.out.println(s1.hashCode() == s.hashCode());  //true
        System.out.println(s1 == s);  //false
        System.out.println(s1.equals(s)); // true

        /*
        * String重写了hashcode()方法，String类型的hash值是根据字符串的内容来决定的
        * 并不是内存地址，只要两个String类型的字符串内容一致，那么两者的hashcode就相同
        * */



    }
}
