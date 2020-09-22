package dell.Day44_0920_FilerAppend.ChangeStream;

import java.io.*;

/**
 * @Author 马小姐
 * @Date 2020-09-22 09:12
 * @Version 1.0
 * @Description: 将GBK编码的文件转化为uft8
 *
 *
 *      步骤：
 *          指定GBK文件编码的转换流  读取文本文件
 *          使用uft8编码的转换流    写出文本文件
 *
 *
 *
 *
 *      1、创建InputStreamReader对象  构造方法中传递字节输入流和指定编码表名称  gbk
 *      2、创建OutStreamWriter对象    构造方法中传递字节输出流和指定的编码表名称 utf8
 *      3、使用InputStreamReader对象中read读取文件
 *      4、使用OutStreamWriter对象中的方法erite写入文件
 *      5、释放资源
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/main/java/dell/Day41_0916/IO/a.txt"),"gbk");

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/main/java/dell/Day41_0916/IO/a.txt"),"uft-8");


        int len = 0;
        while ((len = isr.read()) != -1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
