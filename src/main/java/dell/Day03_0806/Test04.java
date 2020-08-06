package dell.Day03_0806;

/**
 * @Author 马小姐
 * @Date 2020/8/6 14:47
 * @Version 1.0
 * @Description:  练习： 程序员找室友
 */
public class Test04 {
    public static void main(String[] args) {
        int[] array = new int[] {8,2,0,1,3};
        int[] index = new int[] {2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += array[index[i]];
        }
        System.out.println("我的电话号码是："+tel);
    }
}
