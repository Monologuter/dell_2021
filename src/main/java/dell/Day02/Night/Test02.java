package dell.Day02.Night;
/*
找出1-1000以内的所有水仙花数
 */

public class Test02 {
    public static void main(String[] args) {
//        System.out.print("请输入数据：");
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        System.out.println("输入的数据为："+ b);
////        输入一个数 判断是不是水仙花数
//        int c = b / 100;   //百位数
//        int d = (b / 10) %  10;   //十位数
//        int e = b % 10;      //个位数
////        System.out.println(c);
////        System.out.println(d);
////        System.out.println(e);
//        if ((c*c*c + d*d*d + e*e*e) == b){
//            System.out.println(b + "是水仙花数");
//        }else {
//            System.out.println(b + "不是水仙花数");
//        }
        for (int b=0 ; b<=1000;b++){
            int c = b / 100;
            int d =(b/10)%10;
            int e = b%10;
            if((c*c*c + d*d*d + e*e*e) == b){
                System.out.println(b +"是水仙花数");
            }
        }
    }
}
