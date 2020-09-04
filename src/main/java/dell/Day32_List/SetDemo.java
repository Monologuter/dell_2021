package dell.Day32_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author 马小姐
 * @Date 2020-09-04 11:07
 * @Version 1.0
 * @Description:
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println("======================================================");

        for (Integer i : hashSet) {
            System.out.println(i);
        }
    }
}