package dell.Day34.ThreadDemo.Thread_demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-08 17:23
 * @Version 1.0
 * @Description:  设置线程的名称
 */



public class ThreadSetNameMain  {
    public static void main(String[] args) {
        //开启多线程
        ThreadSetName  mt = new ThreadSetName();
        mt.setName("小强 ");
        mt.start();


        new ThreadSetName("旺财").start();

    }

}
