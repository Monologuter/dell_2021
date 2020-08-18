package dell.Day12.Test02;

/**
 * @Author 马小姐
 * @Date 2020/8/18 15:09
 * @Version 1.0
 * @Description:
 */
/*设计一个MediaPlayer 可以播放视频也可以播放音乐
*
* */
public class Media {
    private  String name;
    private  String type;

    public Media(String name, String type) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void player(){
        System.out.println("播放媒体文件");
    }
}
