package dell.Day07.PackageTest;

/**
 * @Author 马小姐
 * @Date 2020/8/11 20:09
 * @Version 1.0
 * @Description:  斐波那契数列
 */
/*
实例：
* 1、1、2、3、5、8、13、21、34、55、89、144
*
*
*
* */
public class FibonacciDemo {
    public static void main(String[] args) {
        int start = 1;
        int next  = 1;
        System.out.print(start + "、" + next + "、");
        for (int i = 3; i <= 12; i++) {
                int sum = next + start;
                System.out.print(sum+"、");
                start = next;
                next = sum;
        }
        System.out.println();

    }
}

