package dell.Day44_0920_FilerAppend.ChangeStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author 马小姐
 * @Date 2020-09-21 20:02
 * @Version 1.0
 * @Description:   java.io.OutputStreamWriter  extends Writer
 *
 *                 OutputStreamWriter 是字符流通向字节流的桥梁：可使用指定的 charset
 *                 将要写入流中的字符编码成字节。它使用的字符集可以由名称指定或显式给定，否则将接受平台默认的字符集。
 *
 *
 *
 *                 继承自父类成员的的方法：
 *  *                      void	write(char[] cbuf) 写入字符数组。
 *  *                      abstract  void	write(char[] cbuf, int off, int len)  写入字符数组的某一部分。
 *  *
 *  *
 *  *                      void	write(String str)  写入字符串。
 *  *                      void	write(String str, int off, int len)  写入字符串的某一部分。
 *
 *
 *
 *
 *
 *              构造方法：
 *                  OutputStreamWriter(OutputStream out) 创建使用默认字符编码的 OutputStreamWriter。
 *                  OutputStreamWriter(OutputStream out, String charsetName)  创建使用指定字符集的 OutputStreamWriter
 *
 *              参数含义：OutputStream out 字节输出流 可以用来写转换后的字节到文件中
 *                      OutputStream out, String charsetName  指定编码表名称 不区分大小写 可以是uft-8  gbk  不指定就是默认uft-8
 *
 *
 *              使用步骤：
 *                  1、创建OutputStreamWriter对象 构造方法中传递字节输出流和指定的编码表名册
 *                  2、使用OutputStreamWriter对象的方法write将字符转换为字节存储在缓冲区中（编码过程）
 *                  3、使用OutputStreamWriter对象中方法flush 把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
 *                  4、释放资源
 *
 *
 *
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {

//        write_utf8();
        write_gbk();








    }

    private static void write_gbk()  throws IOException{
        //1、创建OutputStreamWriter对象 构造方法中传递字节输出流和指定的编码表名册
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/main/java/dell/Day41_0916/IO/a.txt"),"GBK");

        //2、使用OutputStreamWriter对象的方法write将字符转换为字节存储在缓冲区中（编码过程）
        osw.write("好久不见");


        //3、使用OutputStreamWriter对象中方法flush 把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();

        //4、释放资源
        osw.close();


    }

    private static void write_utf8() throws IOException {
        //1、创建OutputStreamWriter对象 构造方法中传递字节输出流和指定的编码表名册
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/main/java/dell/Day41_0916/IO/a.txt"),"UTF-8");

        //2、使用OutputStreamWriter对象的方法write将字符转换为字节存储在缓冲区中（编码过程）
        osw.write("你好");


        //3、使用OutputStreamWriter对象中方法flush 把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();

        //4、释放资源
        osw.close();
    }
}
