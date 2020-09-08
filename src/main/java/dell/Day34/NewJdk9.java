package dell.Day34;

import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-09-08 10:46
 * @Version 1.0
 * @Description:  jdk9的新特性  以前的版本的时候每次只能增加一个元素比较的麻烦
 *                      List接口 Set接口 Map接口 里面增加了一个静态方法of  可以给集合一次性添加很多的元素
 *                      前提：  当集合中存储元素的个数已经确定了不在改变才可以使用
 *                      注意事项： of方法只适用于List  Set  Map接口  不能适用于接口的实现类
 *                              of方法返回值是一个不能改变的集合 所以不能在使用add  put方法添加元素
 *                              Set Map接口在调用of方法的时候不能含有重复的元素
 *
 */
public class NewJdk9 {
    public static void main(String[] args) {
       List<String> list = List.of("a","b","c","d");
        System.out.println(list);


//        list.add("f");
//        System.out.println(list);

    }
}
