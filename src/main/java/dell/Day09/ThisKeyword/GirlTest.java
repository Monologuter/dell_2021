package dell.Day09.ThisKeyword;

/**
 * @Author 马小姐
 * @Date 2020/8/13 10:42
 * @Version 1.0
 * @Description:
 */
public class GirlTest {
    public static void main(String[] args) {
        Girl girl = new Girl(20);
        boolean a = girl.CompaABoolean(new Girl(19));
        System.out.println(a);
    }
}
