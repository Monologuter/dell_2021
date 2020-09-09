package dell.Day35.ThreadDemo02;

/**
 * @Author 马小姐
 * @Date 2020-09-09 09:20
 * @Version 1.0
 * @Description:
 */
public class demo02Thread implements  Runnable{
    private static int i;

    public static void main(String[] args) {
        demo02Thread mt = new demo02Thread();
        Thread thread = new Thread(mt);
        mt.run();
        while ( i <20){
            System.out.println(Thread.currentThread().getName() + "main方法中的run()方法在运行");
            i++;

        }
    }


    @Override
    public void run() {
        while (i <10){
            System.out.println(Thread.currentThread().getName() + "demo02Thread类中的run()方法在运行");
            i++;

        }
    }
}
