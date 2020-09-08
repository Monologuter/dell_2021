package dell.Day34.ThreadDemo.Thread_demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-08 17:03
 * @Version 1.0
 * @Description:
 */
public class Show   extends  Thread {
    @Override
    public void run() {
//        System.out.println(getName());
//        System.out.println(Thread.currentThread());


        //链式编程
        System.out.println(Thread.currentThread().getName());

    }
}
