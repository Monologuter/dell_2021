package dell.Day13.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/19 8:59
 * @Version 1.0
 * @Description:九头蛇
 */
public class Monster extends Role {
    private  String name;


    public Monster(String name , int healthy) {
        super(healthy);
        this.name = name;
    }


    @Override
    public void operate(Role role) {
        if(role instanceof Warrior){
            role.healthy -= 15;
            System.out.println("对战士进行攻击,战士生命值减15"+"\n"+"战士生命值为："+healthy);

        }else if(role instanceof  Minister){
            role.healthy -= 20;
            System.out.println("对牧师进行攻击,牧师生命值减小20"+"\n"+"牧师生命值为："+healthy);
        }

    }
}
