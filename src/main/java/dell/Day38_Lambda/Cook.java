package dell.Day38_Lambda;

/**
 * @Author 马小姐
 * @Date 2020-09-12 10:09
 * @Version 1.0
 * @Description:  定义一个厨子接口  内部含有唯一的抽象方法  makeFood 且没有参数 没有返回值
 *                使用Lambda的标准格式invokeCook方法  打印输出"吃饭啦"
 */
public interface Cook {
    public abstract  void makeFood();
}
