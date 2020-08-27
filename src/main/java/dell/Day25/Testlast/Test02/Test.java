package dell.Day25.Testlast.Test02;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "英雄";
        Hero.BattaleScore battaleScore = hero.new BattaleScore();
        battaleScore.kill = 9;
        battaleScore.lengedary();
        Hero.EnemyCrystal enemyCrystal = new Hero.EnemyCrystal(2000);
        enemyCrystal.checkIfVictory();
        enemyCrystal.setBloodVolume(10000);
        do{
            if(enemyCrystal.getBloodVolume()>0){
                System.out.println("我方攻击成功，当前敌方水晶血量剩余" + enemyCrystal.getBloodVolume());
            }
            hero.hitEnemyCrystal(enemyCrystal);
            if(enemyCrystal.getBloodVolume()==0){
                System.out.println("敌方水晶血量为0，推搭成功，胜利！");
            }
        }while (enemyCrystal.getBloodVolume()>0);
    }
}
