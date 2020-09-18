package dell.Day41_0916.IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-17 14:28
 * @Version 1.0
 * @Description:  java.io.InputStream  字节输入流  所有输入流的超类 定义了很多公共的方法
 *
 * java.io.FileInputStream extends InputStream     FileInputStream 文件字符输入流 将硬盘中的数据读取到内存中
 * 构造方法：
 *          FileInputStream(String name)  通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
 *          FileInputStream(File file)    通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
 *          参数： 读取文件的数据源    String name文件路径      File file文件
 *          作用：
 *              1、会创建一个FileInputStream对象
 *              2、会将FileInputStream对象指定构造方法中需要读取的文件
 *
 *         读取数据的原理是什么
 *          硬盘---> 内存
 *          java程序---JVM----OS----os读取数据文件的方法---读取数据文件
 *
 *          字节输入流的步骤：
 *              1、创建FileInputStream对象  构造方法中绑定需要读取的数据源
 *              2、read读取文件
 *              3、释放资源
 *
 *
 */


/*
* int	    available()  返回此输入流下一个方法调用可以不受阻塞地从此输入流读取（或跳过）的估计字节数。
 void	    close() 关闭此输入流并释放与该流关联的所有系统资源。
 void	    mark(int readlimit) 在此输入流中标记当前的位置。
 boolean    markSupported() 测试此输入流是否支持 mark 和 reset 方法。
 abstract   int	read()  从输入流中读取数据的下一个字节。
 int	    read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 int	    read(byte[] b, int off, int len) 将输入流中最多 len 个数据字节读入 byte 数组。
 void	    reset()        将此流重新定位到最后一次对此输入流调用 mark 方法时的位置。
 long	    skip(long n)   跳过和丢弃此输入流中数据的 n 个字节。
*
*
*
*
*
* */
public class InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/dell/Day0916/IO/c.txt");
        int len = 0;
        while ((len = fis.read())!= -1){
            System.out.print((char) len);
        }
        fis.close();
    }
}
