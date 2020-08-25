package dell.Day25.inner;

public class Circle_02 {

    private double radius = 0;

    public void Circle(double radius) {
        this.radius = radius;

        Draw draw = new Draw();
        draw.drawSahpe();
        //必须先创建成员内部类的对象，再进行访问
    }



    class Draw {     //内部类
        public void drawSahpe() {
            System.out.println(radius);  //外部类的private成员
        }
    }

}
