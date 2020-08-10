package dell.Day06_0810.Class;

/**
 * 定义学生类Student
 * 属性
 *  姓名、年龄、性别、学号、学校、年级、班级、是否单身.....
 * 方法
 *  学习、吃饭、睡觉、走路、说话、打游戏、唱歌....
 *
 *  思考和类Classroom的关系
 *  属性：姓名、年龄、性别、学校、年级、班级、学号...
 *  方法：学习、吃饭、睡觉、走路、说话、唱歌...
 */
public class Student {
    private String name;
    private int age;
    private char sex;
    public String school;
    public String grade;//年级
    public String classNumber;//班级号
    public String studentId;//学号

    public void study(){
        System.out.println("正在学习");
    }

    public void rest(){
        System.out.println("正在休息");
    }

    public void exercise(){
        System.out.println("正在活动");
    }

    //设置Student对象姓名
    public void setName(String name){
        this.name = name;
    }

    //获取Student对象姓名
    public String getName(){
        return this.name;
    }


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("李四");
        String name = student1.getName();
        System.out.println(name);
    }
}
