package dell.Day010.inherit;

/**
 * @Author 马小姐
 * @Date 2020/8/15 11:24
 * @Version 1.0
 * @Description:
 */
public class SonTest {
    public static void main(String[] args) {
        Father father = new Father();
        father.show();
        System.out.println("==============================");

        Son son = new Son();
        son.show();
        son.showSon();
        System.out.println("==============================");

        GrandSon grandSon = new GrandSon();
        grandSon.show();
        grandSon.showSon();
        grandSon.showGrandSon();

    }
}
