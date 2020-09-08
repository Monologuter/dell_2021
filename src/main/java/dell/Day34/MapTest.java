package dell.Day34;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020-09-08 10:27
 * @Version 1.0
 * @Description:  输入一个字符串  求每个字符出现的次数
 */
public class MapTest {
    public static void main(String[] args) {
        show();

    }


    public static void  show(){
        System.out.println("请输入需要查询的字符串：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer> ();

        for (char c:s.toCharArray()) {
            if(hashMap.containsKey(c)) {
                Integer value = hashMap.get(c);
                value++;
                hashMap.put(c, value);
            }else {
                hashMap.put(c,1);
            }

        }

        for (Character key :hashMap.keySet()) {
            Integer value= hashMap.get(key);
            System.out.println(key+":"+value);
        }

    }
}
