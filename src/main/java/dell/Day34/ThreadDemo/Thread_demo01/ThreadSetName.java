package dell.Day34.ThreadDemo.Thread_demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-08 17:23
 * @Version 1.0
 * @Description:  设置线程的名称
 */

/*
*           第一种： void	setName(String name)   改变线程名称，使之与参数 name 相同
*           第二种； 设置一个带参数的构造方法 参数传递线程名称 调用父类带参构造方法 将线程名称传递给父类  让父类给子类线程起一个名字
*                   Thread(String name) 分配新的 Thread 对象。
* */

public class ThreadSetName extends  Thread {
    public ThreadSetName() {
    }

    public ThreadSetName(String name) {
        super(name);  //将线程名称传递给父类  让父类给子类线程起一个名字
    }

    @Override
    public void run() {
        //获取线程名称
        System.out.println(Thread.currentThread().getName());

    }
}
