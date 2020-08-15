package dell.Day010.inherit;

/**
 * @Author 马小姐
 * @Date 2020/8/15 10:07
 * @Version 1.0
 * @Description:
 */
/*
* 学生类*/
public class Student extends  Person{
    private int id;
    private int grade;


    public  void study(){
        System.out.println("在学习");
    }

    public void doHomework(){
        System.out.println("在做作业");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
