package dell.Day12.Demo01;

/**
 * @Author 马小姐
 * @Date 2020/8/18 9:06
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        JavaEE e = new JavaEE();
        e.setName("陈亚");
        e.setId(12);
        e.work();

        Android android = new Android();
        android.setId(11);
        android.setName("陈亚");
        android.work();


        Network network = new Network();
        network.setId(10);
        network.setName("陈亚");
        network.work();


        Hardware hardware = new Hardware();
        hardware.setId(14);
        hardware.setName("陈亚");
        hardware.work();

    }
}
