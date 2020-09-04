package dell.Day32_List.hash;

import java.util.HashSet;

/**
 * @Author 马小姐
 * @Date 2020-09-04 15:02
 * @Version 1.0
 * @Description:使用hashCode存储自定义类型的元素必须重写hashCode和equals方法
 */
/*
* 要求：
*   同名同年龄的人视为同一个人只能存储一次
*
*
* */

public class hashCodeDemo03 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student> ();
        Student stu1 = new Student("小明",11);
        Student stu2 = new Student("小明",11);

        System.out.println("stu1的哈希值为："+stu1.hashCode());
        System.out.println("stu2的哈希值为："+stu2.hashCode());

        set.add(stu1);
        set.add(stu2);

        System.out.println(set);
    }
}
