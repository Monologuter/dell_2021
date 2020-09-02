package dell.Day30_Enum_myself;

/**
 * @Author 马小姐
 * @Date 2020-09-02 09:02
 * @Version 1.0
 * @Description:
 */


/*
* 使用enum关键字定义枚举类
*
*
*
*
*
* */
public class EnumPlus {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);

        Season summer = Season.SUMMER;
        System.out.println(summer);

        Season autumn = Season.AUTUMN;
        System.out.println(autumn);


        Season winter = Season.WINTER;
        System.out.println(winter);

    }
    
}


enum  Season1{
     SPRING("春天","风和日丽"),
     SUMMER("夏天","夏日炎炎"),
     AUTUMN("秋天","秋高气爽"),
     WINTER("冬天","冰天雪地");

     private final String seasonName;
     private final String seasonDesc;


    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

}
