package MyselfTest.Day0915;

import java.io.File;
import java.io.IOException;

/**
 * @Author 马小姐
 * @Date 2020-09-15 19:14
 * @Version 1.0
 * @Description:
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        String dirPath = "src/main/java/MyselfTest/Day0915/hello.txt";
        File file = new File(dirPath);
        if (!file.exists()) {
            file.createNewFile();
        }

    }

}
