package dell.Day12;

/**
 * @Author 马小姐
 * @Date 2020/8/18 9:02
 * @Version 1.0
 * @Description:
 */
public class Maintainer extends Employee {
    @Override
    public void work() {
        System.out.println("员工号为："+super.getId()+"的"+super.getName()+"的员工");
    }
}
