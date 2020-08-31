package dell.Day28.view;


import dell.Day28.data.NpcData;
import dell.Day28.model.Enemy;
import dell.Day28.model.Place;
import dell.Day28.model.Player;
import dell.Day28.service.EnemyService;
import dell.Day28.service.PlaceService;
import dell.Day28.service.PlayerService;
import dell.Day28.service.ProfessionService;
import dell.Day28.service.npc.NpcDoctorService;
import dell.Day28.service.npc.NpcMasterService;

import java.util.Scanner;

/**
 * 故事
 */
public class Story {
    // 故事中的玩家
    Player player;

    // 故事中的场景
    Place place;
    /**
     * 开始游戏
     */
    public void start(){

        // 初始化角色
        player = PlayerService.initPlayer();
        player.setProfession(ProfessionService.choiceProfession());
        menu();
    }
    /**
     * 提供游戏行动菜单供玩家选择
     */
    private void menu() {
        while (true){
        System.out.println("现在您打算做什么？");
        System.out.println("1.打怪兽");
        System.out.println("2.治疗");
        System.out.println("3.学技能");
        Scanner scanner = new Scanner(System.in);

        String b = scanner.nextLine();
        try {
            int number  =Integer.parseInt(b);
            switch (number) {
                case 1:
                    place = PlaceService.choicePlace();
                    hunt();
                    break;
                case 2:
                    System.out.println(NpcData.npcDoctor.getNpcName() + ":" + NpcData.npcDoctor.getDialogue());
                    healing();
                    break;
                case 3:
                    System.out.println(NpcData.npcMaster.getNpcName() + ":" + NpcData.npcMaster.getDialogue());
                    learnSkill();
                    break;
                default:
                    //非法操作
                    System.out.println("非法操作,请重新输入：");
                    break;
            }
        }catch (NumberFormatException e){
            System.out.println("请输入数字重新进行选择！");
        }

        }
    }
    /**
     * 打怪
     */
    private void hunt(){

        // 选择要去的场景
        System.out.println("这里有以下敌人：");
        Enemy enemy= EnemyService.choiceEnemy(place);

        // 选择要打的敌人
        PlayerService.fight(player,enemy);


        // 玩家与敌人进行战斗


    }
    /**
     * 疗伤
     */
    private void healing() {
        NpcDoctorService npc = new NpcDoctorService();
        npc.helpPlayer(player);
    }

    /**
     * 学习技能
     */
    private void learnSkill() {
        NpcMasterService npc = new NpcMasterService();
        npc.helpPlayer(player);
    }

}
