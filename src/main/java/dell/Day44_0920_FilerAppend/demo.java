package dell.Day44_0920_FilerAppend;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-21 08:58
 * @Version 1.0
 * @Description: 续写和换行
 *                  续写：使用两个参数的构造方法
 *                       FileWriter(String filename , boolean append)
 *                       FileWriter(File file ,boolean append)
 *                       参数意义：String filename     File file   目的地
 *                               boolean append表示是否续写   和字节流逝一样的
 */
public class demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw  = new FileWriter("src/main/java/dell/Day41_0916/IO/c.txt",true);



    }
}
