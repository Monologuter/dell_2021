package dell.Day13.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/19 9:00
 * @Version 1.0
 * @Description:牧师
 */
public class Minister extends Role {

    //设置牧师的初始化生命值
    public Minister(int health){
        super.setHealth(health);
    }

    //重写父类方法
    @Override
    public void operate(Role role){
        if(role instanceof Monster){
            System.out.println("九头蛇当前血量：" + role.getHealth());
            System.out.println("牧师("+this.getHealth()+")闯入了九头蛇的领地，受到攻击");

            //九头蛇对牧师进行攻击
            int ministerHealth = this.getHealth();
            ministerHealth -= 20;
            this.setHealth(ministerHealth);

            //打印牧师的血量
            System.out.println("牧师血量为：" + this.getHealth());
            System.out.println("====================");
        }else if( role instanceof Warrior){
            role.setHealth(role.getHealth()+10);

            System.out.println("牧师使用回复术为战士加血，现在战士的血量为:"+ role.getHealth());
            System.out.println("====================");
        }
    }
}
