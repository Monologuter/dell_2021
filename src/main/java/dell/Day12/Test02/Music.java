package dell.Day12.Test02;

/**
 * @Author 马小姐
 * @Date 2020/8/18 15:14
 * @Version 1.0
 * @Description:
 */
public class Music extends Media {
    private  String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Music(String author,String name, String type) {
        super(name,type);
        this.author = author;
    }

    @Override
    public void player() {
        System.out.println("音乐名称："+super.getName()+"类型为："+super.getType()+"作者是："+this.getAuthor());
    }
}
