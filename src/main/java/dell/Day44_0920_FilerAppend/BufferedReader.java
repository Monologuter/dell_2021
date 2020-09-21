package dell.Day44_0920_FilerAppend;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-21 15:23
 * @Version 1.0
 * @Description:   java.io.BufferedReader extends Reader
 *                  继承自父类的共性成员方法：
 *                      int	read()  读取单个字符。
 *                      int	read(char[] cbuf)  将字符读入数组。
 *                      void  close()  释放资源
 *
 *
 *
 *
 *                  构造方法：
 *                      BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 *                      BufferedReader(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流。
 *                    参数意义：Reader in： 字符输出流  传递FileReader
 *                            int size 指定缓冲区的大小
 *
 *                  特有的成员方法：
 *                      String	readLine() 读取一个文本行。  读取一行文本
 *
 *
 *                  步骤：
 *                      1、创建一个字符缓冲输入流对象 构造方法中传递字符输出流
 *                      2、使用字符缓冲输入流中的方法read/readLine读取文本
 *                      3、释放资源
 *
 */
public class BufferedReader  {
    public static void main(String[] args) throws IOException {
        //1、创建一个字符缓冲输入流对象 构造方法中传递字符输出流
        java.io.BufferedReader bf = new java.io.BufferedReader(new java.io.FileReader("src/main/java/dell/Day41_0916/IO/c.txt"));

        // 2、使用字符缓冲输入流中的方法read/readLine读取文本
        String line ;

        while ((line = bf.readLine()) != null){

            System.out.println(line);
        }

        //3、释放资源
        bf.close();

    }
}
