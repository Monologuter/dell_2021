package dell.Day25.inner;

class Circle{
    private  double radius = 0;
    public  static  int count = 1;
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public static void draw(Circle circle) {
        System.out.println();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Circle.count = count;
    }

    static class Draw{
        private int radius;

        void draw(){
            System.out.println(radius);
            System.out.println(count);
        }
    }

}
