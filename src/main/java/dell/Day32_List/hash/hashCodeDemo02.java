package dell.Day32_List.hash;

import java.util.HashSet;

/**
 * @Author 马小姐
 * @Date 2020-09-04 14:48
 * @Version 1.0
 * @Description:Set集合不允许存储相同元素的原因是什么？
 */
/*
* Set集合在调用add方法的时候会调用元素的hashCode方法和equals方法来判断元素是否重复
* add方法先调用元素的hashCode计算元素的哈希值 就会在集合中找是否有相同哈希值的元素  如果没有就存储元素进去
* 。。。。。。。。。。。。。。。。。。。。如果哈希值相同的话，会接着调用equals方法比较两个元素是否一样，如果不一样的话会将元素存储在同一个哈希值元素的下方，如果返回的结果为
* true的话就会认定是两个元素是相同的 就不会将这个元素存储在集合中
* 接着add方法会再次调用hashCode方法计算重地的哈希值 发现计算出来的哈希值和已有的哈希值都没有重复的   就会将这个元素直接存储在集合中
* 接着add方法会再次调用hashCode方法计算通话的哈希值 发现计算出来的哈希值和前面的重地哈希值是一样的  接着再次调用equals方法判断两个字符串是否相同  结果是false  然后就会将
* 通话这个元素放在重地元素的下方   哈希表的结构就是一个数组加上链表或者是数组加上红黑树  红黑树其实就是一种特殊的链表结构  当同一个哈希值下方的元素超过了八个   就会自动将其转化为
* 红黑树
*
*
* */
public class hashCodeDemo02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);

        set.add("重地");
        set.add("通话");
        set.add("abc");

        System.out.println(set);


    }
}
