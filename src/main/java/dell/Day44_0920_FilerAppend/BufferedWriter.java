package dell.Day44_0920_FilerAppend;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author 马小姐
 * @Date 2020-09-21 15:07
 * @Version 1.0
 * @Description:  java.io.BufferedWriter extends Writer
 *   BufferedWriter 字符缓冲输出流
 *   有共性的成员方法：
 *                  void	write(char[] cbuf) 写入字符数组。
 *  *               abstract  void	write(char[] cbuf, int off, int len)  写入字符数组的某一部分。
 *  *
 *  *
 *  *               void	write(String str)  写入字符串。
 *  *               void	write(String str, int off, int len)  写入字符串的某一部分。
 *
 *
 *      构造方法：
 *          BufferedWriter(Writer out)  创建一个使用默认大小输出缓冲区的缓冲字符输出流。
 *          BufferedWriter(Writer out, int sz)  创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
 *          参数：
 *              Writer out  字符输出流  我们可以传递FileWriter 缓冲流会给FileWriter增加一个缓冲区  提高FileWriter写入的效率
 *              int size  指定缓冲区的大小  不写就是默认的大小
 *
 *              特有的成员方法：
 *                  void	newLine()  写入一个行分隔符。  会根据不同的操作系统获取不同的行分隔符
 *
 *
 *
 *       步骤：
 *          1、创建一个字符缓冲输出流的对象  构造方法中传递字符输出流
 *          2、调用字符缓冲输出流中的方法write 将数据写入到缓冲区中
 *          3、调用flush方法将缓冲区中的数据刷到文件中
 *          4、释放资源
 *
 */
public class BufferedWriter {
    public static void main(String[] args) throws IOException {

        //1、创建一个字符缓冲输出流的对象  构造方法中传递字符输出流
        java.io.BufferedWriter bs = new java.io.BufferedWriter(new FileWriter("src/main/java/dell/Day41_0916/IO/c.txt"));

        //2、调用字符缓冲输出流中的方法write 将数据写入到缓冲区中
        for (int i= 0; i<10 ; i++){
            bs.write("传智播客");
            bs.newLine();
            bs.write("黑马程序员");
            bs.newLine();
        }


        //3、调用flush方法将缓冲区中的数据刷到文件中
        bs.flush();


        // 4、释放资源
        bs.close();
    }
}
