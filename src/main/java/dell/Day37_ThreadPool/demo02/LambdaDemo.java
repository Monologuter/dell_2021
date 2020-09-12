package dell.Day37_ThreadPool.demo02;

/**
 * @Author 马小姐
 * @Date 2020-09-11 14:27
 * @Version 1.0
 * @Description:  Lambda表达式   只关注结果不关注过程
 *
 *
 * 匿名内部类的好处和弊端：
 *  好处：帮我们省去很多实现类的定义
 *  弊端：匿名内部类内的语法实在太复杂了
 *
 *
 *  lambda表达式省去了面向对象的条条框框  格式由三个部分组成
 *  一些参数   一个箭头 一段代码
 *
 *
 *  (参数列表)-> {一些重写方法的代码};
 *  解释说明 ：
 *      括号就是接口中抽象方法的参数列表 没有参数就空着  多个参数用逗号分开
 *      ->传递的意思  把参数传递给方法体{}
 *      {} 重写接口抽象方法的方法体
 *
 */

//测试
public class LambdaDemo {
    public static void main(String[] args) {

        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开启新的线程");
            }
        }).start();



        //使用lambda表达式的方式实现多线程
        new Thread(()-> {
                System.out.println(Thread.currentThread().getName()+"开启新的线程");
            }
        ).start();

    }
}
