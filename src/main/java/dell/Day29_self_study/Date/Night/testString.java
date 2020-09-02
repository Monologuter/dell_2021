package dell.Day29_self_study.Date.Night;

/**
 * @Author 马小姐
 * @Date 2020-09-01 19:07
 * @Version 1.0
 * @Description:
 */
public class testString {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        String str3 = new String("123");
        System.out.println(str1 == str2);  //true
        System.out.println(str1 == str3);   //false
        System.out.println(str1.equals(str3));//  true
        str1 = "abc";
        String str4 = "abc";
        String str5 = "a" + "bc";
        System.out.println(str1 == str5);   //true
        String str6 = (str2 + str4).intern();
        System.out.println(str1 == str6);  //false
    }
}
