package dell.Day30_Enum_myself;

import java.util.Date;

/**
 * @Author 马小姐
 * @Date 2020-09-02 14:45
 * @Version 1.0
 * @Description:注解
 *
 *
 * 什么叫做元注解？
 * jdk的元注解用于修饰其他的注解的定义
 *jdk四种元注解
 * @Target
 * @Retention
 * @Inherited
 * @Documented
 *`
 *
 */
public class AnnotationTest {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);


    }
}
