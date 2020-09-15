package dell.Day39_0914.demo01;

import dell.Day010.inherit.test;

/**
 * @Author 马小姐
 * @Date 2020-09-14 09:25
 * @Version 1.0
 * @Description:
 */
public class Test {


    public static void main(String[] args) {

       sum(12, 13, new Calc() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });


       //使用lambda表达式

       sum(13,14,(int a ,int b)->{
            return  a+b;
       });

    }



    /*
    * 定义一个方法
    * 参数传递两个int类型的整数
    * 参数传递CalcuLate接口
    *  方法内部调用CalcuLate中的方法cale 计算两个整数的和
    *
    *
    * */

    public static  void  sum (int a , int b , Calc calc){
        int result = calc.calc(a,b);
        System.out.println(result);
    }
}



























