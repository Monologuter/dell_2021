package dell.Day37_ThreadPool.demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-11 11:18
 * @Version 1.0
 * @Description:
 */
public class RunnableImpl  implements  Runnable{

    //2、创建一个类实现Runnable接口 重写run方法设置线程程序
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行");
    }
}
