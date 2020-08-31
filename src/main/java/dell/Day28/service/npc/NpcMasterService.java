package dell.Day28.service.npc;



import dell.Day28.data.NpcData;
import dell.Day28.model.Player;
import dell.Day28.model.Skill;

import java.util.List;
import java.util.Scanner;

/**
 * 包含技能导师npc具有的方法
 */
public class NpcMasterService extends AbstractNpcService {
    /**
     * 构造方法，在实例化技能导师npc时生效
     */
    public NpcMasterService() {

        // 给从父类继承的npc对象进行赋值
        this.npc = NpcData.npcMaster;

    }

    /**
     * 支付金币学习技能
     *
     * @param player
     */
    @Override
    public void helpPlayer(Player player) {
        System.out.println("学习初级技能需要花费4000，学习高级技能需要花费10000.......");

        List<Skill> list = player.getProfession().getSkills();

//                遍历输出系统技能列表
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i).getSkillName() + list.get(i).getSkillInstruction());
        }
        System.out.println("你需要学习什么技能？");

        Scanner scanner = new Scanner(System.in);
        int g = scanner.nextInt();
        if (g == 1) {
            if (player.getSkills().contains(list.get(0))) {
                System.out.println("你已经拥有这项技能了");
            } else {

                if (player.getMoney() < 5000) {
                    System.out.println("抱歉，你的金币不够，快去获得吧");
                } else {

                    System.out.println("需要学习该项技能吗？请输入Y/y开始学习!");
                    String h = scanner.next();
                    if (h.charAt(0) == 'Y' || h.charAt(0)== 'y') {
                        player.setMoney(player.getMoney() - 4000);
                        System.out.println("当前金钱为：" + player.getMoney());
                        List<Skill> playSkill = player.getSkills();
                        playSkill.add(list.get(0));
                        player.setSkills(playSkill);
                        System.out.println("你变得更加强大了");

                    } else {
                        System.out.println("不想学的话就算了吧");
                    }
                }
            }
        } else if (g == 2) {
            if (player.getSkills().contains(list.get(1))) {
                System.out.println("你已经拥有这技能了");
            } else {

                if (player.getMoney() < 10000) {
                    System.out.println("抱歉，你的金币不够，快去获得吧");
                } else {
                    System.out.println("需要学习该项技能吗？请输入Y/y开始学习!");
                    String i = scanner.next();
                    if (i.charAt(0) == 'Y' || i.charAt(0)== 'y') {
                        player.setMoney(player.getMoney() - 10000);
                        System.out.println("当前金钱为：" + player.getMoney());
                        List<Skill> playSkill = player.getSkills();
                        playSkill.add(list.get(1));
                        player.setSkills(playSkill);
                        System.out.println("你变得更加强大了");

                    } else {
                        System.out.println("不想学就算了吧!");
                    }
                }
            }
        }
        System.out.println("当前拥有技能为：");
        for (int a = 0; a < player.getSkills().size(); a++) {
            System.out.println((a + 1) + "." + player.getSkills().get(a).getSkillName());
        }
    }
}

