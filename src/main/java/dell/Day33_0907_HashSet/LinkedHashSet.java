package dell.Day33_0907_HashSet;

import java.util.HashSet;

/**
 * @Author 马小姐
 * @Date 2020-09-07 09:10
 * @Version 1.0
 * @Description: 底层是一个哈希表（数组加链表/红黑树） + 链表  多出来的链表用来记录元素的存储顺序  保证元素的有序性
 */
public class LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String> ();
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("itheima");
        hashSet.add("www");
        System.out.println(hashSet);


        java.util.LinkedHashSet<String> linkedHashSet  = new java.util.LinkedHashSet<String>();

        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("itheima");
        linkedHashSet.add("www");
        System.out.println(linkedHashSet);

    }
}
