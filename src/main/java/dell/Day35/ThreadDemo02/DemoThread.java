package dell.Day35.ThreadDemo02;

/**
 * @Author 马小姐
 * @Date 2020-09-09 09:12
 * @Version 1.0
 * @Description: 创建多线程的第二种方式 实现Runnable接口
 *
 * 实现步骤：
 *  1、创建一个Runnable接口的实现类
 *  2、在实现类中重写Runnable接口的run方法 设置线程任务
 *  3、创建Runnable接口的实现类对象
 *  4、创建Thread类对象  构造方法中传递Runnable接口的实现类对象
 *  5、调用Thread类中的start方法开启新线程执行run方法
 */
public class DemoThread  implements Runnable{


    public static void main(String[] args) {
        DemoThread mt  = new DemoThread();
        Thread t = new Thread(mt);
        t.start();
        for (int i = 0; i < 30;i++){
            System.out.println(Thread.currentThread().getName() +"--->"+i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 20;i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}
