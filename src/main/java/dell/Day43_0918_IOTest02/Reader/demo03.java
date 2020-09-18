package dell.Day43_0918_IOTest02.Reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-18 14:52
 * @Version 1.0
 * @Description:  输出流写数据的其他方法
 *
 *  void	write(char[] cbuf) 写入字符数组。
 *  abstract  void	write(char[] cbuf, int off, int len)  写入字符数组的某一部分。
 *
 *
 *  void	write(String str)  写入字符串。
 *  void	write(String str, int off, int len)  写入字符串的某一部分。
 *
 *
 *
 */
public class demo03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/main/java/dell/Day41_0916/IO/c.txt");


        char[]  chars = {'a','b','c','d'};


        //void	write(char[] cbuf) 写入字符数组。
        fw.write(chars);


        //abstract  void	write(char[] cbuf, int off, int len)  写入字符数组的某一部分。
        fw.write(chars,0,3);


        String s ="传智播客";

        //void	write(String str)  写入字符串。
        fw.write(s);

        //void	write(String str, int off, int len)  写入字符串的某一部分。
        fw.write(s,0,2);


        fw.flush();


        fw.close();

    }
}
