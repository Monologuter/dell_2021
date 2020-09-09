    package dell.Day27.view;

import dell.Day27.model.Place;
import dell.Day27.model.Player;
import dell.Day27.service.PlaceService;
import dell.Day27.service.PlayerService;
import dell.Day27.service.ProfessionService;

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



        //职业选择
        player.setProfession(ProfessionService.choiceProfession());



        //场景选择
        place = PlaceService.choicePlace();





    }
    /**
     * 提供游戏行动菜单供玩家选择
     */
    private void menu() {
        System.out.println("你现在打算做什么？");


    }
    /**
     * 打怪
     */
    private void hunt(){

        // 选择要去的场景


        // 选择要打的敌人


        // 玩家与敌人进行战斗


    }
    /**
     * 疗伤
     */
    private void healing() {



    }

    /**
     * 学习技能
     */
    private void learnSkill() {




    }

}
