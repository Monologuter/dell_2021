package dell.Day44_0920_FilerAppend;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-21 11:34
 * @Version 1.0
 * @Description: java.io.BufferedInputStream  extends InputStream   字节缓冲输入流
 *
 *                  继承父类共性的成员方法：
 *                      int	    available()  返回此输入流下一个方法调用可以不受阻塞地从此输入流读取（或跳过）的估计字节数。
 *                      void	    close() 关闭此输入流并释放与该流关联的所有系统资源。
 *                      void	    mark(int readlimit) 在此输入流中标记当前的位置。
 *                      boolean    markSupported() 测试此输入流是否支持 mark 和 reset 方法。
 *                      abstract   int	read()  从输入流中读取数据的下一个字节。
 *                      int	    read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *                      int	    read(byte[] b, int off, int len) 将输入流中最多 len 个数据字节读入 byte 数组。
 *                      void	    reset()        将此流重新定位到最后一次对此输入流调用 mark 方法时的位置。
 *                      long	    skip(long n)   跳过和丢弃此输入流中数据的 n 个字节。
 *
 *
 *                 构造方法：
 *                      BufferedInputStream(InputStream in) 创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *                      BufferedInputStream(InputStream in, int size) 创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *
 *
 *                   使用步骤：
 *  *                  1、创建FileInputStream对象构造方法中绑定输出的目的地
 *  *                  2、创建BufferedInputStream构造方法  构造方法中传递FileInStream对象  提高FileInStream对象的读取效率
 *  *                  3、使用BufferedInputStream对象中的方法read 将数据写入到内部的缓冲区中
 *  *
 *  *                  5、释放资源   先调用flush方法  后调用close方法  所以第四步可以省略
 *
 *
 *
 *
 *
 *
 *
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1、创建FileInputStream对象构造方法中绑定输出的目的地
        FileInputStream fis = new FileInputStream("src/main/java/dell/Day41_0916/IO/a.txt");

        // 2、创建BufferedInputStream构造方法  构造方法中传递FileInStream对象  提高FileInStream对象的读取效率

        BufferedInputStream bis = new BufferedInputStream(fis);




        //3、使用BufferedInputStream对象中的方法read 将数据读到内部的缓冲区中
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes , 0 , len));
        }


        //4、释放资源   先调用flush方法  后调用close方法  所以第四步可以省略
        bis.close();
        fis.close();
    }
}
