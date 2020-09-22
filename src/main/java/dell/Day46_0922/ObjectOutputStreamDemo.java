package dell.Day46_0922;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.DoubleSummaryStatistics;

/**
 * @Author 马小姐
 * @Date 2020-09-22 09:28
 * @Version 1.0
 * @Description:  对象的序列化和反序列化
 *
 *                java.io.ObjectOutputStream  extends OutputStream
 *
 *                ObjectOutputStream对象的序列化流
 *                作用：将对象以流的方式写入到文件中保存
 *
 *                构造方法：
 *                  ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的 ObjectOutputStream。
 *                  参数含义：
 *                      OutputStream out  字节输出流
 *
 *
 *                  特有的成员方法：
 *                      void	writeObject(Object obj) 将指定的对象写入 ObjectOutputStream。
 *
 *
 *
 *                  使用步骤：
 *                      1、创建ObjectOutputStream对象  构造方法中传递字节输出流
 *                      2、使用ObjectOutputStream中的write方法  将对象写入到文件中
 *                      3、资源释放
 *
 *
 *
 *
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/dell/Day41_0916/IO/person.txt"));
        oos.writeObject(new Person("陈亚",19));
        oos.writeObject(new Person("华妍",18));
        oos.writeObject(new Person("马静娴",17));

        oos.close();
    }
}
