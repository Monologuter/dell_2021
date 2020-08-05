package dell.Day02_0805;

import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
        int i,j,k,n;  //i表示第几行初始值为1;  j表示每行空格的个数; n表示金字塔的层数从键盘中输入;  k表示每行星号的个数.
        //空格个数的规律：    金字塔总的层数-当前的行数
        //星号的规律：        当前行数的两倍-1
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入需要打印的金字塔层数：");
        n=sc.nextInt();//金字塔总的层数
        for(i=1;i<=n;i++)
        {
            //每行星号左边空格
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }//每行星号个数
            for(k=1;k<=(i-1)*2+1;k++){
                if (i==1 || i==n){
                    System.out.print("*");
                }else{
                    if(k == 1 || k==(i-1)*2+1)  {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
