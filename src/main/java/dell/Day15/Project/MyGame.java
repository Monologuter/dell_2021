package dell.Day15.Project;

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
//游戏初始化，对玩家及电脑进行初始化
    public void initGame(){
        System.out.println("人机大战开始"+"\n"+"请输入玩家的姓名：");

    }

//开始游戏
    public void startGame(){


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


    }
    //根据出拳结果，打印输出最后的结果及比分
    private void showResultInfo(int result){

    }
    //游戏结束
    public void endGame(){
        System.out.println("游戏结束");
        System.exit(0);
    }
}
