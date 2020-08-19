package dell.Day13.Test01;

/*
 * Role类
 *
 * 属性：
 *   私有属性 生命值health
 *   方法：operate(Role role)
 *
 * */
public class Role {

    //生命值
    private int health;

    //方法
    public void  operate(Role role){
        System.out.println("当前角色的生命值是:" + this.getHealth());
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }
}
