package dell.Day28.service;


import dell.Day28.data.ProfessionData;
import dell.Day28.model.Profession;

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
        System.out.println( "有这些职业供您选择：");

        // 输出游戏数据ProfessionData中存在的职业信息
        for (int i = 0; i < ProfessionData.professions.length; i++) {
            // 让每个职业以“序号.职业名”的方式输出显示
            System.out.println((i + 1) + "." + ProfessionData.professions[i].getProfessionName());
        }

        Profession profession = null;

        // 让玩家根据数字做出选择，输入有误可以重复选择
        System.out.println("请做出您的选择：");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String a  = scanner.nextLine();
            try {
                int num = Integer.parseInt(a);
                if (num == 1) {
                    profession = ProfessionData.professions[0];
                    System.out.println("您选择了"+profession.getProfessionName()+"职业");
                    break;
                }
                else if (num == 2) {
                    profession = ProfessionData.professions[1];
                    System.out.println("您选择了"+profession.getProfessionName()+"职业");
                    break;
                }else{
                    System.out.println("职业不存在,请重新选择职业：");
                }
            }catch (NumberFormatException e){
                System.out.println("请重新输入数字进行选择");
            }

        }
        return profession;
    }
}
