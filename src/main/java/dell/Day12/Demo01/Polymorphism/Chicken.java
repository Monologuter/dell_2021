package dell.Day12.Demo01.Polymorphism;

/**
 * @Author 马小姐
 * @Date 2020/8/18 14:42
 * @Version 1.0
 * @Description:
 */
public class Chicken extends Animal {
    @Override
    public void move() {
        System.out.println("鸡在动");
    }


    @Override
    public void roar() {
        System.out.println("鸡在叫");
    }
}
