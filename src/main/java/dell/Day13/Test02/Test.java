package dell.Day13.Test02;

/**
 * @Author 马小姐
 * @Date 2020/8/19 9:24
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyShape cicle = new Circle(11);
        MyShape rect = new Rect(12,12);


        cicle.getArea();
        rect.getArea();

        cicle.getLength();
        rect.getLength();
    }
//
//
//    public  void print(MyShape myShape){
//        MyShape cicle = new Circle(11);
//        MyShape rect = new Rect(12,12);
//
//
//        cicle.getLength();
//        cicle.getArea();
//
//        rect.getArea();
//        rect.getLength();
//
//    }
}
