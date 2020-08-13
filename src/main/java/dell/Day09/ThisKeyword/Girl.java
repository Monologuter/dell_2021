package dell.Day09.ThisKeyword;

/**
 * @Author 马小姐
 * @Date 2020/8/13 10:38
 * @Version 1.0
 * @Description:
 */
public class Girl {
//    private  String name;
      int age;
//    private  double height;


    public Girl(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean CompaABoolean(Girl girl){
        return  this.getAge() > girl.getAge();
    }
}
