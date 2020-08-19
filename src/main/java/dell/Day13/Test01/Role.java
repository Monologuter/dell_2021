package dell.Day13.Test01;

/**
 * @Author 马小姐
 * @Date 2020/8/19 8:57
 * @Version 1.0
 * @Description:
 */
public class Role {
    public   int healthy;


    public Role() {
    }

    public Role(int healthy) {
        this.healthy = healthy;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public void operate(Role role){
        System.out.println("当前生命值为："+healthy);
    }
}
