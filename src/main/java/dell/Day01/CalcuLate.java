package dell.Day01;

public class CalcuLate {
    public static void main(String[] args) {
        int a  = 5;
        int b  = 2;
        double dou = 12.5;
        System.out.println("a+b等于"+(a + b));
        System.out.println(a + dou);

        //强制类型转换
        int result = (int)(a+dou);
        System.out.println(result);

        System.out.println("===============================================");
        double result1 = (a*dou);
        System.out.println(result1);

        System.out.println("===============================================");
        int result3 = (int)(dou-a);
        System.out.println(result3);

        System.out.println("-=========================================");
        double result4 = (dou/a);
        System.out.println(result4);

        System.out.println("================================================");
        float f1 = (float)1.5;
        float f2 = (float)(1.5f);
        System.out.println(f1);
        System.out.println(f2);


        int result5 = (a++) +1 + (++a);
        System.out.println(result5);


        int j = 5;
        int result6 = (j--) -1 + (++j);
        System.out.println(result6);





    }

}
