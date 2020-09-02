package dell.Day29_self_study.String;

import java.util.Arrays;

/**
 * @Author 马小姐
 * @Date 2020-09-01 14:27
 * @Version 1.0
 * @Description:
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        char[]  charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }

        System.out.println("====================================================");

        char[] arrArray2 = new char[]{'a','b','c','d'};
        String str2 = new String(arrArray2);
        System.out.println(str1);

        System.out.println("============================");


        String str3 = "abc1234中国";
        byte[] bytes = str3.getBytes();
        System.out.println(Arrays.toString(bytes));


    }
}
