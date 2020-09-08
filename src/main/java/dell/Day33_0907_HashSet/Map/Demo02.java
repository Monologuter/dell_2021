package dell.Day33_0907_HashSet.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author 马小姐
 * @Date 2020-09-07 16:41
 * @Version 1.0
 * @Description: Entry键值对对象
 */

/*
* Map.Entry<k , v>在map接口中有一个内部接口Entry
* 作用：
*   当Map集合一创建那么就会在Map集合中创建一个Entry对象来标记键与值的映射关系  可以使用结婚证来形容
*
*
*
*
*
* */
public class Demo02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"张三");
        map.put(4,"李四");
        map.put(6,"王五");
        map.put(8,"赵六");
        map.put(0,"田七");
        System.out.println(map);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        //增强for
        for (Map.Entry<Integer, String> ing : entries) {
            Integer key = ing.getKey();
            String value = ing.getValue();
            System.out.println(key+":"+value);
        }

        System.out.println("=====================================================");

        //迭代器
        Iterator< Map.Entry<Integer, String> > ing2 = entries.iterator();
        while (ing2.hasNext()) {
            Map.Entry<Integer, String> entry = ing2.next();

//            System.out.println(entry);

            Integer key2 = entry.getKey();
            String value2 = entry.getValue();
            System.out.println(key2+":"+value2);
        }

    }
}
