package dell.Day27.service.npc;

import dell.Day27.model.Player;
import dell.Day27.data.NpcData;
/**
 * 包含技能导师npc具有的方法
 */
public class NpcMasterService extends AbstractNpcService {
    /**
     * 构造方法，在实例化技能导师npc时生效
     */
    public NpcMasterService() {

        // 给从父类继承的npc对象进行赋值
        this.npc = NpcData.npcMaster;

    }

    /**
     * 支付金币学习技能
     * @param player
     */
    @Override
    public void helpPlayer(Player player) {

    }
    }

