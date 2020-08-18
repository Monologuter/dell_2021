package dell.Day010.inherit.Demo02;

/**
 * @Author 马小姐
 * @Date 2020/8/15 11:45
 * @Version 1.0
 * @Description:
 */
public class Son  extends Father {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void getInfo() {
        System.out.println(age+"岁的"+name+school);
    }
}
