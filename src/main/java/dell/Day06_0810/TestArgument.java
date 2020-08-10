package dell.Day06_0810;

/**
 * @Author 马小姐
 * @Date 2020/8/10 15:08
 * @Version 1.0
 * @Description:
 */
public class TestArgument {
    public static void main(String[] args) {
        int num = 10;
        TestArgument ta = new TestArgument();
        ta.show(num);
        System.out.println("主方法中：num= "+num);

    }
    void show(int i){
         i = 200;
        System.out.println("show方法中：i="+i);
    }
}
