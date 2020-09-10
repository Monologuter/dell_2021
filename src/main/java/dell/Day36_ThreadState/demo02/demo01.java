package dell.Day36_ThreadState.demo02;

/**
 * @Author 马小姐
 * @Date 2020-09-10 16:24
 * @Version 1.0
 * @Description:  等待唤醒机制
 *
 * 进入到TimeWaiting(计时等待)  有两种方式
          第一种：使用sleep方法  在等待相应时间后线程唤醒进入Runnable/Blocked(阻塞)状态
          第二种：使用wait方法   wait方法在相应时间结束 还没有被notify唤醒 就会自动醒来 进入Runnable/Blocked状态



    唤醒的两种方式：
         void notify() 唤醒在此对象上等待的单个线程
         void notifyAll()  唤醒在此对象上监视的所有线程
 *
 * */
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
                        System.out.println("顾客1告诉老板需要的包子的种类和数量");
                        try {
                            obj.wait(5000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了,顾客1可以开吃了");
                        System.out.println("=======================================================================");
                    }
                }
            }
        }.start();





        new  Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while (true){
                    //保证等待和唤醒只有一个在执行  所以需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客2告诉老板需要的包子的种类和数量");
                        try {
                            obj.wait(5000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客2可以开吃了");
                        System.out.println("=======================================================================");
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
//                        obj.notify();   //如果有多个等待的线程  随机唤醒
                        obj.notifyAll();  //唤醒所有的线程
                    }
                }
            }
        }.start();
    }
}
