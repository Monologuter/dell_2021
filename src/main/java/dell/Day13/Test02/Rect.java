package dell.Day13.Test02;

/**
 * @Author 马小姐
 * @Date 2020/8/19 9:16
 * @Version 1.0
 * @Description:
 */
public class Rect extends MyShape {
    private  int width;
    private  int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void getLength() {
        System.out.println("长方形的周长为"+(this.height+this.width)*2);
    }


    @Override
    public void getArea() {
        System.out.println("长方形的面积为："+this.width*this.height);
    }
}
