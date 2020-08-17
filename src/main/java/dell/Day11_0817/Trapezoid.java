package dell.Day11_0817;

/**
 * @Author 马小姐
 * @Date 2020/8/17 10:10
 * @Version 1.0
 * @Description:
 */
public class Trapezoid extends  Shape {
    @Override
    void Trapezoid(int a , int b , int c) {
        System.out.println("梯形的面积为："+(2*(a+b)*c));
    }
}
