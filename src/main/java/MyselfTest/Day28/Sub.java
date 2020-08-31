package MyselfTest.Day28;

/**
 * @Author 马小姐
 * @Date 2020-08-28 15:35
 * @Version 1.0
 * @Description:
 */


class Base{
    public  Base(){
        test();
    }

    public void test() {
        System.out.println("将要被子类重写的方法");
    }
}
public class Sub extends Base {
    private String name;
    public void test() {
        System.out.println("子类重写父类的方法"+name.length());
    }


    public static void main(String[] args) {
        Sub sub = new Sub();

    }
}
