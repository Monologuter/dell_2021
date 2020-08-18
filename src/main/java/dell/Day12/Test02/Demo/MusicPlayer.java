package dell.Day12.Test02.Demo;

public class MusicPlayer extends MediaPlayer {
    @Override
    public void play(Media media){
        if(media instanceof Music){
            media.play();
        }else {
            System.out.println("不是音乐类型");
        }
    }

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        MediaPlayer mediaPlayer = new MusicPlayer();

        Media music = new Music("love story","country music","Taylor Swift");

        Media video = new Video("The Grand Budapest Hotel","comedy","Wes Anderson");
        musicPlayer.play(music);
        musicPlayer.play(video);


        mediaPlayer.play(music);
        mediaPlayer.play(video);

        System.out.println(music instanceof Music);//true
        System.out.println(music instanceof Media);//false true Music
        System.out.println(music instanceof Video);//false

        Media media2 = new Media("media","media");

//        Music music1 = (Music) media2;
//        Media media3 = new Music("love story","test","test");
//        music1 = new Video("test","test","Test");
    }
}
