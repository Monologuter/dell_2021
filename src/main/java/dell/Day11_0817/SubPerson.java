package dell.Day11_0817;

/**
 * @Author 马小姐
 * @Date 2020/8/17 9:26
 * @Version 1.0
 * @Description:
 */
public class SubPerson extends Person {
    @Override
    public void Cirl(int a, int b) {
        super.Cirl(12,12);
        System.out.println("长方形的面积为："+a*b);
    }
}
