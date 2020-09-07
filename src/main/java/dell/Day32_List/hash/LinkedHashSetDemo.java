package dell.Day32_List.hash;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Author 马小姐
 * @Date 2020-09-04 15:13
 * @Version 1.0
 * @Description: LinkedHashSet extends HashSet
 * 底层是一个哈希表(数组+链表/红黑树)+链表  多了一个链表用来记录元素的存储顺序保证元素有序
 */


/*
* 具有可预知迭代顺序的 Set 接口的哈希表和链接列表实现。此实现与 HashSet 的不同之外在于，
* 后者维护着一个运行于所有条目的双重链接列表。此链接列表定义了迭代顺序，
* 即按照将元素插入到 set 中的顺序（插入顺序）进行迭代。注意，插入顺序不 受在 set 中重新插入的 元素的影响。
* （如果在 s.contains(e) 返回 true 后立即调用 s.add(e)，则元素 e 会被重新插入到 set s 中。）
* */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String> ();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("baidu.com");
        System.out.println(set);
        //无序且不能重复

        LinkedHashSet<String> set1 = new LinkedHashSet<String> ();
        set1.add("www");
        set1.add("abc");
        set1.add("abc");
        set1.add("baidu.com");

        System.out.println(set1);
        //有序但不能重复



    }
}
