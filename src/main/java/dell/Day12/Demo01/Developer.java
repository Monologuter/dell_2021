package dell.Day12.Demo01;

/**
 * @Author 马小姐
 * @Date 2020/8/18 9:00
 * @Version 1.0
 * @Description:
 */
public class Developer extends Employee {

    @Override
    public void work() {
        System.out.println("员工号为："+super.getId()+"的"+super.getName()+"的员工");
    }
}
