package dell.Day08;

/**
 * @Author 马小姐
 * @Date 2020/8/12 10:26
 * @Version 1.0
 * @Description:
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalConstructor cat = new AnimalConstructor("鸡","雌性",2,"咯咯咯");
        AnimalConstructor animal1 = new AnimalConstructor();
        AnimalConstructor animal2 = new AnimalConstructor();
        AnimalConstructor animal3 = new AnimalConstructor();
        AnimalConstructor animal4 = new AnimalConstructor();
        AnimalConstructor animal5 = new AnimalConstructor();
        AnimalConstructor animal6 = new AnimalConstructor();
        System.out.println(cat.getName()+cat.getSex()+cat.getLegNumber()+cat.getCallWay());

    }
}
