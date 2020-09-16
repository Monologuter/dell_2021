package MyselfTest.Day0915;



import java.util.ArrayList;
import java.util.HashMap;


/**
 * @Author 马小姐
 * @Date 2020-09-15 17:23
 * @Version 1.0
 * @Description:
 */


/*
* 定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
* 例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”
* */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String> ();
        HashMap<Character , Integer> hashMap = new HashMap<> ();

        arrayList.add("abc");
        arrayList.add("bcd");
        arrayList.add("shdassfjsajfasfjl");

        for (String s:arrayList) {
            char[] chars = s.toCharArray();
            for (char c : chars){
                if (!hashMap.containsKey(c)){
                    hashMap.put(c,1);
                }else {
                    hashMap.put(c,hashMap.get(c)+1);
                }
            }
        }
        System.out.println(hashMap);
    }
}














