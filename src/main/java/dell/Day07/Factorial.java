package dell.Day07;

/**
 * @Author 马小姐
 * @Date 2020/8/12 15:16
 * @Version 1.0
 * @Description:递归求阶乘
 */
public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if(n==0){
            return 1;
        }else {
            return  factorial(n-1)*n;
        }
    }
}
