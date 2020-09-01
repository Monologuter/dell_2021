package dell.Day29_self_study.Date;

import java.util.Date;

/**
 * @Author 马小姐
 * @Date 2020-08-31 19:19
 * @Version 1.0
 * @Description:
 */
public class demo01 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();

    }

    //计算从1970年到现在经历了多少毫秒
    private static void demo03() {
        Date date = new Date();
        System.out.println(date.getTime());
    }

    private static void demo02() {

        Date date2 = new Date(1000000000000000000L);
        System.out.println(date2);

    }


    //获取系统的当前时间
    private  static  void demo01() {
        Date date = new Date();
        System.out.println(date);

    }

}
