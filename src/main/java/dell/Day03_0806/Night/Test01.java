package dell.Day03_0806.Night;

/**
 * @Author 马小姐
 * @Date 2020/8/6 19:21
 * @Version 1.0
 * @Description:
 */
/*
 * 数组逆序打印
 *
 *
 * */

public class Test01 {
    public static void main(String[] args){
        int Array[] = new int[] {1,3,5,6,7};

        for (int n = 0;  n<=Array.length-1 ; n++) {
            if (n==0){
                System.out.print("初始化数组为："+"["+Array[0]+",");
            }else{
                if(n==Array.length-1){
                    System.out.print(Array[n]+"]");
                }else if(n<Array.length-1){
                    System.out.print(Array[n]+",");
                }
            }
        }
        System.out.println("\n");

        for(int i=Array.length-1;i>-1;i--){
            if (i==Array.length-1){
                System.out.print("逆序排序数组为："+"["+Array[Array.length-1]+",");
            }else{
                if(i==0){
                    System.out.print(Array[i]+"]");
                }else if(i<Array.length-1){
                    System.out.print(Array[i]+",");
                }
            }
        }
    }
}

