package dell.Day32.MyCollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author 马小姐
 * @Date 2020-09-03 11:02
 * @Version 1.0
 * @Description:
 */

/*
* Collection没有索引  所以就不能使用for循环来遍历集合
* 就有了迭代器
* java.util.Iterator接口 迭代器对集合进行遍历
* 有两个常用的方法
*   boolean	hasNext()  如果仍有元素可以迭代，则返回 true。
    E	next()  返回迭代的下一个元素。
    Collection接口中有一个方法叫做Iterator() 这个方法返回的就是迭代器的实现类对象
    * 迭代器的使用步骤：
    *   使用集合中的方法 iterator()获取迭代器的实现类对象 使用Iterator接口接收(多态)
    *   使用Iterator接口中的hasNext()方法来判断还有没有下一个元素
    *   使用Iterator接口中的next()方法取出下一个元素
* */
public class Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        collection.add("赵六");
        collection.add("田七");

        /*
        * 使用集合中的方法 iterator()获取迭代器的实现类对象 使用Iterator接口接收(多态)
        * 注意：Iterator<E>接口是有泛型的迭代器的泛型跟着集合走  集合是什么泛型 迭代器就是什么泛型
        *
        * */
        java.util.Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){

            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("=========================================");

        for (iterator = collection.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());

        }
    }
}
