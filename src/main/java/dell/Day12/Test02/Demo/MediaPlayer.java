package dell.Day12.Test02.Demo;

public class MediaPlayer {

    public void play(Media media){
        media.play();
    }

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        Media music = new Music("love story","country music","Taylor Swift");
        mediaPlayer.play(music);

        Media video = new Video("The Grand Budapest Hotel","comedy","Wes Anderson");
        mediaPlayer.play(video);
    }
}
