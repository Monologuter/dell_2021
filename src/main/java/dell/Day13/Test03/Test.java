package dell.Day13.Test03;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Pander pander = new Pander();
        pander.setSex('男');
        pander.setWeight(100.0);


        Pander pander1 = new Pander();
        pander1.setSex('男');
        pander1.setWeight(100.0);

        Pander pander2 = new Pander();
        pander2.setSex('女');
        pander2.setWeight(101.0);

        System.out.println(pander1.equals(pander));
        System.out.println(pander2.equals(pander));
        System.out.println(pander);
        System.out.println(pander1);
        System.out.println(pander2);


        Teacher teacher = new Teacher();
        teacher.setTeacher("小刚");
        teacher.setArea(90.0);
        teacher.setNumber(22);


        Teacher teacher1 = new Teacher();
        teacher1.setTeacher("小李");
        teacher1.setArea(90.0);
        teacher1.setNumber(22);
        System.out.println(teacher1.equals(teacher));
    }
}
