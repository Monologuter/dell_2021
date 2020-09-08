package dell.Day34.ThreadDemo.Thread_demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-08 15:20
 * @Version 1.0
 * @Description:
 */
public class MyThread  extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }

    }
}
