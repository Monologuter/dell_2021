package MyselfTest.Day28;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * @Author 马小姐
 * @Date 2020-08-28 14:51
 * @Version 1.0
 * @Description:
 */

class BaseClass{

    public  int book = 6;
    public void base(){
        System.out.println("父类的普通方法");
    }

    public void test(){
        System.out.println("父类test方法");
    }
}



public class SubClass extends BaseClass {
    public  String book = "哈麻皮";
    @Override
    public void test(){
        System.out.println("重写父类的test方法哈哈哈哈");
    }


    public void sub(){
        System.out.println("子类的普通方法");
    }








    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.book);
        baseClass.base();
        baseClass.test();
        System.out.println("============================================");

        SubClass subClass = new SubClass();
        System.out.println(subClass.book);
        subClass.base();
        subClass.test();
        System.out.println("============================================");

        BaseClass ploymohicBC = new SubClass();
        System.out.println(ploymohicBC.book);
        ploymohicBC.base();
        ploymohicBC.test();
        System.out.println("============================================");



//        ploymohicBC.sub();

    }

}
