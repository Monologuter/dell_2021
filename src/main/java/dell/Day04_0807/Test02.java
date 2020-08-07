package dell.Day04_0807;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/7 11:58
 * @Version 1.0
 * @Description: 二分法查找一个有序数组里面的一个元素  注意是有序
 */
public class Test02 {
    public static void main(String[] args) {

        int[] arr = new int[]{23,11,89,56,1,22,654};
        ArraySort.Sort(arr);
        System.out.print("请输入需要查找的元素:");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int start = 0;  //数组起始位置的下标
        int end  = arr.length-1;  //数组最后一个元素的下标
        int mid = 0;  //每次更新的中间位置元素的下标 默认为0;
        int index = -1;  //代表的是当查找的元素不存在的时候输出index=-1
        while (start <= end){
            //找到当前待查询数组的中间位置
            mid = (start  + end) /2;
            if(arr[mid] == n){
                index = mid;
                break;
            }else if (arr[mid] < n){
                start = mid +1;
            }else if (arr[mid]>n){
                end = mid -1;
            }
        }
        System.out.println("需要查找的元素的下标为"+index);
    }
}
