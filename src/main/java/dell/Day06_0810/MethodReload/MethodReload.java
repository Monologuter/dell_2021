package dell.Day06_0810.MethodReload;

/**
 * @Author 马小姐
 * @Date 2020/8/10 17:03
 * @Version 1.0
 * @Description:
 */
public class MethodReload {
//    private int a;
//    private int b;
    public void methodPrint(int a,int b){
        for (int j = 0; j < a; j++) {
            for (int i = 0; i < b; i++) {
                System.out.print(("* "));
            }
            System.out.println(" ");
        }
    }
}
