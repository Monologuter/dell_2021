package dell.Day13.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/19 9:09
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Role warrior = new Warrior("战士",100);
        Role minister = new Minister("牧师",100);
        Role monster = new Monster("怪物",100);

        warrior.operate(minister);
        warrior.operate(monster);
        System.out.println("============================");
        minister.operate(monster);
        minister.operate(warrior);
        System.out.println("============================");
        monster.operate(minister);
        monster.operate(warrior);



    }
}
