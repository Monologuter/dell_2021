package dell.Day08.Test;

/**
 * @Author 马小姐
 * @Date 2020/8/12 15:38
 * @Version 1.0
 * @Description:
 */
public class ArraysTest01 {
    public static void main(String[] args) {
        String[] strings = {"你是猪吗","不是的","你才是猪"};
        for (int i = strings.length-1 ;i >-1 ; i--) {
            System.out.print(strings[i]+ " ");

        }
    }
}
