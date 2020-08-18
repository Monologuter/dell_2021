package dell.Day010.inherit.Demo02;

/**
 * @Author 马小姐
 * @Date 2020/8/15 11:49
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        father.setName("陈亚");
        father.setAge(12);
        father.setWork("工地搬砖");
        father.getInfo();

        Son son = new Son();
        son.setName("陈诺");
        son.setAge(10);
        son.setSchool("学校");
        son.getInfo();
        
    }
}
