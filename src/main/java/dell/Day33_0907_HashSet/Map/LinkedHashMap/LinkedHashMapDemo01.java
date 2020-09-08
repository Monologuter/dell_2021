package dell.Day33_0907_HashSet.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @Author 马小姐
 * @Date 2020-09-07 20:30
 * @Version 1.0
 * @Description:  linkedHashMap
 *
 */
/*
* 构造方法摘要
LinkedHashMap()
          构造一个带默认初始容量 (16) 和加载因子 (0.75) 的空插入顺序 LinkedHashMap 实例。
LinkedHashMap(int initialCapacity)
          构造一个带指定初始容量和默认加载因子 (0.75) 的空插入顺序 LinkedHashMap 实例。
LinkedHashMap(int initialCapacity, float loadFactor)
          构造一个带指定初始容量和加载因子的空插入顺序 LinkedHashMap 实例。
LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
          构造一个带指定初始容量、加载因子和排序模式的空 LinkedHashMap 实例。
LinkedHashMap(Map<? extends K,? extends V> m)
          构造一个映射关系与指定映射相同的插入顺序 LinkedHashMap 实例。

方法摘要
 void	clear()
          从该映射中移除所有映射关系。
 boolean	containsValue(Object value)
          如果此映射将一个或多个键映射到指定值，则返回 true。
 V	get(Object key)
          返回此映射到指定键的值。
protected  boolean	removeEldestEntry(Map.Entry<K,V> eldest)
          如果此映射移除其最旧的条目，则返回 true。
*
* */
public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String> ();
        map.put("陈亚","成都");
        map.put("华妍","上海");
        map.put("汪越","合肥");
        map.put("江文芳","淮南");
        System.out.println(map);
        //key不允许重复  value可以重复


        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("陈亚","成都");
        linkedHashMap.put("华妍","上海");
        linkedHashMap.put("汪越","合肥");
        linkedHashMap.put("江文芳","淮南");
        System.out.println(linkedHashMap);


    }
}
