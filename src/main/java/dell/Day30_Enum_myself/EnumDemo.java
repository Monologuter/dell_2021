package dell.Day30_Enum_myself;

/**
 * @Author 马小姐
 * @Date 2020-09-02 09:02
 * @Version 1.0
 * @Description:
 */

/*枚举类的使用
枚举类的理解  类的对象只有限个 确定的  我们称此类为枚举类
当需要定义一常量的时候  强烈建议使用枚举类 、
如果枚举类里面只有一个常量的时候可以当做单例模式的实现方式
如何定义枚举类：
    jdk5之前需要自定义枚举类
    jdk5及其以后可以使用enum关键字定义枚举类

*
*
*
*
* */


public class EnumDemo {
    public static void main(String[] args) {
        Season spring  =  Season.SPRING;
        System.out.println(spring);

    }

}


class Season{
    //声明Season对象的属性
    private final String seasonName ;
    private final  String seasonDesc;


    //私有化类的构造器并给对象赋值初始化

    public Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供枚举类的多个对象  public static final
    public static final Season SPRING = new Season("春天","风和日丽");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","冰天雪地");


    //获取枚举类对象的属性


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


    //提供toString方法


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
