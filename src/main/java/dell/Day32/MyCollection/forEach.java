package dell.Day32.MyCollection;

import java.util.ArrayList;

/**
 * @Author 马小姐
 * @Date 2020-09-03 14:28
 * @Version 1.0
 * @Description:增强for循环
 */

/*
* 用途 用来遍历集合和数据
*格式；
*
* */
public class forEach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<String> ();
        list.add("aaa");
        list.add("bbb");
        list.add("nnn");
        list.add("ddd");
        list.add("ggg");
        list.add("www");
        for (String s:list) {
            System.out.println(s);
        }
    }

    private static void demo01() {
        int[]  arr = new int[] {11,23,44,556,777,8};
        for(int s :  arr){
            System.out.println(s);
        }
    }


}
