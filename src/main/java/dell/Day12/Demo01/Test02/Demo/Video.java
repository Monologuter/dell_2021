package dell.Day12.Demo01.Test02.Demo;

public class Video extends Media {

    private String director;
    public Video(String name, String type,String director) {
        super(name, type);
        this.director = director;
    }

    @Override
    public void play(){
        System.out.println("电影名称《"+super.getName()+"》,  类型是:"+super.getType()+"  导演是:"+this.director);    }
}
