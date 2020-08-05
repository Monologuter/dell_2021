package dell.Day02_0805;
/*
计算1到100的整数和

注意三张循环的区别是什么：

 */

public class while_demo01 {
     public static void main(String[] args) {
          int i = 0;
          int sum = 0;

//          while(i<=100){
//               sum +=i;
//               i++;
//          }
//          System.out.println(sum);


//          do {
//              sum += i;
//              i++;
//          }while (i<=100);
//          System.out.println(sum);

          for (i = 0; i <=100;i++ ){
               sum += i;
          }
          System.out.println(sum);
     }
}
