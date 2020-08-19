package dell.Day13.Test01;

public class Warrior extends Role {


    //设置战士的初始化生命值
    public Warrior(int health){
        super.setHealth(health);
    }

    //重写父类的operate方法
    @Override
    public void operate(Role role){
        //role是一个九头蛇
        if(role instanceof Monster){
            System.out.println("战士("+ this.getHealth() +")攻击了九头蛇");
            System.out.println("战士的血量为："+this.getHealth());
            System.out.println("九头蛇未被攻击前的血量为:" + role.getHealth());

            //执行攻击行为
            int monsterHealth = role.getHealth();//获取九头蛇血量
            monsterHealth -= 10;//九头蛇血量减10
            role.setHealth(monsterHealth);//设置九头蛇的新血量
//            role.setHealth(role.getHealth()-10);



            System.out.println("九头蛇的血量为:" + role.getHealth());
            System.out.println("====================");
        }else if(role instanceof Minister){
            this.setHealth(this.getHealth()+10);//设置战士的血量+10
            System.out.println("牧师使用回复术为战士加血，现在战士的血量为:"+ this.getHealth());
            System.out.println("====================");
        }
    }
}
