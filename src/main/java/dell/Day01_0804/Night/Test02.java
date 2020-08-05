package dell.Day01_0804.Night;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        double  h = 100.0;
        double total = 0;
        for (int i = 0; i < 10; i++){
            total = total + h + h/2;
            h = h/2;
        }
        System.out.println("小球经过十次弹跳一共经历"+total+"米");
        System.out.println("小球第十次弹跳经历"+h+"米");


    }
}
