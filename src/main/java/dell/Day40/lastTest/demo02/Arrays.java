package dell.Day40.lastTest.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-09-15 08:57
 * @Version 1.0
 * @Description:
 */
public class Arrays {
    public static void main(String[] args) {
        String arr[] = new String[] {"AA","BB","EE","CC","GG","FF","ZZ"};
//        System.out.println(arr.toString());

        ArrayList<String> arrayList = new ArrayList<String> ();

        for (int i = 0; i < arr.length; i++){
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);

        //迭代器遍历集合

        java.util.Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){

            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("=========================================");


        System.out.println(arrayList.remove("ZZ"));
        System.out.println(arrayList);


    }
}
