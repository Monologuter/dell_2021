package dell.Day03_0806;

/**
 * @Author 马小姐
 * @Date 2020/8/6 14:05
 * @Version 1.0
 * @Description: 遍历数组并求出数组的最大值以及最大值的索引值
 */
public class Test03 {
    public static void main(String[] args) {
        int Array[] = new int[] {1,3,66,7878,88,90,444};
        int max = Array[0];
        int index = 0;  //定义一个index接收最大值的元素索引  初始值为0
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]>max){
                max = Array[i];
                index = i;
            }
        }
        System.out.println("最大元素的索引值为："+index);
        System.out.println("最大元素为："+max);
    }
}
