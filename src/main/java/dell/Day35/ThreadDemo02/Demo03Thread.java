package dell.Day35.ThreadDemo02;

/**
 * @Author 马小姐
 * @Date 2020-09-09 10:42
 * @Version 1.0
 * @Description:  匿名内部类(简化代码把子类继承父类重写父类的方法 创建子类对象 合成一步完成)的方式实现多线程的创建   匿名就是没有名字  内部类就是写在其他类内部的类
 *                把实现实现接口重写接口中的方法创建实现类对象合成一步完成
 *                匿名内部类最终产物是一个子类/实现类对象  而这个类没有名字
 *
 *                格式 new  父类/接口(){
 *                  重写父类/接口中的方法
 *                };
 */
public class Demo03Thread {
    public static void main(String[] args){
        //线程的父类是Thread
        new Thread() {
            //重写run方法 设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + "黑马");
                }
            }
        }.start();
        //线程的接口Runnable
        //Runnable r  = new RunnableImpl
        Runnable  r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + "程序员");
                }
            }
        };
        new Thread(r).start();



        //简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + "尚硅谷");
                }
            }
        }).start();
    }
}
