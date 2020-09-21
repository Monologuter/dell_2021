package dell.Day44_0920_FilerAppend;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-21 11:17
 * @Version 1.0
 * @Description: java.io.BufferedOutputStream extends OutputStream
 *               继承自父类共性的成员方法：
 *                      void	close()  关闭此输出流并释放与此流有关的所有系统资源。
 *  *                   void	flush()  刷新此输出流并强制写出所有缓冲的输出字节。
 *  *                   void	write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
 *  *                   void	write(byte[] b, int off, int len)  将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 *  *                   abstract  void	write(int b) 将指定的字节写入此输出流。
 *
 *
 *               构造方法：
 *                  BufferedOutputStream(OutputStream out)  创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *                  BufferedOutputStream(OutputStream out, int size)  创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
 *                     参数：OutputStream字节输出流  我们可以传递FileOutputStream 缓冲流可以给OutputStream添加一个缓冲区 提高OutputStream的写入效率
 *                          int size  指定缓冲流内部缓冲区的大小 不写就是默认的
 *
 *
 *              使用步骤：
 *                  1、创建FileOutStream对象构造方法中绑定输出的目的地
 *                  2、创建BufferedOutputStream构造方法  构造方法中传递FileOutStream对象  提高FileOutStream对象的读取效率
 *                  3、使用BufferedOutputStream对象中的方法write 将数据写入到内部的缓冲区中
 *                  4、使用BufferedOutputStream对象方法中的flush 将缓冲区中的数据刷新到硬盘中
 *                  5、释放资源   先调用flush方法  后调用close方法  所以第四步可以省略
 *
 */
public class BufferedOutputStreamDemo {

    public static void main(String[] args)  throws IOException{
        //1、创建FileOutStream对象构造方法中绑定输出的目的地
        FileOutputStream fos = new FileOutputStream("src/main/java/dell/Day41_0916/IO/a.txt");

        //2、创建BufferedOutputStream对象  构造方法中传递FileOutStream对象  提高FileOutStream对象的读取效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);




        //3、使用BufferedOutputStream对象中的方法write 将数据写入到内部的缓冲区中
        bos.write("我要将数据写到内部缓冲区中".getBytes());


        //4、使用BufferedOutputStream对象方法中的flush 将缓冲区中的数据刷新到硬盘中
        bos.flush();


        //5、释放资源   先调用flush方法  后调用close方法  所以第四步可以省略
        bos.close();
        fos.close();

    }
}
