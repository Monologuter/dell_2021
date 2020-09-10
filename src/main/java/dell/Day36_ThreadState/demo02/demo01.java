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
                        System.out.println("告诉老板需要的包子的种类和数量");
                        try {
                            obj.wait(5000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了可以开吃了");
                    }
                }
            }
        }.start();
    }
}
