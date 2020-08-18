package dell.Day12.Demo01;

/**
 * @Author 马小姐
 * @Date 2020/8/18 8:58
 * @Version 1.0
 * @Description:
 */
public class Employee {
    private    int id;
    private    String name;


    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void work() {
         System.out.println("员工号为："+id+"的"+name+"的员工");
     }
}
