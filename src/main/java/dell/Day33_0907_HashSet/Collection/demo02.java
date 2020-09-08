package dell.Day33_0907_HashSet.Collection;

import MyselfTest.Test_0827.Person;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author 马小姐
 * @Date 2020-09-07 10:38
 * @Version 1.0
 * @Description: sort()自定义类型排序
 * 注意事项  使用前提 被排序的集合里面存储的元素必须实现Comparable接口 重写CompareTo方法   定义排序的规则
 */
public class demo02 {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("陈亚",23));
        personList.add(new Person("华妍",22));
        personList.add(new Person("马静娴",21));
        personList.add(new Person("陈诺",14));
        System.out.println(personList);


        Collections.sort(personList);
        System.out.println(personList);
    }
}
