package dell.Day37_ThreadPool.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author 马小姐
 * @Date 2020-09-11 09:08
 * @Version 1.0
 * @Description:  线程池是什么？  线程池就是一个容纳多个线程的容器 省去了大量创建线程对象的操作 无需反复创建线程而消耗过多的资源
 *
 *
 *
 * jdk1.5之后提供的
 *
 * java.util.concurrent.Executors   线程池的工厂类  用来生产线程池
 *
 * static ExecutorService	newFixedThreadPool(int nThreads) 创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程
 *              参数：
 *                  int nThread  创建线程池中包含的线程数量
 *              返回值： ExecutorService 接口  返回的是ExecutorService接口的实现类对象  我们可以使用ExecutorService接口来接收（面向接口编程）
 *
 *java.util.concurrent.Executors:线程池接口  用来从线程池中调用start方法执行线池任务
 *
 *
 *
 *
 *
 *
 *
        <T> Future<T> submit(Callable<T> task) 提交一个返回值的任务用于执行，返回一个表示任务的未决结果的 Future。

         关闭销毁线程池的方法
        List<Runnable>	shutdownNow() 试图停止所有正在执行的活动任务，暂停处理正在等待的任务，并返回等待执行的任务列表。
 *
 *
 *
 *
 * 线程池的使用步骤：
 *  1、使用线程池的工厂类Executors里面的静态方法newFixedThreadPool(int nThreads)生产一个指定线程数量的线程池
 *  2、创建一个类实现Runnable接口 重写run方法设置线程程序
 *  3、调用 ExecutorService中的submit 传递线程任务 开启线程 执行run方法
 *  4、调用 ExecutorService中的shutdown方法 销毁线程池  但是不建议使用
 *
 *
 *              
 *
 */
public class ThreadPoolDemo01 {
    public static void main(String[] args) {
        //1、使用线程池的工厂类Executors里面的静态方法newFixedThreadPool(int nThreads)生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //3、调用 ExecutorService中的submit 传递线程任务 开启线程 执行run方法
        es.submit(new RunnableImpl()); //pool-1-thread-1创建了一个新的线程执行

        //readme 线程池会一直开启使用完了线程会自动将线程归还给线程  所以定义了两个线程数量的线程池 线程1可以执行两次


        es.submit(new RunnableImpl()); //pool-1-thread-1创建了一个新的线程执行
        es.submit(new RunnableImpl()); //pool-1-thread-2创建了一个新的线程执行

        //4、调用 ExecutorService中的shutdown方法 销毁线程池  但是不建议使用
        es.shutdown();

        //.RejectedExecutionException: Task java.util.concurrent.FutureTask@7229724f[Not completed
        //销毁完了线程之后就不能再次开启了 谨慎使用shutdown()
        es.submit(new RunnableImpl());




    }
}
