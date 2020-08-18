package dell.Day12.Demo01.Test02;

/**
 * @Author 马小姐
 * @Date 2020/8/18 15:29
 * @Version 1.0
 * @Description:
 */
public class Player {
    public void play(Media mediaPlayer){
        mediaPlayer.player();
    }

    public static void main(String[] args) {
        Media music = new Media("泰勒","yinyue");
        music.player();
    }
}
