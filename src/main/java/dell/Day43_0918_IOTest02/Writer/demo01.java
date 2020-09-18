package dell.Day43_0918_IOTest02.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-18 14:34
 * @Version 1.0
 * @Description:   字符输出流
 *
 *
 * 字符输出流的步骤：
 *  1、创建FileWriter对象 构造方法中绑定需要写入数据的目的地
 *  2、使用FileWriter中的Write方法 将数据写到缓冲区中（字符转化Wie字节的步骤）
 *  3、使用flush方法将内存缓冲区中的数据刷新到文件中
 *  4、释放资源
 *
 *
 * 注意事项：
 *  第三步刷新必须是要有的  不然的话是看不到写入的数据   因为写入数据首先是存放在内存中的
 *  必须使用flush将数据刷新到硬盘才能看到  不然程序一结束  内存中的数据就消失了  就看不到了
 *
 *
 *
 *
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/main/java/dell/Day41_0916/IO/c.txt");
        fw.write(97);
        fw.flush();
        fw.close();


    }
}
