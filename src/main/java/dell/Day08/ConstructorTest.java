package dell.Day08;

/**
 * @Author 马小姐
 * @Date 2020/8/12 9:48
 * @Version 1.0
 * @Description:
 */
public class ConstructorTest {
    public ConstructorTest() {

    }

    public ConstructorTest(int age) {
        this.age = age;
    }

    public ConstructorTest(String name) {
        this.name = name;
    }

    public ConstructorTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorTest constructorTest1 = new ConstructorTest();
        ConstructorTest constructorTest2 = new ConstructorTest(10);
        ConstructorTest constructorTest3 = new ConstructorTest("陈亚");
        ConstructorTest constructorTest = new ConstructorTest(10,"陈亚");

//        constructorTest.setName("陈亚");
//        constructorTest.setAge(10);
        System.out.println(constructorTest.getName());
        System.out.println( constructorTest.getAge());



    }
}
