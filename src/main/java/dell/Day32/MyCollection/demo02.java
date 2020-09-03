package dell.Day32.MyCollection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author 马小姐
 * @Date 2020-09-03 14:41
 * @Version 1.0
 * @Description:
 */

public class demo02 {
    public static void main(String[] args) {
//        show01();
        show02();

    }

    private static void show02() {
        ArrayList<String> arrayList2 = new ArrayList<String> ();
        arrayList2.add("陈亚");

        Iterator<String> iterator = arrayList2.iterator();
        while (iterator.hasNext()) {
            String s  =  iterator.next();
            System.out.println(s.length());
        }
    }

    private static void show01() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("陈亚");
        arrayList.add(1);
        arrayList.add(9.0);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


            String s = (String)iterator.next();
            System.out.println(s.length());
        }
    }
}
