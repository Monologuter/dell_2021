package dell.Day34.ThreadDemo.Thread_demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-08 15:15
 * @Version 1.0
 * @Description:  创建多线程程序的第一种方式  创建Thread类  我们想要实现多线程程序就必须继承Thread类
 *  步骤：
 *      创建一个Thread类
 *      在Thread的子类中重写Thread类的run方法  设置线程任务
 *      创建Thread类的子类对象
 *      调用thread；类中的start方法开启新线程 执行run方法
 *
 *      注意事项：
 *          多次启动一个线程是非法的 特别是线程已经结束执行的时候不能再重新启动
 *
 *          java程序属于抢占式调度  哪个线程的优先级高就优先执行哪个线程
 *
 */
public class Demo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("main:"+i);
        }
        MyThread thread = new MyThread();

        thread.start();

    }
}
