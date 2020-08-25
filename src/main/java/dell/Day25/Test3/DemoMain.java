package dell.Day25.Test3;

/*
*如果接口中的实现类或者父类的子类只需要使用唯一的一次
* 那么就可以省略该类的定义 使用匿名内部类
*
* 匿名内部类的定义
* 接口名称  对象名 = new   接口名称(){
*       //覆盖重写所有的抽象方法
* };
* */

public class DemoMain {
    public static void main(String[] args) {
//        MyInterfaceImpl impl = new MyInterfaceImpl();
//        impl.method();
//
//        //多态
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        MyInterface obj2 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法 ");
            }
        };
        obj2.method();
    }
}
