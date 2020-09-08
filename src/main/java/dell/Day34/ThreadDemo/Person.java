package dell.Day34.ThreadDemo;

/**
 * @Author 马小姐
 * @Date 2020-09-08 15:10
 * @Version 1.0
 * @Description:
 */
public class Person {
    private  String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name+i);
        }
    }
}
