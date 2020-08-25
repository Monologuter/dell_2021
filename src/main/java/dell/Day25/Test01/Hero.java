package dell.Day25.Test01;

public class Hero {
    private String name;  //姓名
    private String Armo;//护甲
    private  double speed; //移速
    private  double Magic; //魔抗
    private  double aggressivity ; //攻击力




    public  void hitEnemyCrystal(EnemyCrystal e){
        System.out.println("敌方受到我方攻击，当前血量为：" + (e.blood - 10));
    }


    //Hero类内设计一个静态内部类：敌方水晶EnemyCrystal
    static  class EnemyCrystal{
        private double blood; //敌方水晶的血量

        public void checkIfVictory(){
            if (this.blood < 0){
                System.out.println("你已经胜利了");
            }
            System.out.println("胜利即在眼前继续加油");
        }

        public double getBlood() {
            return blood;
        }

        public void setBlood(double blood) {
            this.blood = blood;
        }
    }




      static class BattaleScore{
        private int kill ;
        private int death;
        private int assistant;

        public BattaleScore(int kill, int death, int assistant) {
            this.kill = kill;
            this.death = death;
            this.assistant = assistant;
        }

        public BattaleScore(int kill) {
            this.kill = kill;

        }

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

            public void  lengedary() {
            if (this.kill > 8){
                System.out.println("你已经超神了");
            }else {
                System.out.println("你是个垃圾");
            }

        }
    }
}
