package dell.Day25.Testlast.Test02;

public class Hero {
    public static String name;//姓名
    private double armor;//护甲
    private double speed;//移动速度
    private int resist;//魔抗
    private int attack;//攻击力

    public void hitEnemyCrystal(EnemyCrystal e){
        e.bloodVolume -=100;
    }

    class BattaleScore{
        public int kill;
        private int death;
        private int assistant;
        public void lengedary(){
            if(kill>=8){//根据击杀数量是否大于等于8判断该英雄是否超神
                System.out.println(name+"超神");
            }else{
                System.out.println(name+"还未超神");
            }
        }
    }

    static class EnemyCrystal{//敌方水晶
        private int bloodVolume;//血量
        public EnemyCrystal(int bloodVolume){
            this.bloodVolume = bloodVolume;
        }

        public void setBloodVolume(int bloodVolume) {
            this.bloodVolume = bloodVolume;
        }

        public int getBloodVolume() {
            return bloodVolume;
        }

        public void checkIfVictory(){//根据敌方水晶的血量判断是否已经胜利
            if(bloodVolume==0){
                System.out.println(name+"赢得胜利");
            }
        }
    }
}
