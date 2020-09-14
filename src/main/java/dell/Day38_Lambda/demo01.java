package dell.Day38_Lambda;

/**
 * @Author 马小姐
 * @Date 2020-09-12 11:36
 * @Version 1.0
 * @Description:
 */
public class demo01 {
    public static void main(String[] args) {
        //调用invokeCook方法 传递cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }

        });



        //使用lambda表达式简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("吃饭啦");
        });
    }

    //定义一个方法  参数传递Cook接口  方法内部调用Cook接口中的方法makeFood
    public static  void invokeCook(Cook  cook){
        cook.makeFood();
    }
}
