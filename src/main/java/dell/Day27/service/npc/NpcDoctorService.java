package dell.Day27.service.npc;


import dell.Day27.data.NpcData;
import dell.Day27.model.Player;

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

    }
}

