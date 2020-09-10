package dell.Day35.ThreadDemo03;

/**
 * @Author 马小姐
 * @Date 2020-09-10 10:51
 * @Version 1.0
 * @Description:  解决线程安全问题的第二种方式使用  同步方法     同步方法也会将方法内部的代码锁住只让一个线程执行
 * 同步方法的锁对象是谁？  就是实现类对象 ThreadSafeLock02
 *
 * 使用步骤：
 *  1、将访问了共享数据代码抽取出来  放到一个方法中
 *  2、在方法上添加一个修饰符 synchronized修饰符
 *
 * 格式：
 *  修饰符  synchronized 返回值类型 方法名（参数列表）{
 *
 *  }
 */
public class ThreadSafeLock02plus implements  Runnable{
    private static int ticket = 100;

    public static void main(String[] args) {
        //创建Runnable接口实现类对象
        ThreadSafeLock run = new ThreadSafeLock();
        System.out.println("run"+run);
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //开启多线程
        t0.start();
        t1.start();
        t2.start();

    }



    //创建一个锁对象
    Object obj = new Object();



    //设置线程任务 卖票
    @Override
    public void run() {
        System.out.println("this:"+this);
        while (true){
            payTicketstatic();
        }
    }

/*
静态同步方法的锁对象是谁呢？
不能是this  this是我们创建对象之后产生的  静态对象的优先级要高于对象
静态对象的锁对象是本类的class文件对象
* */
    public static /*synchronized */ void payTicketstatic(){
        synchronized (ThreadSafeLock02plus.class){
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
