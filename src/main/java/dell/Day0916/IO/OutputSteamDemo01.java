package dell.Day0916.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author 马小姐
 * @Date 2020-09-17 09:21
 * @Version 1.0
 * @Description:
 */
public class OutputSteamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("src/main/java/dell/Day0916/IO/b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);

        //void	write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
        /*注意：  如果写的第一个字节是正数（0-127） 那么显示的时候会查询ASCII表    如果第一个是负数  那么第一个字节和第二个字节会组成中文显示 查询系统默认码表
        * */
        byte[] bytes = {65,66,67,68};
        byte[] bytes1 = {-65,-66,-67,68};


        fos.write(bytes);

        fos.write(bytes1);


        /*
        * void	write(byte[] b, int off, int len)  将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
        *
        * 将字节数组的一部分写入到文件中    int off 是开始时候的索引    int len是写几个字节
        *
        * */

        fos.write(bytes,1,2);


        /*
        * 写入字符的方法  可以使用字符String类中的 方法将字符转化为字节数组
        * byte[] getBytes()
        * */

        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));   //[-28, -67, -96, -27, -91, -67]
        fos.write(bytes2);


        /*
        * 追加写  续写
        * FileOutputStream(String name, boolean append) 创建一个向具有指定 name 的文件中写入数据的输出文件流。
        *
        * FileOutputStream(File file, boolean append)  创建一个向指定 File 对象表示的文件中写入数据的文件输出流
        *
        * 参数：
        *   String name  , File file : 写入数据的目的地   append是续写的开关要是true的话就不会覆盖原来的文件直接在后面追加写    要是false的话就直接覆盖原来的文件
        * 重新写入
        *
        * */

        FileOutputStream fos2 = new FileOutputStream("src/main/java/dell/Day0916/IO/c.txt",true);
        fos2.write("你好".getBytes());

        //换行  不同的OS对应的换行是不一样的  windows是\r\n    linux  \n        Mac \r

        for (int i = 0; i < 10 ; i++){
            fos2.write("你好".getBytes());
            fos2.write("\r".getBytes());
        }


        fos.close();

    }
}
