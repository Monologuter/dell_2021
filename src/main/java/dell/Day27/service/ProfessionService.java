package dell.Day27.service;


import dell.Day27.data.ProfessionData;
import dell.Day27.model.Profession;

import java.util.Scanner;

/**
 * 跟职业相关的功能
 */
public class ProfessionService {

    /**
     * 选择职业
     *
     * @return 返回玩家选中的职业
     */
    public static Profession choiceProfession() {

        Profession profession = null;

        System.out.println("有这些职业供您选择：");

        // 输出游戏数据ProfessionData中存在的职业信息
        for (int i = 0; i < ProfessionData.professions.length; i++) {
            // 让每个职业以“序号.职业名”的方式输出显示
            System.out.println((i + 1) + "." + ProfessionData.professions[i].getProfessionName());
        }

        // 让玩家根据数字做出选择，输入有误可以重复选择
        System.out.println("请做出你的选择:");
        while (true) {
            int j = new Scanner(System.in).nextInt();
            if (j == 1 ){
                System.out.println("你选择的职业是："+ProfessionData.professions[1].getProfessionName());
            }else if (j == 2){
                System.out.println("你选择的职业是："+ProfessionData.professions[2].getProfessionName());
            }else {
                System.out.println("你输入的职业不合法！重新选择");

            }
            return choiceProfession();
        }



    }
}
