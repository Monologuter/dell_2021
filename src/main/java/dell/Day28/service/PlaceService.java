package dell.Day28.service;

import dell.Day28.data.PlaceData;
import dell.Day28.model.Place;

import java.util.Scanner;

/**
 * 跟场景相关的方法
 */
public class PlaceService {
    /**
     * 选择场景
     *
     * @return 返回玩家选中的场景
     */
    public static Place choicePlace() {

        System.out.println("有这些场景可供您选择：");

        // 1.输出游戏场景数据PlaceData中存在的场景信息
        for (int i = 0; i < PlaceData.places.length; i++) {
            // 让每个场景以“序号.场景”的方式输出显示
            System.out.println((i + 1) + "." + PlaceData.places[i].getPlaceName());
        }

        // 2.定义一个场景对象以便后面返回
        Place place = null;

        // 3.让玩家根据数字做出选择，输入有误可以重复选择
        System.out.println("开心地玩吧：");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int c  = scanner.nextInt();

            if (c == 1) {
                place = PlaceData.places[0];
                System.out.println("你进入了"+place.getPlaceName()+"\n"+place.getPlaceIntroduction());
                break;
            }
            else if (c == 2) {
                place = PlaceData.places[1];
                System.out.println("你进入了"+place.getPlaceName()+"\n"+place.getPlaceIntroduction());
                break;
            }
            else if (c == 3) {
                place = PlaceData.places[2];
                System.out.println("你进入了"+place.getPlaceName()+"\n"+place.getPlaceIntroduction());
                break;
            }else{
                System.out.println("请重新选择场景：");
            }
        }

        // 4.输出场景信息
        return place;
    }
}
