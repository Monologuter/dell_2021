package dell.Day02.Night;
/*
打印99乘法表

i表示行数
j表示列数

 */
public class Test03 {
    public static void main(String[] args) {
        int i ,j ;
        for (i=1;i<=9;i++){
            for(j=1;j<=i ;j++){
                System.out.print(j+"*" + i + "=" + (i*j)+ "   ");
            }
            System.out.println();
        }
    }
}
