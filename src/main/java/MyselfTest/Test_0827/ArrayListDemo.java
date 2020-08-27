package MyselfTest.Test_0827;

import javafx.scene.control.RadioMenuItem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author 马小姐
 * @Date 2020-08-27 16:38
 * @Version 1.0
 * @Description:  集合   泛型只能保存引用类型 不能保存基本数据类型
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String> ();
        System.out.println(list);  //集合和数组不一样  数组直接打印的是地址是 但是集合直接打印的是内容

        //添加元素
        list.add("陈甜");
        list.add("华妍");
        list.add("马静娴");
        list.add("范白娇");
        list.add("陈亚");
        System.out.println(list);
        System.out.println("===================================");

        //get方法获取元素
        System.out.println(list.get(2));
        System.out.println("===================================");

        //remove方法删除元素
        System.out.println(list.remove(2)); //返回值是被删除的元素
        System.out.println(list);
        System.out.println("===================================");


        //获取集合的长度  也就是其中元素的个数
        System.out.println(list.size());
        System.out.println("===================================");


        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }


        /*
        * 泛型只能保存引用类型 不能保存基本数据类型  如果需要存储基本数据类型 就必须要使用到包装类
         *
        * */

        ArrayList<Integer> list1 = new ArrayList<Integer> ();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        System.out.println("====================================");
        System.out.println(list1.get(1));




        /*
        * 随机生成6个随机整数 然后存储到集合中
        *
        * */

        Random random = new Random();
        ArrayList<Integer> list2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            list2.add(random.nextInt());
            System.out.println(list2.get(i));
        }



        ArrayList<Integer> integerArrayList = new ArrayList();
        Random randomList = new Random(30);
        for (int i = 0; i < 6; i++) {
            int num = randomList.nextInt(33)+1;
            integerArrayList.add(num);

        }
        for (int i = 0; i < integerArrayList.size(); i++) {

            System.out.println(integerArrayList.get(i));
        }

    }

}
