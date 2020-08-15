package dell.Day09.AdminTest.Service;
import dell.Day09.AdminTest.model.Student;
import java.util.Scanner;


/**
 * @Author 马小姐
 * @Date 2020/8/13 22:26
 * @Version 1.0
 * @Description:用户操作逻辑
 */
//service层  主要是对系统的用户进行操作  CRUD
public class UserService {

    //做个标记
    static boolean flag = true;
    //设置对象数组的长度为100 表示最多可以存放一百个用户数据
    static Student[] students = new Student[100];

    //打印学生信息
    public void output() {
        for (Student student : students) {
            if(student!=null){
                System.out.println("学号:"+student.getId()+"\n"+"姓名:"
                        +student.getName()+"\n"+"性别:"
                        +student.getGender()+"\n"+"年龄:"
                        +student.getAge()+"\n"+"号码:"+student.getPhone()
                        +"\n"+"邮箱:"+student.getEmail()+"\n");
            }
        }
        System.out.println("系统中还未添加用户,请添加后再进行操作！");
        System.out.println();
    }


    //删除学生信息
    public  void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("删除的学生学号:");

        /*hasNextInt判断从键盘中接收到的数据是不是int类型的 要是不是int类型的就打印错误信息*/

        if(!sc.hasNextInt())
        {
            System.out.println("没有输入学号或输入学号有问题！");
            flag = false;
        }else {
            int ID = sc.nextInt();
            for(int i = 0;i<students.length;i++) {
                if (students[i] != null) {
                    if (ID == students[i].getId()) {
                        students[i] = null;
                        System.out.println("删除成功");
                    } else {
                        System.out.println("学号不存在");
                        break;
                    }
                }
            }
        }
    }
    //修改学生信息
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("修改的学生学号:");
        if(!sc.hasNextInt())
        {
            System.out.println("您输入的不是学号,请输入学号!\n");
            flag = false;
        }else {
            int ID = sc.nextInt();
            for (int i = 0; i < students.length; i++) {
                if(students[i]!=null) {
                    if (ID == students[i].getId()) {
                        System.out.println("学生学号：");
                        int IDnew = sc.nextInt();
                        students[i].setId(IDnew);

                        System.out.println("学生姓名：");
                        String nameNew = sc.next();
                        students[i].setName(nameNew);

                        System.out.println("学生年龄：");
                        int ageNew = sc.nextInt();
                        students[i].setAge(ageNew);

                        System.out.println("学生性别：");
                        String genderNew = sc.next();
                        students[i].setGender(genderNew);

                        System.out.println("学生号码：");
                        String phoneNew = sc.next();
                        students[i].setPhone(phoneNew);

                        System.out.println("学生邮箱：");
                        String emailNew = sc.next();
                        students[i].setEmail(emailNew);

                    } else {
                        System.out.println("不存在该学号");
                        break;
                    }
                }
            }
        }
    }
    //查找学生信息
    public  void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("查找的学生学号:");
        if(!sc.hasNextInt())
        {
            System.out.println("未输入学号");
            flag = false;
        }else {
            int ID = sc.nextInt();
            for(int i = 0;i<students.length;i++) {
                if (students[i] != null) {
                    if (ID == students[i].getId()) {
                        System.out.println("学号：" + students[i].getId());
                        System.out.println("姓名：" + students[i].getName());
                        System.out.println("性别：" + students[i].getGender());
                        System.out.println("年龄：" + students[i].getAge());
                        System.out.println("号码：" + students[i].getPhone());
                        System.out.println("邮箱：" + students[i].getEmail());
                    } else {
                        System.out.println("不存在学号");
                        break;
                    }
                }
            }
        }
    }
    //添加学生信息
    public  void add() {
        boolean b=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("学生学号：");
        if(!sc.hasNextInt())
        {
            System.out.println("未输入学号");
            flag = false;
        }else {
            int ID = sc.nextInt();
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null){
                    if (ID == students[i].getId()) {
                        System.out.println("你加个锤子加,学号都一样了.....");
                        b = false;
                    }
                }
            }
            if (b) {
                System.out.println("学生姓名：");
                String nameAdd = sc.next();


                System.out.println("学生年龄：");
                int ageAdd = sc.nextInt();


                System.out.println("学生性别：");
                String genderAdd = sc.next();


                System.out.println("学生号码：");
                String phoneAdd = sc.next();


                System.out.println("学生邮箱：");
                String emailAdd = sc.next();


                for (int i = 0; i < students.length; i++) {
                    if (students[i] == null) {
                        Student stu = new Student(ID,nameAdd,ageAdd,genderAdd,phoneAdd,emailAdd);
                        students[i] = stu;
                        break;
                    }
                }
            }
        }
    }
}

