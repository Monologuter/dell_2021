package dell.Day13.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/19 9:09
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Role warrior = new Warrior(150);
        Role monster = new Monster(200);
        Role minister = new Minister(100);


        //战士遇到了九头蛇
        warrior.operate(monster);

        //战士遇到了牧师
        warrior.operate(minister);

        //牧师遇到了九头蛇
        minister.operate(monster);

        //牧师遇到了战士
        minister.operate(warrior);

        //九头蛇遇到了战士
        monster.operate(warrior);
        //九头蛇遇到了牧师
        monster.operate(minister);

    }
}
