package dell.Day12.Demo01.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/18 10:39
 * @Version 1.0
 * @Description:
 */
public class Cylinder extends  Cicle {
    private int h;  //圆柱的高

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void Area(){
        System.out.println("圆柱的体积为："+super.findArea(super.getRadius())*h);
        System.out.println("圆柱的侧面表面积为："+2*Math.PI*super.getRadius()*h);
        System.out.println("圆柱的全表面积为："+super.findArea(super.getRadius())*2+2*Math.PI*super.getRadius()*h);
    }

}


