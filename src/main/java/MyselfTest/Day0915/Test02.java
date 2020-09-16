package MyselfTest.Day0915;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author 马小姐
 * @Date 2020-09-15 19:06
 * @Version 1.0
 * @Description:
 */
public class Test02 {
    public static void main(String[] args) {
        String[] array = new String[]{"黑龙江省","江苏省","四川省","浙江省"};
        String[] array2 = new String[] {"哈尔滨","南京","成都","杭州"};

        HashMap<String , String> hashMap = new HashMap<String, String> ();


        for (int i = 0; i < array.length; i++){
            String key = array[i];
            String value = array2[i];
            hashMap.put(key, value);

        }
        System.out.println(hashMap);

    }
}
