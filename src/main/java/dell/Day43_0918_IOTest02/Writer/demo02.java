package dell.Day43_0918_IOTest02.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-18 14:46
 * @Version 1.0
 * @Description:   flush和close的区别：
 *                 flush先刷新缓冲区 流对象可以继续使用
 *                 close  先刷新缓冲区  然后通知系统释放资源  之后对象就不可再次使用了
 *
 */
public class demo02 {
    public static void main(String[] args) throws IOException {

        //1、创建FileWriter对象 将对象与目的地址进行绑定
        FileWriter fw = new FileWriter("src/main/java/dell/Day41_0916/IO/c.txt");

        //2、使用write方法写入数据
        fw.write(97);

        //3、使用flush方法将内存缓冲区中的数据刷新到文件中
        fw.flush();

        //刷新之后流可以继续使用
        fw.write(98);

        //4、释放资源
        fw.close();


        //如果释放资源了 再次使用flush就没有作用了
        fw.write(99);

    }
}
