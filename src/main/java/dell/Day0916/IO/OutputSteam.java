package dell.Day0916.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-16 14:17
 * @Version 1.0
 * @Description:  java.io.OutputSteam   字节输出流           此抽象类是表示所有字节流的所有类的超类
 *                定义了一些子类共性的成员方法
 *
 *                 void	close()  关闭此输出流并释放与此流有关的所有系统资源。
 *                 void	flush()  刷新此输出流并强制写出所有缓冲的输出字节。
 *                 void	write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
 *                 void	write(byte[] b, int off, int len)  将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 *                 abstract  void	write(int b) 将指定的字节写入此输出流。
 *
 *
 *                 java.io.FileOutputSteam extends  OutputSteam      FileOutputSteam文件字节输出流  把内存中的数据写到硬盘中
 *                      构造方法：
 *                          FileOutputStream(String name)  创建一个向具有指定名称的文件中写入数据的输出文件流。
 *                          FileOutputStream(File file)    创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *                          参数：写入数据的目的地
 *                              String name 目的地是一个文件路径
 *                              File   file 目的地是一个文件
 *                           构造方法的作用：
 *                              1、创建一个FileOutputSteam对象
 *                              2、会根据传递的参数（文件路径）创建一个空的文件
 *                              3、会将FileOutputSteam对象指向创建好的对象
 *
 *                  写入数据的原理：（内存-->硬盘）
 *                      java程序->JVM->OS->OS调用写数据的方法->将数据写到文件中
 *
 *                  字节输出流的使用步骤：
 *                      1、创建一个FileOutputSteam对象  构造方法中传递写入数据的目的地
 *                      2、调用FileOutputSteam对象中的方法write将数据写到文件中
 *                      3、释放资源
 *
 */
public class OutputSteam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/main/java/dell/Day0916/IO/a.txt");
        FileOutputStream fos1 = new FileOutputStream(new File("src/main/java/dell/Day0916/IO/b.txt"));

            fos.write(97);

            fos1.write(49);
            fos1.write(48);
            fos1.write(48);



            fos.close();
            fos1.close();
    }
}
