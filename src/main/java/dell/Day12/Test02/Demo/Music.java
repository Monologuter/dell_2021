package dell.Day12.Test02.Demo;

public class Music extends Media {
    private String author;

    public Music(String name, String type,String author) {
        super(name, type);
        this.author = author;
    }


    @Override
    public void play(){
        System.out.println("歌曲名称《"+super.getName()+"》,  类型是:"+super.getType()+"  作者是:"+this.author);
    }
}
