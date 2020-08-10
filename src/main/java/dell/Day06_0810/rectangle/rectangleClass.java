package dell.Day06_0810.rectangle;

/**
 * @Author 马小姐
 * @Date 2020/8/10 16:29
 * @Version 1.0
 * @Description:
 */
public class rectangleClass {
    public double  rectangleLong;
    public double  rectangleWidth;

    public double  perimeter( double rectangleLong,double rectangleWidth){
        double perimeterDemo = 2*(rectangleLong+rectangleWidth);
        System.out.println("长方形的周长为："+perimeterDemo);
        return  perimeterDemo;
    }

    public double area(double rectangleLong,double rectangleWidth){
        double perimeterDemo2 = rectangleLong * rectangleWidth;
        System.out.println("长方形的面积为："+perimeterDemo2);
        return perimeterDemo2;
    }

    public double getRectangleLong() {
        return rectangleLong;
    }

    public void setRectangleLong(double rectangleLong) {
        this.rectangleLong = rectangleLong;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public void setRectangleWidth(double rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }
}
