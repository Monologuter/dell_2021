package dell.Day07;

/**
 * @Author 马小姐
 * @Date 2020/8/11 20:09
 * @Version 1.0
 * @Description:  斐波那契数列
 */
public class Fibonacci {
    public static void main(String[] args) {
        int start = 1;
        int next = 1;
        System.out.print(start + "、" + next + "、");
        // 从3开始到第num个斐波那契数
        for (int i = 3; i <= 12; i++) {
            int last = start + next;
            System.out.print(last + "、");
            start = next;
            next = last;
        }
        System.out.println();
//        // 通过迭代计算，效率很低
//        for (int i = 1; i <= 12; i++) {
//            System.out.print(getFibonacci(i) + "、");
//        }
    }

    private static int getFibonacci(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return getFibonacci(index - 1) + getFibonacci(index - 2);
    }
}

