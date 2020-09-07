package dell.Day330907_HashSet.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author 马小姐
 * @Date 2020-09-07 16:01
 * @Version 1.0
 * @Description:  Map双列集合 一个元素包含两个值 一个key 一个value
 *                Map集合中的元素 key和value数据类型可以相同可以相同也可以不同
 *                key不允许重复的  value可以重复
 *                key和value是一一对应的
 *
 */
/*
* hashMap集合的特点：
*   底层是哈希表 查询的速度很快 但是删除元素和增加元素的速度很慢
*   是一个无序的集合存储元素和取出元素的顺序有可能不一致
*
*
* LinkedHashMap  extends HashMap
* 特点：
*   底层是哈希表+链表 保证元素有序 存储元素和取出元素的顺序是一致的
* */

    /*
    * 方法摘要：
    *    void	clear()
          从此映射中移除所有映射关系（可选操作）。
         boolean	containsKey(Object key)
                  如果此映射包含指定键的映射关系，则返回 true。
         boolean	containsValue(Object value)
                  如果此映射将一个或多个键映射到指定值，则返回 true。
         Set<Map.Entry<K,V>>	entrySet()
                  返回此映射中包含的映射关系的 Set 视图。
         boolean	equals(Object o)
                  比较指定的对象与此映射是否相等。
         V	get(Object key)
                  返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
         int	hashCode()
                  返回此映射的哈希码值。
         boolean	isEmpty()
                  如果此映射未包含键-值映射关系，则返回 true。
         Set<K>	keySet()
                  返回此映射中包含的键的 Set 视图。
         V	put(K key, V value)
                  将指定的值与此映射中的指定键关联（可选操作）。
         void	putAll(Map<? extends K,? extends V> m)
                  从指定映射中将所有映射关系复制到此映射中（可选操作）。
         V	remove(Object key)
                  如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
         int	size()
                  返回此映射中的键-值映射关系数。
         Collection<V>	values()
                  返回此映射中包含的值的 Collection 视图。

    *
    *注意事项：
    *   Map集合无法直接遍历  只能通过键找值的方式进行遍历
    *
    *
    * */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"张三");
        map.put(4,"李四");
        map.put(6,"王五");
        map.put(8,"赵六");
        map.put(0,"田七");
        System.out.println(map);

        //增强for循环
        for (Integer i: map.keySet()) {
            String value2 = map.get(i);
            System.out.println();

            System.out.println(i+":"+value2);
        }

        System.out.println("============================================");

        //迭代器
        Set<Integer> set = map.keySet();
        Iterator<Integer> it =  set.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
