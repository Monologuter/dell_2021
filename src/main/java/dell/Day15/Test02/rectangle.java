package dell.Day15.Test02;

public class rectangle extends Shape {

    public rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    void Area() {
        System.out.println("长方形的面积位："+super.getWidth()*super.getHeight());
    }
}
