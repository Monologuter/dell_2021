package dell.Day29_self_study.String;

/**
 * @Author 马小姐
 * @Date 2020-09-01 10:13
 * @Version 1.0
 * @Description:
 */

/*
* StringBuild中常见的方法
*   public StringBuild append(.....)  添加任意类型的字符串形式 并返回房钱对象本身
*
*
*
* */
public class StringBuildDemo01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("stringBuilder:   " +stringBuilder);
        StringBuilder stringBuilder1 = new StringBuilder("abc");
        System.out.println("stringBuilder1:    " +stringBuilder1);
        System.out.println("你是傻子");
    }
}
