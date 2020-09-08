package dell.Day33_0907_HashSet.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author 马小姐
 * @Date 2020-09-07 17:04
 * @Version 1.0
 * @Description: HashMap存储自定义类型的键值对
 */
public class Demo03 {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        HashMap<Person , Student> hashMap = new HashMap<> ();
        hashMap.put(new Person(11,"张三"),new Student(23,"陈亚"));
        hashMap.put(new Person(12,"李四"),new Student(22,"华妍"));
        hashMap.put(new Person(13,"王五"),new Student(21,"马静娴"));
        hashMap.put(new Person(14,"赵六"),new Student(14,"陈诺"));

        //使用键值对的方式遍历集合
        Set<Map.Entry<Person, Student>> entries = hashMap.entrySet();
        //迭代器
        Iterator<Map.Entry<Person, Student>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Person, Student> next = iterator.next();
            Person key = next.getKey();
            Student value = next.getValue();
            System.out.println(key+":"+value);
        }

        System.out.println("========================================================================");



        //使用keySet  键找值的方式遍历集合
        Set<Person> people = hashMap.keySet();
        for (Person key: people) {
            Student value = hashMap.get(key);
            System.out.println(key+":"+value);
        }


    }





    private static void show01() {
        HashMap<Integer , Student> hashMap = new HashMap<> ();
        hashMap.put(1,new Student(23,"陈亚"));
        hashMap.put(2,new Student(22,"华妍"));
        hashMap.put(3,new Student(21,"马静娴"));
        hashMap.put(4,new Student(14,"陈诺"));

        Set<Map.Entry<Integer, Student>> entries = hashMap.entrySet();


        //使用键值对的方式遍历map集合
        Iterator<Map.Entry<Integer, Student>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Student> next = iterator.next();
            Integer key = next.getKey();
            Student value = next.getValue();

            System.out.println(key+":"+value);
        }

        System.out.println("========================================================================");

        //使用keySet的方式遍历集合
        Set<Integer> integers = hashMap.keySet();
        for (Integer key : integers) {
            Student value = hashMap.get(key);
            System.out.println(key+":"+value);

        }

        System.out.println("========================================================================");

    }
}

