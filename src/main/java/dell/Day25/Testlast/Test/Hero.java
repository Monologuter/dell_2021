package dell.Day25.Testlast.Test;

public abstract class Hero {

    private String name; //姓名
    private float Armor;//护甲
    private float speed;//移速
    private float magicResistance; //魔抗
    private float attack; //攻击力


    //构造器
    public Hero(String name, float armor, float speed, float magicResistance, float attack) {
        this.name = name;
        Armor = armor;
        this.speed = speed;
        this.magicResistance = magicResistance;
        this.attack = attack;
    }

    //访问器
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArmor() {
        return Armor;
    }

    public void setArmor(float armor) {
        Armor = armor;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getMagicResistance() {
        return magicResistance;
    }

    public void setMagicResistance(float magicResistance) {
        this.magicResistance = magicResistance;
    }

    public float getAttack() {
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    //抽象方法attack,用于攻击
    abstract float attack();

    //攻击水晶
    public void hitEnemyCrystal(EnemyCrystal e) {
        System.out.println(name + "拍了拍水晶");

        e.setHealth(e.getHealth() - attack());

    }

    //内部类 KDA
    class BattaleScore {
        //用于展示该英雄的数据：kill/death/assistant
        private int kill;
        private int death;
        private int assistant;//助攻

        //构造器
        public BattaleScore(int kill, int death, int assistant) {
            this.kill = kill;
            this.death = death;
            this.assistant = assistant;
        }

        //访问器
        public int getKill() {
            return kill;
        }

        public void setKill(int kill) {
            this.kill = kill;
        }

        public int getDeath() {
            return death;
        }

        public void setDeath(int death) {
            this.death = death;
        }

        public int getAssistant() {
            return assistant;
        }

        public void setAssistant(int assistant) {
            this.assistant = assistant;
        }

        //判断是否超神
        public boolean lengedary() {

            if (kill >= 8) {
                System.out.println("够了,够了!");
                return true;
            }
            System.out.println("不够,再来!");
            return false;
        }

    }

    //静态内部类 水晶
    static class EnemyCrystal {
        private float health;

        //构造器
        public EnemyCrystal(float health) {
            this.health = health;
        }

        //访问器
        public float getHealth() {
            return health;
        }

        public void setHealth(float health) {
            this.health = health;
        }

        //判断是否水晶是否死亡
        public boolean checkIfVictory() {

            if (health <= 0) {
                System.out.println("水晶:啊,我死了");
                return true;
            }
            System.out.println("水晶:诶,还没死呢");
            return false;

        }
    }

}
