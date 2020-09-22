package dell.Day44_0920_FilerAppend.ChangeStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author 马小姐
 * @Date 2020-09-22 08:53
 * @Version 1.0
 * @Description:  java.io.InputStreamReader  extends Reader
 *
 *
 *              InputStreamReader：InputStreamReader 是字节流通向字符流的桥梁：
 *                                 它使用指定的 charset 读取字节并将其解码为字符。
 *                                 它使用的字符集可以由名称指定或显式给定，或者可以接受平台默认的字符集。
 *
 *
 *              继承自父类的共性的成员方法：
 *  *                      int	read()  读取单个字符。
 *  *                      int	read(char[] cbuf)  将字符读入数组。
 *  *                      void  close()  释放资源
 *
 *
 *
 *              构造方法：
 *                  InputStreamReader(InputStream in) 创建一个使用默认字符集的 InputStreamReader。
 *                  InputStreamReader(InputStream in, String charsetName) 创建使用指定字符集的 InputStreamReader。
 *
 *                  参数含义：InputStream  字节输入流 用来读取文件中保存的字节
 *                          String charsetName 指定的编码集
 *
 *
 *              使用步骤：
 *                  1、创建InputStreamReader对象  参数传递字节输入流和指定的编码集
 *                  2、使用InputStreamReade的方法read读取文件
 *                  3、释放资源
 *
 *                  注意事项：构造方法中指定的编码名称要和文件的编码一样 否则就会乱码
 *
 *
 *
 *
 *
 *
 *
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {

        read_utf8();
        read_gbk();

    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/main/java/dell/Day41_0916/IO/a.txt"),"GBK");

        int length = 0;

        while ((length = isr.read()) != -1){
            System.out.print((char) length);
        }



        isr.close();

    }

    //使用InputStreamReade读取utf8格式的文件
    private static void read_utf8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/main/java/dell/Day41_0916/IO/a.txt"),"utf-8");

        int length = 0;

        while ((length = isr.read()) != -1){
            System.out.print((char) length);
        }



        isr.close();


    }
}
