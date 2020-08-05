package dell.Day02_0805;

public class if_demo02 {
    public static void main(String[] args) {
        //定义一个float类型的小数
        float a  = 1.4f;
        //定义一个soouble类型的小数
        double b  = 1.4;

        //顶一个char类型的变量
        char c = 'a';
        char d = 'a';

        if (a == b){
            System.out.println("float类型的可以和double类型比较");
        }
        System.out.println("不可以和double类型比较" );
    }
}
