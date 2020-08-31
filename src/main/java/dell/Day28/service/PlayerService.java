package dell.Day28.service;

import dell.Day28.model.Enemy;
import dell.Day28.model.Player;
import dell.Day28.util.ScannerUtil;

import java.util.Scanner;

public class PlayerService {
    /**
     * 初始化玩家角色信息
     *
     * @return 返回实例化的player对象
     */
    public static Player initPlayer() {

        // 1.输出欢迎信息
        System.out.println("*****************************************");
        System.out.println("欢迎来到大型文字角色扮演游戏《佛魔录》");
        System.out.println("我该如何称呼你？");


        // 2.输出角色名
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        // 3.调用构造函数初始化角色
        Player player = new Player(name,1,0,100000,5,5,50,100,50,50);

        // 4.输出初始化结果信息
        System.out.println("角色初始化完毕,您的附魔之路即将开启！");

        return player;
    }

    /**
     * 玩家跟敌人战斗
     *
     * @param player
     *            参与战斗的玩家
     * @param enemy
     *            挑战的敌人
     */
    public static void fight(Player player, Enemy enemy) {

        // 1.使用do-while循环，持续进行战斗，到有一方血量扣完为止

        do {
//            普通攻击
            //action(player);//玩家攻击力
            int f = action(player);
            if (f == 1) {

                enemy.setHp(enemy.getHp() - (attack(player) - enemy.getDefense()));
                System.out.println("你对" + enemy.getEnemyName() + "造成了" + (attack(player) - enemy.getDefense()) + "伤害");

                if (enemy.getHp() <= 0) {
                    System.out.println(enemy.getEnemyName() + "剩余血量为0");
                } else {
                    System.out.println(enemy.getEnemyName() + "剩余血量为" + enemy.getHp());
                }

                if (EnemyService.action(enemy) - player.getDefense()<=0){
                    System.out.println(enemy.getEnemyName() + "的攻击没有破防，未对你造成伤害");
                    System.out.println("你剩余血量为" + player.getHp());
                }else {
                    player.setHp(player.getHp() - (EnemyService.action(enemy) - player.getDefense()));
                    System.out.println(enemy.getEnemyName() + "对你造成了" + (EnemyService.action(enemy) - player.getDefense()) + "伤害");
                    if (player.getHp()<=0){
                        System.out.println("你剩余血量为0");
                    }else {
                        System.out.println("你剩余血量为" + player.getHp() + "，剩余蓝量为" + player.getMana());
                    }
                }
               // break;
            } else if (f == 2) {
//              技能攻击
                if (player.getSkills().size() == 0) {
                    System.out.println("你还未学习技能！");
                } else {
                    System.out.println("当前拥有技能为：");
                    for (int a = 0; a < player.getSkills().size(); a++) {
                        System.out.println((a + 1) + "." + player.getSkills().get(a).getSkillName());
                    }

                    System.out.println("请选择使用的技能：");

                    Scanner scanner = new Scanner(System.in);
                    int j = scanner.nextInt();
                    if (j > player.getSkills().size()) {
                        System.out.println("请重新选择技能");
                    } else {
                        if (j == 1) {

                            if (player.getMana() < player.getSkills().get(j - 1).getMana()) {
                                System.out.println("你的蓝量为：" + player.getMana() + "，技能释放所需蓝量为：" + player.getSkills().get(j - 1).getMana() + "，你并没有足够的蓝量释放技能。");
                            } else {

                                enemy.setHp(enemy.getHp() - (attack(player) * player.getSkills().get(j - 1).getAttackAddition()));
                                player.setMana(player.getMana()-player.getSkills().get(j - 1).getMana());

                                System.out.println("你对" + enemy.getEnemyName() + "造成了" + (attack(player) * player.getSkills().get(j - 1).getAttackAddition()) + "伤害");

                                if (enemy.getHp() <= 0) {
                                    System.out.println(enemy.getEnemyName() + "剩余血量为0");
                                } else {
                                    System.out.println(enemy.getEnemyName() + "剩余血量为" + enemy.getHp());
                                }

                                if (EnemyService.action(enemy) - player.getDefense() <= 0) {
                                    System.out.println(enemy.getEnemyName() + "的攻击没有破防，未对你造成伤害");
                                    System.out.println("你剩余血量为" + player.getHp()+"，剩余蓝量为"+player.getMana());
                                } else {
                                    player.setHp(player.getHp() - (EnemyService.action(enemy) - player.getDefense()));
                                    System.out.println(enemy.getEnemyName() + "对你造成了" + (EnemyService.action(enemy) - player.getDefense()) + "伤害");

                                    if (player.getHp()<=0){
                                        System.out.println("你剩余血量为0");
                                    }else {
                                        System.out.println("你剩余血量为" + player.getHp() + "，剩余蓝量为" + player.getMana());
                                    }
                                    break;
                                }
                            }
                        }

                        if (j == 2) {
                            if (player.getMana() < player.getSkills().get(j - 1).getMana()) {
                                System.out.println("你的蓝量为：" + player.getMana() + "，技能释放所需蓝量为：" + player.getSkills().get(j - 1).getMana() + "，你并没有足够的蓝量释放技能。");
                            } else {

                                enemy.setHp(enemy.getHp() - (attack(player) * player.getSkills().get(j - 1).getAttackAddition()));
                                player.setMana(player.getMana()-player.getSkills().get(j - 1).getMana());

                                System.out.println("你对" + enemy.getEnemyName() + "造成了" + (attack(player) * player.getSkills().get(j - 1).getAttackAddition()) + "伤害");

                                if (enemy.getHp() <= 0) {
                                    System.out.println(enemy.getEnemyName() + "剩余血量为0");
                                } else {
                                    System.out.println(enemy.getEnemyName() + "剩余血量为" + enemy.getHp());
                                }

                                if (EnemyService.action(enemy) - player.getDefense() <= 0) {
                                    System.out.println(enemy.getEnemyName() + "的攻击没有破防，未对你造成伤害");
                                    System.out.println("你剩余血量为" + player.getHp()+"，剩余蓝量为"+player.getMana());
                                } else {
                                    player.setHp(player.getHp() - (EnemyService.action(enemy) - player.getDefense()));
                                    System.out.println(enemy.getEnemyName() + "对你造成了" + (EnemyService.action(enemy) - player.getDefense()) + "伤害");
                                    if (player.getHp()<=0){
                                        System.out.println("你剩余血量为0");
                                    }else {
                                        System.out.println("你剩余血量为" + player.getHp() + "，剩余蓝量为" + player.getMana());
                                    }

                                    break;

                                }
                            }
                        }
                    }
                }
            }else{
                System.out.println("请重新选择：");
            }
            } while (player.getHp() > 0 && enemy.getHp() > 0) ;

            // 2.玩家选择行为


            // 3.敌人生命值进行扣减


            // 4.对于敌人是否战败进行判断
        if (player.getHp() <= 0){
            System.out.println("游戏结束！大侠请重新来过！");
            System.exit(0);
        }

        if (enemy.getHp() <= 0){
            victory(player,enemy);

        }

    }
    /**
     * 玩家选择战斗中的行为,攻击或者释放技能
     *
     * @param player
     *            参与战斗的玩家
     * @return 对敌人造成伤害
     */
    private static int action(Player player) {

        // 输出可选行动
        System.out.println("当前回合，您可采取如下行动：");
        System.out.println("1.攻击");
        System.out.println("2.施法");
       // Scanner scanner = new Scanner(System.in);
        int i = ScannerUtil.scanner.nextInt();
        return i;
    }
    /**
     * 玩家对敌人进行普通攻击
     *
     * @param player
     *            参与战斗的玩家
     * @return 攻击产生的伤害
     */
    private static int attack(Player player) {
        return player.getAttack();
    }
    /**
     * 战斗胜利后玩家获得金钱奖励，以及经验
     * 升级玩家可以提升属性
     *
     * @param player
     *            战斗胜利的玩家
     * @param enemy
     *            被击败的敌人
     */
    private static void victory(Player player, Enemy enemy) {
        System.out.println("恭喜你打败了"+enemy.getEnemyName());
        levelUp(player,enemy);
        System.out.println("当前属性为：姓名："+player.getPlayerName()+",等级："+player.getLevel()+"，经验值："+player.getExp()+
                "金钱："+player.getMoney()+",攻击力："+player.getAttack()+"，防御力："+player.getDefense()+"，血量值："+
                player.getHp()+"，最大血量值："+player.getMaxHp()+"，魔力值："+player.getMana()+",最大魔力值："+player.getMaxMana());
    }
    /**
     * 玩家升级
     *
     * @param player
     *            要升级的玩家
     */
    private static void levelUp(Player player,Enemy enemy) {
//        等级经验升级
        player.setExp(player.getExp()+enemy.getExp());
        if (player.getExp()>=100){
            player.setExp(player.getExp()+1);
            player.setExp(0);
            player.setMoney(player.getMoney()+enemy.getMoney());
            player.setAttack(player.getAttack()+player.getProfession().getAttackGrow());
            player.setDefense(player.getDefense()+player.getProfession().getDefenseGrow());
            player.setMaxHp(player.getMaxHp()+player.getProfession().getHpGrow());
            player.setHp(player.getMaxHp());
            player.setMaxMana(player.getMaxMana()+player.getProfession().getManaGrow());
            player.setMana(player.getMaxMana());
        }else {
            player.setExp(player.getExp()+enemy.getExp());
        }


    }

    /**
     * 玩家对敌人释放技能进行攻击
     *
     * @param player
     *            参与战斗的玩家
     * @return 技能产生的伤害
     */
//    没用上
    private static int userSkill(Player player) {

      return 0;
    }

}
