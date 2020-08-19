package dell.Day13.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/19 9:00
 * @Version 1.0
 * @Description:牧师
 */
public class Minister extends Role {
    private  String name;

    public Minister(String name  , int healthy) {
        super(healthy);
        this.name = name;

    }

    @Override
    public void operate(Role role) {
        if (role instanceof  Warrior){
            role.healthy -= 10;
            System.out.println("牧师使用回复术为战士加血10"+"\n"+"战士生命值为："+healthy);
        }else if(role instanceof  Monster){
            role.healthy -= 20;
            System.out.println("牧师受到攻击，生命值减20"+"\n"+"牧师生命值为："+healthy);

        }
    }
}
