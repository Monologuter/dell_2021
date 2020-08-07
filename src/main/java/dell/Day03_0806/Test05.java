package dell.Day03_0806;

import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020/8/6 16:32
 * @Version 1.0
 * @Description:
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.print("请输入学生人数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  //num表示学生的人数

        int[] scores = new int[num]; //创建一个人数为num的整形数组用来存储分数  数组的长度是由输入的学生人数来确定的  所以学生的人数是一个变量


        //将输入的成绩存储到数组中
        System.out.print("请输入成绩：");
        for (int i = 0; i <scores.length ; i++) {
            Scanner score = new Scanner(System.in);
            scores[i] = score.nextInt();
        }

        //循环遍历数组 找出数组中的最大值
        int maxScore= scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore){
                maxScore = scores[i];
            }
        }

        //循环遍历数组 对成绩进行分类
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i] >= (maxScore-10)){
                System.out.println("第"+(i+1)+"个学生成绩为A");
            }else if (scores[i] >= (maxScore-20)){
                System.out.println("第"+(i+1)+"个学生成绩为B");
            }else if (scores[i] >= (maxScore-30)){
                System.out.println("第"+(i+1)+"个学生成绩为C");
            }else {
                System.out.println("第"+(i+1)+"个学生成绩为D");
            }

        }

    }

}
