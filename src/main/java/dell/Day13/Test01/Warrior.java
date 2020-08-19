package dell.Day13.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/19 8:59
 * @Version 1.0
 * @Description:战士类
 */
public class Warrior extends  Role{
    private String name;

    public Warrior(String name , int healthy) {
        super(healthy);
        this.name = name;
    }

    @Override
    public void operate(Role role) {
        if (role instanceof Monster){
            role.healthy -= 10;
            System.out.println("开始攻击九头蛇,九头蛇生命值减10"+"\n"+"九头蛇生命值为："+healthy);
        }else if(role instanceof  Minister){
            role.healthy+=10;
            System.out.println("牧师为战士加十点生命值！"+"\n"+"战士生命值为："+healthy);
        }

    }
}
