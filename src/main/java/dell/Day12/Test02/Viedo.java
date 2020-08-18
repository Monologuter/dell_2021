package dell.Day12.Test02;

/**
 * @Author 马小姐
 * @Date 2020/8/18 15:13
 * @Version 1.0
 * @Description:
 */
public class Viedo  extends Media {
    private  String director;

    public Viedo(String name, String type) {
        super(name, type);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void player() {
        System.out.println("视频名称："+super.getName()+"类型为："+super.getType()+"作者是："+this.getDirector());
    }
}
