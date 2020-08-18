package dell.Day12.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/18 10:39
 * @Version 1.0
 * @Description:
 */
public class Cicle {
    private  int radius;  //圆柱底面半径

    public Cicle(int radius) {
        this.radius = radius;
    }

    public Cicle() {
    }

    public int getRadius() {
        return radius;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double findArea(int radius){
        return Math.PI*radius*radius;
    }
}
