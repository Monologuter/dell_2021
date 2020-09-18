package dell.Day43_0918_IOTest02.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-18 11:15
 * @Version 1.0
 * @Description:  文件复制
 *
 * 步骤  一读一写
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {


        long  s = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("src/main/java/dell/Day0916/IO/c.txt");
        FileOutputStream fos = new FileOutputStream("src/main/java/dell/Day0916/IO/d.txt");

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0 , len);
        }
        fis.close();
        fos.close();



        System.out.println("文件复制共耗时"+(System.currentTimeMillis() - s)+"毫秒");


    }
}
