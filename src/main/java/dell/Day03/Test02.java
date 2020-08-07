package dell.Day03;

/**
 * @Author 马小姐
 * @Date 2020/8/6 14:01
 * @Version 1.0
 * @Description:
 */
public class Test02 {
    public static void main(String[] args) {
        double sum = 0.0;
        double Array[] = new double[] {12.6,77.0,45.7,2222,5};
        for (int i = 0; i <=Array.length-1 ; i++) {
            sum += Array[i];
        }
        System.out.println("数组的和为"+sum);
    }
}
