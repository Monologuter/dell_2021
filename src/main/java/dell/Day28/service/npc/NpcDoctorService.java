package dell.Day28.service.npc;


import dell.Day28.data.NpcData;
import dell.Day28.model.Player;

/**
 * 包含回复导师npc的具有的方法
 */
public class NpcDoctorService extends AbstractNpcService {
    /**
     * 构造方法，在实例化医师npc时生效
     */
    public NpcDoctorService() {
        // 给从父类继承的npc对象进行赋值
        this.npc = NpcData.npcDoctor;

    }

    /**
     * 支付金币进行治疗
     * @param player
     */
    @Override
    public void helpPlayer(Player player) {
        System.out.println("治疗一次需花费100金钱");
        System.out.println("当前生命值为"+player.getHp()+"当前蓝量为"+player.getMana());
        if (player.getHp() ==player.getMaxHp() && player.getMana() ==player.getMaxMana()){
            System.out.println("你现在很健康不需要治疗");
        }else {
            if (player.getMoney() >= 100) {
                player.setMoney(player.getMoney() - 100);
                player.setHp(player.getMaxHp());
                player.setMana(player.getMaxMana());
                System.out.println("当前金钱为：" + player.getMoney() + "当前生命值为" + player.getHp()+"当前魔法值为"+player.getMana());
            } else {
                System.out.println("抱歉,你的魔法太高我们无能为力");
            }
        }

    }
}

