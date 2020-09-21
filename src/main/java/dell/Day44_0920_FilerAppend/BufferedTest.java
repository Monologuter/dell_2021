package dell.Day44_0920_FilerAppend;

import java.io.*;

/**
 * @Author 马小姐
 * @Date 2020-09-21 14:47
 * @Version 1.0
 * @Description:  使用字节缓冲输出流和输入流进行文件的复制
 *
 * 步骤：
 *  1、创建字节缓冲输入流对象   构造方法中传递字节输入流
 *  2、创建字节缓冲输出流对象   构造方法中传递字节输出流
 *  3、使用字节缓冲输入流中的read方法  读取文件
 *  4、使用字节缓冲输出流中的write方法 将数据读取到内部缓冲区
 *  5、释放资源（会先将缓冲区中的数据刷新到文件中）
 *
 *
 *
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("src/main/java/dell/Day41_0916/IO/c.txt");
        FileOutputStream fos = new FileOutputStream("src/main/java/dell/Day41_0916/IO/f.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0 ,len));
            bos.write(bytes);

        }
        System.out.println("文件复制一共花费时间为："+(System.currentTimeMillis() - l)+"毫秒");
        bos.flush();

        bos.close();
    }
}
