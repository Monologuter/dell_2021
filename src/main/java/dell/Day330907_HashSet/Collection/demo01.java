package dell.Day330907_HashSet.Collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author 马小姐
 * @Date 2020-09-07 09:53
 * @Version 1.0
 * @Description:Collection集合的工具类方法
 */
public class demo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String> ();
        Collections.addAll(arrayList,"哈哈","嘿嘿","嘤嘤嘤","哟哟哟","呀呀呀","咚咚咚");
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
