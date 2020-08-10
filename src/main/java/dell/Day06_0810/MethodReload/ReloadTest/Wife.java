package dell.Day06_0810.MethodReload.ReloadTest;

/**
 * @Author 马小姐
 * @Date 2020/8/10 17:34
 * @Version 1.0
 * @Description:
 */
public class Wife {
    String name = "小红";
    int age = 21;


    public void getInfo(){
        System.out.println(name+"的年龄是"+age+"岁,");
        Husband husband = new Husband();
        System.out.println("丈夫年龄："+husband.age+"   "+"丈夫姓名："+husband.name);
    }
}
