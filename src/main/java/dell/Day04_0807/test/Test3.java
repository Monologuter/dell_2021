package dell.Day04_0807.test;

/**
 * @Author 马小姐
 * @Date 2020/8/7 16:19
 * @Version 1.0
 * @Description:
 */
/*
* 使用二维数组打印一个十行的杨辉三角形
* */
public class Test3 {
    public static void main(String[] args) {
        int[][] array = new int[10][];
//        //i表示数组   j表示数组中的元素
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][0] = 1;
//                array[i][i] = 1;
//            }
//        }
//
//        for (int i = 2; i <array.length ; i++) {
//            for (int j = 1; j < array[i].length - 1; j++) {
//                array[i][j] = array[i-1][j-1] + array[i-1][j];
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(array[i][j]+"    ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
            for (int j = 0; j < i+1 ;j++) {
                if(j==0 || j==i){
                    array[i][j] = 1;
                }else{
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
                }
            }
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

