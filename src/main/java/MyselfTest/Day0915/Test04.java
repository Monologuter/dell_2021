package MyselfTest.Day0915;

import javax.swing.plaf.metal.MetalSliderUI;
import java.io.File;

/**
 * @Author 马小姐
 * @Date 2020-09-15 19:14
 * @Version 1.0
 * @Description:
 */
public class Test04 {
    public static void main(String[] args) {
//        getFile("/Users/mac/IdeaProjects/dell_2021/src/main/java/dell/Day40/lastTest/de03");

        File file = new File("src/main/java/MyselfTest/Day0915/");
        String[] arr = file.list();
        for (String string :arr) {
            if (string.endsWith(".java")){
                System.out.println(string);
            }
        }

    }


//    public static  void getFile(String folderPath){
//        StringBuffer file = new StringBuffer();
//        java.io.File folder = new java.io.File(folderPath);
//        String[] list = folder.list();
//        for (int i = 0; i < list.length; i++){
//
//            file.append(list[i]).append(",");
//        }
//        System.out.println(file);
//
//    }
}

