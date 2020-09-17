package dell.Day0918_IOTest02.demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author 马小姐
 * @Date 2020-09-18 08:55
 * @Version 1.0
 * @Description:  InputStream字节输入流一次输入多个字节
 *
 * 字节输入流一次读取多个字节的方法
 * int read(byte[] b)从输入流中读取一定数量的字节 并将其存储在缓冲区数组B中
 * 明确两件事情：
 *  1、方法的参数byte[] 的作用
 *      起到缓冲的作用  存储每次读取到的多个字节
 *      数组的长度一般定义为1024或者是1024的整数倍  1024字节就是1kb的字节长度
 *  2、方法的返回值int是什么
 *      每次读取到的有效字字节个数
 *
 *
 *  String类的构造方法：
 *      String(byte[]  bytes)将字节数组 转化为字符串
 *      String(byte[], int offset , int length) 将字节数组的一部分转化为字符串  offset为开始的索引   length是转化的个数
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/dell/Day0916/IO/b.txt");


//        byte[] bytes = new byte[10];
//
//        System.out.println(fis.read(bytes));
//
//        System.out.println(Arrays.toString(bytes));
//
//        System.out.println(new String(bytes));
//
//        fis.close();



        //发现以上是一个循环读取的过程 所以可以说使用while进行魂环读取  结束的条件  读取到-1结束


        //第一种方式
        int len = 0;  //记录每次读取到的有效字节个数
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!= -1) {

//            System.out.print((char)len);
            System.out.print(new String(bytes,0,len));
        }
        fis.close();


        System.out.println("================================================");

        //第二种方式
        while ((len = fis.read()) != -1){
            System.out.print((char)len);
        }
        fis.close();



    }
}
