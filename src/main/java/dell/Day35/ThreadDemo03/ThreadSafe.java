package dell.Day35.ThreadDemo03;

/**
 * @Author 马小姐
 * @Date 2020-09-09 14:45
 * @Version 1.0
 * @Description:  线程安全问题
 */

/*
*实现卖票案例
*
*
* */
public class ThreadSafe implements  Runnable{
    public static void main(String[] args) {
        //创建Runnable接口实现类对象
            ThreadSafe  run = new ThreadSafe();
            Thread t0 = new Thread(run);
            Thread t1 = new Thread(run);
            Thread t2 = new Thread(run);
            Thread t3 = new Thread(run);


            //开启多线程
            t0.start();
            t1.start();
            t2.start();
            t3.start();
    }

    //定义一个线程共享的票源
    private  int ticket = 100;

    //设置线程任务 卖票
    @Override
    public void run() {
       while (true){
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
