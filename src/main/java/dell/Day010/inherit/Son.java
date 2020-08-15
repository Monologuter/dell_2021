package dell.Day010.inherit;

/**
 * @Author 马小姐
 * @Date 2020/8/15 11:20
 * @Version 1.0
 * @Description:
 */
public class Son extends Father {

    public void showSon(){
        super.precious = "尚方宝剑第二代";
        System.out.println(precious+"这是我父亲的传家宝");
    }
}
