package dell.Day35.ThreadDemo03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 马小姐
 * @Date 2020-09-10 10:51
 * @Version 1.0
 * @Description:  解决线程安全问题的第三种方式    Lock锁
 *
 * java.util.concurrent.locks
 *
 * Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。此实现允许更灵活的结构，可以具有差别很大的属性，可以支持多个相关的 Condition 对象。
 *
 * 方法：
 *  1、void lock()     获取锁   如果锁不可用，出于线程调度目的，将禁用当前线程，并且在获得锁之前，该线程将一直处于休眠状态。
 *  2、void unlock()   释放锁

 *  java.util.concurrent.locks.ReentrantLock  implements Lock接口
 * 使用步骤：
 *  1、在成员位置创建一个ReentrantLock对象
 *  2、在可能出现线程安全问题前调用Lock接口中的方法lock获取锁
 *  3、在可能出现线程安全问题后调用Lock接口中的方法unlock释放锁

 *
 * 格式：

 */
public class ThreadSafeLock03 implements  Runnable{
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


    // 1、在成员位置创建一个ReentrantLock对象
    Lock lockTicket = new ReentrantLock();




    //设置线程任务 卖票
    @Override
    public void run() {
        System.out.println("this:"+this);
        while (true){
            //2、在可能出现线程安全问题前调用Lock接口中的方法lock获取锁
            lockTicket.lock();

            if (ticket > 0){
                try {
                    Thread.sleep(10);
                    //票存在
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket -- ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lockTicket.unlock();
                }
            }
//            lockTicket.unlock();
        }
    }
}
