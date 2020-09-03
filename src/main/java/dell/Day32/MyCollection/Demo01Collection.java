package dell.Day32.MyCollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author 马小姐
 * @Date 2020-09-03 09:01
 * @Version 1.0
 * @Description:
 */

/*
* java.util.Collection接口
*   所有单列集合最顶层的接口  定义了所有单列集合共性的方法  任意单列集合都可以使用Collection接口中的方法
*
* boolean add(E e)  确保此 collection 包含指定的元素（可选操作）。
* void	clear() 移除此 collection 中的所有元素（可选操作）
* boolean	remove(Object o) 从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
* boolean	contains(Object o) 如果此 collection 包含指定的元素，则返回 true。
* boolean	isEmpty() 如果此 collection 不包含元素，则返回 true。
* int	size() 返回此 collection 中的元素数。
* Object[]	toArray() 返回包含此 collection 中所有元素的数组。
*
*
* */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);  //打印的是[]    而不是地址值 说明重写了toString方法
        System.out.println("======================================");

        /*
        *  boolean add(E e)  确保此 collection 包含指定的元素（可选操作）。
         */

        coll.add("陈亚");
        coll.add("华妍");
        coll.add("陈诺");
        coll.add("a");
        System.out.println(coll);
        System.out.println("======================================");

        /*
        * void	clear() 移除此 collection 中的所有元素（可选操作）
        * */
        //删除一个存在的元素
        coll.remove("陈亚");
        System.out.println(coll);
        //删除一个不存在的元素 看下返回值是什么  结果是false
        boolean test = coll.remove("哈麻皮");
        System.out.println(test);
        //重新打印一下集合
        System.out.println(coll);
        System.out.println("======================================");

        /*
        * boolean	contains(Object o) 如果此 collection 包含指定的元素，则返回 true。
        * */
        boolean con = coll.contains("陈亚");
        System.out.println(con);
        boolean con1 = coll.contains("张三");
        System.out.println(con1);
        System.out.println("======================================");


        /*
        * boolean	isEmpty() 如果此 collection 不包含元素，则返回 true。*/
        boolean empty = coll.isEmpty();
        System.out.println(empty);
        System.out.println("======================================");


        /*
        * int	size() 返回此 collection 中的元素数。
        * */
        System.out.println(coll.size());

       /*
       * Object[]	toArray() 返回包含此 collection 中所有元素的数组。
        */
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString()+" ");
        }
        System.out.println("\n");
        System.out.println("======================================");

        /*
        * void	clear() 移除此 collection 中的所有元素（可选操作）
        * */
        coll.clear();
        System.out.println(coll);
        boolean empty1 = coll.isEmpty();
        System.out.println(empty1);


    }
}
