package dell.Day13.Test02;

/**
 * @Author 马小姐
 * @Date 2020/8/19 9:20
 * @Version 1.0
 * @Description:
 */
public class Circle extends MyShape {
    private  int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void getLength() {
        System.out.println("圆形的周长为"+Math.PI*2*this.radius);
    }

    @Override
    public void getArea() {
        System.out.println("圆形的面积为"+Math.PI*this.radius*this.radius);
    }
}
