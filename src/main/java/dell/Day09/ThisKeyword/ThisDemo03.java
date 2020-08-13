package dell.Day09.ThisKeyword;

/**
 * @Author 马小姐
 * @Date 2020/8/13 9:32
 * @Version 1.0
 * @Description:
 */
public class ThisDemo03 {
    public static void main(String[] args) {
        Student stu1 = new Student(111,"马小姐",500f);
        Student stu2 = new Student(112,"陈亚",300f);
        stu1.display();
        stu2.display();
    }

}

class Student {
    int rollno;
    String name;
    float fee;

//    Student(int rollno, String name, float fee) {
////        rollno = rollno;
////        name = name;
////        fee = fee;
//
//        this.rollno = rollno;
//        this.name = name;
//        this.fee = fee;
//
//    }

    Student(int r, String n, float f) {
//        rollno = rollno;
//        name = name;
//        fee = fee;

        rollno = r;
        name = n;
        fee = f;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}


