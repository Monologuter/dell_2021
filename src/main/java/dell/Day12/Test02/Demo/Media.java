package dell.Day12.Test02.Demo;

public class Media {
    private String name; //名称
    private String type; //类型

    public Media(String name,String type){
        this.name = name;
        this.type = type;
    }

    public void play(){
        System.out.println("媒体名称是:" + name + "类型是:" + type);
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
}
