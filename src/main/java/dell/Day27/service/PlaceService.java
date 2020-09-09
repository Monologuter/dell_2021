package dell.Day27.service;
import dell.Day27.data.PlaceData;
import dell.Day27.model.Place;

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
            // 让每个游戏场景按照游戏名以及游戏的介绍展示
            System.out.println((i + 1) + "." + PlaceData.places[i].getPlaceName());
        }

        // 2.定义一个场景对象以便后面返回

        Place place = null;



        // 3.让玩家根据数字做出选择，输入有误可以重复选择
        System.out.println("请输入你需要选择的游戏场景");

        // 4.输出场景信息


        return choicePlace();
    }
}
