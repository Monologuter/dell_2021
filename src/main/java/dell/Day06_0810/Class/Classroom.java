package dell.Day06_0810.Class;
/*
 * 设计教室类
 * 属性：位置、面积、教室号、学生信息、桌椅板凳数量.....
 * 方法：容纳学生、开门、关门、开灯、关灯、放投影....
 *
 * */
public class Classroom {
    public String location;
    public int area;
    public int classNumber;
    public Student[] students = new Student[100];
    public int deskCount;


    public void addStudent(Student student,int number){
        students[number] = student;
    }

    public Student getStudent(int number){
        return students[number];
    }

    public static void main(String[] args) {
        //先创建一个教室对象
        Classroom classroom1 = new Classroom();
        //再创建一个学生对象
        Student student1 = new Student();
        student1.setName("李四");
        //把学生安排到教室里
        classroom1.addStudent(student1,1);
        //获取当前教室里的所有学生
        Student student2 = classroom1.getStudent(1);
        System.out.println(student2.getName());
    }
}
