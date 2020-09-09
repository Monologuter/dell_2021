package dell.Day32_List;

import java.util.LinkedList;

/**
 * @Author 马小姐
 * @Date 2020-09-04 08:59
 * @Version 1.0
 * @Description:
 */
/*
* java.util.LinkedList集合 implements List接口
* LinkedList集合的特点：
*   底层是一个链表结构查询慢 但是增删快
*   里面包含了很多关于首尾元素操作的方法
*   不能使用多态
*   void	add(int index, E element)  在此列表中指定的位置插入指定的元素。
    void	addFirst(E e) 将指定元素插入此列表的开头。
    void	addLast(E e) 将指定元素添加到此列表的结尾
    void	push(E e)  将元素推入此列表所表示的堆栈。
    E	getFirst() 返回此列表的第一个元素。
    E	getLast() 返回此列表的最后一个元素。
    E	remove(int index) 移除此列表中指定位置处的元素。
    E	removeFirst() 移除并返回此列表的第一个元素
    E	removeLast() 移除并返回此列表的第一个元素
    E	pop()  从此列表所表示的堆栈处弹出一个元素。
    public  boolean isEmpty() 如果列表中包含此元素就返回true  反之false
*
*
*
*
* */

public class LinkedListDemo {
    public static void main(String[] args) {
        show01();

    }

    private static void show01() {
//        创建LinkedList对象
        LinkedList<String> linked1 = new LinkedList<> ();
        linked1.add("ccc");
        linked1.add("aaa");
        linked1.add("bbb");

        System.out.println(linked1);


        //演示addFirst   addLast
        linked1.addFirst("www'");
        linked1.addLast("baidu.com");
        System.out.println(linked1);


        //push
        linked1.push("www");
        System.out.println(linked1);







    }
}
