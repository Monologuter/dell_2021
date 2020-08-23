package dell.Day15.Project1;

import java.util.Scanner;

public class MyGame {
    //系统输入
    private Scanner scanner =new Scanner(System.in);
    //当前玩家
    private Player player;
    //电脑玩家
    private Computer computer;
    //回合数
    private int count=1;
    //获得出拳结果
    int result ;

    //游戏初始化，对玩家及电脑进行初始化
    public void initGame(){
        player = new Player();
        computer = new Computer();

    }

    public static void main(String[] args) {
        MyGame myGame = new MyGame();
        myGame.startGame();
    }

    //开始游戏
    public void startGame(){
        initGame();
        System.out.println("请输入姓名：");
        String name = scanner.next();
        player.setName(name);
        System.out.println("游戏开始");
        System.out.println("--------------------------------------------------");
        while (true){
            endGame();
            player.setValue(player.getInputValue());
            computer.setValue(computer.getInputValue());
            player.show();
            computer.show();
            result = compare(player.getValue(),computer.getValue());
            updateVictoryCount(result);
            showResultInfo();
        }

    }

    //出拳规则比较
    public int compare(int playerValue,int computerValue){
        //当玩家与电脑出拳一致时，返回0，表示平局
        if(playerValue==computerValue){
            return 0;
        }
        //当玩家出拳为石头
        else if(playerValue== Constant.STONE){
            //电脑出拳为剪刀
            if(computerValue== Constant.SCISSORS){
                //返回1，表示玩家胜利
                return 1;
            }else {
                //否则返回-1，表示电脑出拳为布，玩家失败
                return -1;
            }

        }
        //当玩家出拳为剪刀
        else if(playerValue== Constant.SCISSORS){
            //电脑出拳为石头
            if(computerValue== Constant.STONE){
               //返回-1，，玩家失败
               return  -1;
            }else{
                //返回1，玩家胜利
                return 1;
            }

        }
        //当玩家出布
        else{
            //电脑出石头时
            if(computerValue== Constant.STONE){
                //返回1，玩家胜利
                return 1;
            }else {
                //返回-1，玩家失败
                return -1;
            }
        }
    }
    //根据出拳结果，修改玩家或电脑胜场数
    private void updateVictoryCount(int result){
        if (result == 1){
            player.setVictoryCount(player.getVictoryCount() + 1);
        }else if (result == -1){
            computer.setVictoryCount(computer.getVictoryCount() + 1);
        }
    }
    //根据出拳结果，打印输出最后的结果及比分
    private void showResultInfo(){
        System.out.println("当前比分：" + player.getVictoryCount() + " VS " + computer.getVictoryCount());
    }
    //游戏结束
    public void endGame(){
        if (player.isVictory() || computer.isVictory()){
            System.exit(0);
        }
    }
}
