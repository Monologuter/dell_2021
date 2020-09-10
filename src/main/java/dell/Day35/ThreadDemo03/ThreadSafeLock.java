package dell.Day35.ThreadDemo03;

/**
 * @Author 马小姐
 * @Date 2020-09-09 14:45
 * @Version 1.0
 * @Description:  线程安全问题  出现了卖不存在的票以及多个线程同时卖一张票
 *
 * 解决方案  第一种方式：使用同步代码块
 *                    格式：
 *                          synchronized(锁对象){
 *                              可能会出现线程安全问题的代码(访问了共享数据的代码)
 *                          }
 *                          注意：同步代码块中的锁对象可以是任意的对象
 *                               必须保证多个线程使用的锁对象是同一个 锁的作用就是将同步代码块锁住  只让一个线程在同步代码块中使用
 *
 *                               总结：同步中的线程  没有执行完毕是不会释放锁 同步外的线程 没有锁是进不去同步的    除了同步的线程就会将锁对象归还  所以就可以保证同步代码块中只有一个线程在执行  保证现成的安全
 *                                    但是也是有弊端的 程序频繁地判断锁  释放锁 程序的效率降低
 *
 *
 */

/*
*实现卖票案例
*
*
* */
public class ThreadSafeLock implements  Runnable{
    public static void main(String[] args) {
        //创建Runnable接口实现类对象
            ThreadSafeLock run = new ThreadSafeLock();
            Thread t0 = new Thread(run);
            Thread t1 = new Thread(run);
            Thread t2 = new Thread(run);

            //开启多线程
            t0.start();
            t1.start();
            t2.start();

    }

    //定义一个线程共享的票源
    private  int ticket = 100;


    //创建一个锁对象
    Object obj = new Object();



    //设置线程任务 卖票
    @Override
    public void run() {
       while (true){
           //创建同步代码块保证线程安全
           synchronized (obj) {
               if (ticket > 0){
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   //票存在
                   System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                   ticket -- ;
               }
           }
       }
    }
}
