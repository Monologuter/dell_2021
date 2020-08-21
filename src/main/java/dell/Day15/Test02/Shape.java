package dell.Day15.Test02;

public abstract class Shape {
    public int width;
    public int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Shape(int width) {
        this.width = width;
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

    abstract  void Area();

}
