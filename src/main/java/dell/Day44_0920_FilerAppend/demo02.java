package dell.Day44_0920_FilerAppend;

import javax.annotation.processing.Filer;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-21 09:10
 * @Version 1.0
 * @Description: 在jdk1.7之前使用try  catch处理异常的代码块
 */
public class demo02 {
    public static void main(String[] args) {
        FileWriter fw = null;
     try {
         fw = new FileWriter("src/main/java/dell/Day41_0916/IO/c.txt",true);

         for (int i = 0; i < 10;i++){
             fw.write("helloWorld"+i+"\r");
         }


     }catch (IOException e){
         System.out.println(e);
     }finally {
         try {
             fw.close();
         } catch (IOException e) {
             e.printStackTrace();
         }

     }
    }
}
