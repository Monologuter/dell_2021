package dell.Day46_0922;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

/**
 * @Author 马小姐
 * @Date 2020-09-22 09:44
 * @Version 1.0
 * @Description:  java.io.ObjectInputStream extends InputStream
 *                ObjectInputStream：对象的反序列化流
 *                作用：
 *                 将文件中保存的对象以流的形式读取出来使用
 *
 *
 *                 构造方法：
 *                  ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream。
 *                  参数：InputStream in字节输入流
 *
 *
 *
 *                  特有的成员方法：
 *                      Object	readObject()  从 ObjectInputStream 读取对象。
 *
 *
 *
 *                 使用步骤：
 *                  1、创建一个ObjectInputStream  构造方法中传递字节输入流
 *                  2、使用ObjectInputStream对象中的readObject()读取保存对象的文件
 *                  3、释放资源
 *                  4、使用读取出来的对象
 *
 *
 *
 *                注意事项：
 *                 readObject方法声明抛出了 ClassNotFoundException 异常  表示该class文件不存在
 *                 当不存在对象的class文件的时候就会抛出该异常
 *
 *
 *                 反序列化的前提：
 *                  1、被反序列化的类必须实现Serializable接口
 *                  2、必须存在该class
 *
 *
 *
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/dell/Day41_0916/IO/person.txt"));

//        Map<String, String> map = (Map<String, String>) ois.readObject();
//
//
//        for (int i = 0; i < person.length; i++) {
//            System.out.println(ois.readObject());
//        }

//        ois.close();
//
        Object o = ois.readObject();
        Object o1 = ois.readObject();
        Object o2 = ois.readObject();
//        Object o3 = ois.readObject();




        System.out.println(o);
        System.out.println(o1);
        System.out.println(o2);
//        System.out.println(o3);

        ois.close();

    }
}
