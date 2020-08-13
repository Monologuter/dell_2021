package dell.Day09.ThisKeyword;

/**
 * @Author 马小姐
 * @Date 2020/8/13 8:58
 * @Version 1.0
 * @Description:
 */
public class ThisDemo {
    private String name;
    private int age;

    //无参构造函数
    public ThisDemo() {
        System.out.println("无参构造函数");
    }

    //只有一个参数的构造函数
    public ThisDemo(String name) {
        this();
        this.name = name;
        System.out.println("第二个构造函数");
    }

    //只有一个参数的构造函数
    public ThisDemo(int age) {
        this.age = age;
    }



    //全参构造函数
    public ThisDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public  void sleep(){
        System.out.println("睡觉");
    }

    public void  work(){
        System.out.println("上班");
    }

    public void move(){
        this.sleep();
        this.work();
    }


    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        ThisDemo thisDemo1 = new ThisDemo("张三");

//        thisDemo.move();


    }
}
