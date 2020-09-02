package dell.Day29_self_study.String;

/**
 * @Author 马小姐
 * @Date 2020-09-01 10:13
 * @Version 1.0
 * @Description:
 */
/*
* StringBuild----> String 可以使用StringBuild中的toString方法
* public String toString() 将当前的StringBuild对象转化为String对象

*
* */
public class StringBuildDemo02 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str+"str");
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println(bu);

        String s = bu.toString();
        System.out.println(s);


    }
}