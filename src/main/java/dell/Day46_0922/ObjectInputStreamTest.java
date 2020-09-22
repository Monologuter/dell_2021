package dell.Day46_0922;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author 马小姐
 * @Date 2020-09-22 14:58
 * @Version 1.0
 * @Description:  序列化集合
 *                当我们想要在文件中保存多个对象的时候
 *                可以将多个对象存储在一个集合中
 *                可以对集合进行序列化和反序列化
 *
 *
 *                分析：
 *                  1、定义一个存储Person对象的ArrayList<>集合
 *                  2、往集合中存储Person对象
 *                  3、创建一个ObjectOutputStream对象
 *                  4、使用ObjectOutputStream对象中的writeObject方法对集合进行序列化
 *                  5、创建一个ObjectInputStream反序列化对象
 *                  6、使用ObjectInputStream对象中的readObject方法读取文件中集合
 *                  7、将文件中的Object类型转化为ArrayList类型
 *                  8、遍历集合
 *                  9、释放资源
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {

        //1、定义一个存储Person对象的ArrayList<>集合
        ArrayList<Person> arrayList = new ArrayList<Person> ();

        //2、往集合中存储Person对象
        arrayList.add(new Person("张三",19));
        arrayList.add(new Person("李四",20));
        arrayList.add(new Person("王五",21));

        try {
            //3、创建一个ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/dell/Day41_0916/IO/personTest.txt"));


            // 4、使用ObjectOutputStream对象中的writeObject方法对集合进行序列化
            oos.writeObject(arrayList);


            //5、创建一个ObjectInputStream反序列化对象
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/dell/Day41_0916/IO/personTest.txt"));

            //6、使用ObjectInputStream对象中的readObject方法读取文件中集合
            Object o = ois.readObject();


            //7、将文件中的Object类型转化为ArrayList类型
            ArrayList<Person> arrayList2 = (ArrayList<Person>)o;


            //遍历集合
            for (Person person : arrayList2){
                System.out.println(person);
            }



            //释放资源
            ois.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("成功");
        }


    }
}
