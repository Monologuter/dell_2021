package dell.Day43_0918_IOTest02.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-18 14:09
 * @Version 1.0
 * @Description:  字符输入流   java.io.Reader 是字符输入流最顶层的父类  定义了一些共性的方法  是一个抽象类
 *共性的成员方法 ： int	read()  读取单个字符。
 *               int	read(char[] cbuf)  将字符读入数组。
 *               void  close()  释放资源
 *
 *
 *
 *
 *
 *  java.io.FileReader extends InputStreamReader extends Reader
 *
 *
 *  FileReader 文件字符输入流
 *  作用：
 *      将硬盘中文件中的数据以字符文件的方式读取到内存中
 *
 *  构造方法：
 *      FileReader(String fileName) 在给定从中读取数据的文件名的情况下创建一个新 FileReader。
 *      FileReader(File file)       在给定从中读取数据的 File 的情况下创建一个新 FileReader
 *      参数：
 *          我们需要读取的文件的数据源  fileName代表的是文件的路径    file代表的就是文件
 *      作用：
 *          创建一个fileReader对象
 *          将fileReader指向要读取的文件
 *
 *
 *
 *
 * 字符输入流的使用步骤：  和字节流一样的
 *  第一步：创建一个fileReader对象  绑定数据源
 *  第二步：使用FileReader中的read方法读取文件
 *  第三步：释放步骤
 *
 *
 */
public class demo01 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("src/main/java/dell/Day41_0916/IO/c.txt");

        char[] chars = new char[1024];
        int len = 0;
        while((len = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
