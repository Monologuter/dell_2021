package dell.Day28.service;

import dell.Day28.model.Enemy;
import dell.Day28.model.Place;

import java.util.Scanner;

public class EnemyService {
    /**
     * 选择敌人
     * @param place
     * @return
     */
    public static Enemy choiceEnemy(Place place) {
        // 1.从传入的场景place中拿到场景中有的敌人
        int i = 0;
        Enemy[] enemy = place.getEnemys();
        Enemy enemy1 = new Enemy();
        // 2.显示全部场景中的敌人
        for (;i<enemy.length;i++){
            System.out.println((i + 1) + "." + enemy[i].getEnemyName());
        }
//        选择敌人
        System.out.println("请选择你需要挑战的敌人：");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String str  = scanner.nextLine();
            try {
                int num  = Integer.parseInt(str);
                if (num == 1) {
                    System.out.println("你的敌人为："+enemy[0].getEnemyName());
                    enemy1=enemy[0];
                    break;
                }
                else if (num == 2) {
                    System.out.println("您遭遇了敌人："+enemy[1].getEnemyName());
                    enemy1=enemy[1];
                    break;
                }
                else if (num == 3) {
                    System.out.println("你的敌人为："+enemy[2].getEnemyName());
                    enemy1=enemy[2];
                    break;
                }else{
                    System.out.println("请重新选择你的敌人：");
                }
            }catch (NumberFormatException e) {
                System.out.println("请重新输入数字进行选择");
            }
        }
        return enemy1;
    }

    public static int action(Enemy enemy) {
        return attack(enemy);
    }

    /**
     * 敌人普通攻击
     *
     * @param enemy
     *            对战中的敌人
     * @return 敌人普通攻击造成的伤害
     */
    private static int attack(Enemy enemy) {
        return enemy.getAttack();
    }
}
