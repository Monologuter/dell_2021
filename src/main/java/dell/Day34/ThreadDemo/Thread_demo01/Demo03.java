package dell.Day34.ThreadDemo.Thread_demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-08 17:01
 * @Version 1.0
 * @Description:  获取当前线程的名称
 *
 *        第一种：  使用Thread类中的getName()方法  String getName()返回获取的线程名称
 *        第二种：  可以获取当前正在执行的线程  使用线程中的getName()方法来获取线程的名称    System.out.println(Thread.currentThread().getName());
 */
public class Demo03  extends  Thread{
    public static void main(String[] args) {

        Show mt = new Show();
        mt.start();




        new Show().start();
        new Show().start();

        System.out.println(Thread.currentThread().getName());


    }

}

