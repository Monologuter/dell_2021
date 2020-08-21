package dell.Day15.Test02;

public class Cicle extends Shape {
    public Cicle(int width) {
        super(width);
    }

    @Override
    void Area() {
        System.out.println("圆形的面积为："+Math.PI*width*width);
    }
}
