package dell.Day15.Project1;


import java.util.Scanner;

/**
 * 玩家类
 */
public class Player extends GamePlayer {
    Scanner scanner;

    //需重写父类方法
    @Override
    public int getInputValue() {
        int number;
        while(true) {
            scanner = new Scanner(System.in);
            System.out.println("请输入你的选择：0，石头 1，剪刀 2，布");
            number = scanner.nextInt();
            if (number >= 0 && number <= 2){
                break;
            }else {
                System.out.println("输入错误，请按规范输入");
            }
//        this.setValue(number);
        }
        return number;
    }
}
