package dell.Day010.inherit;

/**
 * @Author 马小姐
 * @Date 2020/8/15 11:20
 * @Version 1.0
 * @Description:
 */
public class GrandSon extends Son {
    public void  showGrandSon(){
        super.precious = "尚方宝剑第三代";
        System.out.println(precious+"这是我爷爷的传家宝");
    }
}
