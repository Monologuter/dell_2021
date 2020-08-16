package dell.Day010.inherit.Demo02;

/**
 * @Author 马小姐
 * @Date 2020/8/15 11:45
 * @Version 1.0
 * @Description:
 */
public class Father {
    private String name;//姓名
    private int age; //年龄
    private String work; //工作方式

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

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void FatherInfo(){
        System.out.println(age+"岁的"+name+work);
    }
}
