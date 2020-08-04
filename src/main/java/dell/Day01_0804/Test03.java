package dell.Day01_0804;
//位运算符

public class Test03 {
    public static void main(String[] args) {
        int a = 60;  //0011 1100
        int b  = 13;// 0000 1101
        int c = -15;
        System.out.println(a & b); //与  0000 1100
        System.out.println(a | b); //或  0011 1101
        System.out.println(a^b);//抑或   0011 0001
        System.out.println(~c); //取反   0变1 1变0
        System.out.println(a << 2);
        System.out.println(a >> 2);
        System.out.println(a >>> 2);
        System.out.println(c << 2);
        System.out.println(c >> 2);
    }

}
