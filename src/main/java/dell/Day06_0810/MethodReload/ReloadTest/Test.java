package dell.Day06_0810.MethodReload.ReloadTest;

/**
 * @Author 马小姐
 * @Date 2020/8/10 17:40
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Wife wife = new  Wife();
        wife.getInfo();

        System.out.println("======================================");

        Husband husband = new Husband();
        husband.getInfo();


    }
}
