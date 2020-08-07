package dell.Day01;
//求三个数中的最大值是哪一个
//第一种三元运算符  第二种if表达式

public class Test02 {
    public static void main(String[] args) {
        int a = 16;
        int b = 25;
        int c = 21;
        int tmp;
//        int max =    (a > b) && (a > c)  ? a : ((b > c) ? b : c);
//        System.out.println(max);


        if (a > b){
            tmp = a;
        }else {
             tmp = b;
        }

        if (tmp > c) {
            System.out.println("最大值是"+tmp);
        }else {
            System.out.println("最大值是"+c);
        }

    }
}
