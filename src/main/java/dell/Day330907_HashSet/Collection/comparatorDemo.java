package dell.Day330907_HashSet.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author 马小姐
 * @Date 2020-09-07 10:53
 * @Version 1.0
 * @Description:  Comparator和Comparable的区别是什么
 * Comparable  自己()和别比较(方法传递的对象)
 * Comparator 相当于找一个第三方裁判来对两者进行比较
 */
public class comparatorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<> ();
        integerArrayList.add(1);
        integerArrayList.add(90);
        integerArrayList.add(34);
        integerArrayList.add(44);
        integerArrayList.add(55);
        integerArrayList.add(11);
//        System.out.println(integerArrayList);

        Collections.sort(integerArrayList);
//        System.out.println(integerArrayList);

        Collections.sort(integerArrayList,new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(integerArrayList);

    }

}
