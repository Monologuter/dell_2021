package dell.Day36_ThreadState.demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-10 16:01
 * @Version 1.0
 * @Description:等待唤醒机制案例分析  线程之间的通信
 *
 *模拟包子铺买包子吃包子的案例
 *
 *
 * 首先创建一个顾客的线程  告诉老板自己要的包子的种类和数量  调用wait方法  放弃cpu的执行  进入到WAITING状态(无限等待)
 * 创建一个老板的线程  花了五秒做包子  做好包子之后 调用notify方法唤醒顾客吃包子
 *
 *
 * 注意：
 *  顾客和老板线程必须使用同步代码块包裹起来 保证等待和唤醒只能有一个在执行
 *  同步使用的锁对象必须保证唯一
 *  只有锁对象才能调用wai和notify方法
 *
 *
 *  Object类中的方法
 *
 *  void wait()   等待
 *
 *  void notify() 唤醒
 *
 */
public class demo01 {
    public static void main(String[] args) {

        //创建锁对象  保证唯一

        Object obj = new Object();


        //创建一个顾客的线程
        new  Thread(){
            @Override
            public void run() {
                //一直等着买包子
               while (true){
                   //保证等待和唤醒只有一个在执行  所以需要使用同步技术
                   synchronized (obj){
                       System.out.println("告诉老板需要的包子的种类和数量");
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       //唤醒之后执行的代码
                       System.out.println("包子已经做好了可以开吃了");
                   }
               }
            }
        }.start();



        //创建一个老板的线程
        new Thread() {
            @Override
            public void run() {
                //死循环一直卖包子
                while (true) {
                    //花了五秒钟做包子 就代表睡眠五秒
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {

                        System.out.println("老板五秒中之后做好包子 告知顾客可以开始吃包子了");
                        //做好包子之后 调用notify方法唤醒顾客吃包子
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
