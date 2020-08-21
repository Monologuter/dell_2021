package dell.Day15.Test03;

public class CommonEmployee extends Employee {
    @Override
    void work() {

        System.out.println(super.getName()+" "+super.getId()+" "+super.getSalary());

    }
}
