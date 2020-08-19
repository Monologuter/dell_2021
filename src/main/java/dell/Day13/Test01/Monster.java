package dell.Day13.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/19 8:59
 * @Version 1.0
 * @Description:九头蛇
 */
public class Monster extends Role {

    //初始化九头蛇的生命值
    public Monster(int health){
        super.setHealth(health);
    }

    //重写父类方法
    @Override
    public void operate(Role role){
        if(role instanceof Warrior){
            System.out.println("九头蛇当前血量为："+ this.getHealth());
            System.out.println("九头蛇对战士造成攻击");

            //战士受到攻击
            role.setHealth(role.getHealth() - 15);

            System.out.println("战士当前血量为：" + role.getHealth());
            System.out.println("====================");
        }else if(role instanceof Minister){
            System.out.println("九头蛇当前血量为："+ this.getHealth());
            System.out.println("牧师("+role.getHealth()+")闯入九头蛇领地，受到攻击");

            //牧师受到攻击
            role.setHealth(role.getHealth()-20);

            System.out.println("牧师血量为:" + role.getHealth());
        }
    }
}
