package dell.Day06_0810;

/**
 * @Author 马小姐
 * @Date 2020/8/10 14:37
 * @Version 1.0
 * @Description:
 */
public class Teacher {
    private  String name;
    private  int age;
    private  int teachageAge;
    private  String course ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeachageAge() {
        return teachageAge;
    }

    public void setTeachageAge(int teachageAge) {
        this.teachageAge = teachageAge;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void information(){
        System.out.println("一个有"+teachageAge+"年教龄的"+age+"岁的"+name+"老师，在教我们学习"+course);
    }
}
