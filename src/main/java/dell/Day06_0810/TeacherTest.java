package dell.Day06_0810;

/**
 * @Author 马小姐
 * @Date 2020/8/10 14:37
 * @Version 1.0
 * @Description:
 */
public class TeacherTest {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setTeachageAge(12);
        teacher.setAge(10);
        teacher.setCourse("软件工程");
        teacher.setName("张三");
        teacher.information();
    }
}
