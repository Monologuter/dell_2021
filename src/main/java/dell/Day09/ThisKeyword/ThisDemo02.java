package dell.Day09.ThisKeyword;

/**
 * @Author 马小姐
 * @Date 2020/8/13 9:20
 * @Version 1.0
 * @Description:
 */
public class ThisDemo02 {
    private String name;
    private  int age;

    public static void main(String[] args) {
        ThisDemo02 thisDemo02 = new ThisDemo02("陈亚");

    }

    public ThisDemo02() {
        System.out.println("我是无参构造函数");
    }

    public ThisDemo02(String name) {
        this();
        name = "马小姐";
//        this.name = name;
        System.out.println(name+"我是含有参数name的构造函数");
    }

    public ThisDemo02(int age) {
        this.age = age;
        System.out.println("我是含有参数age的构造函数");
    }

    public ThisDemo02(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是全参构造函数");
    }

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

    public  void study(){
        System.out.println("学习java");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void work(){
        System.out.println("上班");
    }
}
