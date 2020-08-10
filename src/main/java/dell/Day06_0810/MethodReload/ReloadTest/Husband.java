package dell.Day06_0810.MethodReload.ReloadTest;

/**
 * @Author 马小姐
 * @Date 2020/8/10 17:34
 * @Version 1.0
 * @Description:
 */
public class Husband {
    String name = "小刚";
    int age = 22;

    public void getInfo(){
        System.out.println(name+"的年龄是"+age+"岁,");
        Wife wife = new Wife();
        System.out.println("妻子年龄："+wife.age+"   "+"妻子姓名："+wife.name);
    }
}
