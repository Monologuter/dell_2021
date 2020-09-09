package dell.Day35.ThreadDemo02;

/**
 * @Author 马小姐
 * @Date 2020-09-09 09:49
 * @Version 1.0
 * @Description: 线程的sleep方法
 */
public class ThreadSleep {
    public static void main(String[] args) {
        for (int i = 1; i <60 ; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
