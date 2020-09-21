package dell.Day44_0920_FilerAppend;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @Author 马小姐
 * @Date 2020-09-21 10:02
 * @Version 1.0
 * @Description:  java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
 *                 Properties 类表示一个持久的属性集 Properties可以保存在流中或者在流中加载
 *                 属性列表中每个键对应的都是一个字符串
 *                 Properties是唯一一个和流相关的集合
 */

/*
*  void	load(InputStream inStream) 从输入流中读取属性列表（键和元素对）。
   void	load(Reader reader)        按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
   *
   * 可以使用Properties集合中的load方法将硬盘中保存的文件（键值对） 读取到集合中使用
   * 参数：InputStream inStream字节输入流 不能读取含有中文的键值对
   *      Reader reader  字符输入流  可以读取含有中文的键值对
   *
   * 使用步骤：
   *    1、创建Properties集合对象
   *    2、使用Properties集合对象中的load方法读取指定文件中的键值对
   *    3、遍历Properties遍历集合
   *
   * 注意事项：
   *    1、存储键值对的文件中 键和值之间的链接符号可以使用= 空格以及其他的符号
   *    2、存储键值对的文件中，我们可以使用#号进行注释  注释的键值对将不会被读取
   *    3、存储检制对的文件中键于对都是字符串 不用再加引号
*
*
* */
public class properties {
    public static void main(String[] args) throws IOException {
        //1、创建Properties集合对象
        Properties properties = new Properties();

        // 2、使用Properties集合对象中的load方法读取指定文件中的键值对
        properties.load(new FileReader("src/main/java/dell/Day41_0916/IO/q.txt"));


        //3、遍历Properties遍历集合
        Set<String> set = properties.stringPropertyNames();

        for (String key:set) {
            String value = properties.getProperty(key);
            System.out.println(key+"->"+value);
        }

    }
}














