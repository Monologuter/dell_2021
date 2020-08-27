package dell.Day25.Testlast.Test;

public class Test {

    public static void main(String[] args) {
        //题3
        Hero h1 = new Hero("Hero张三", 35, 35, 35, 35) {
            @Override
            float attack() {
                return getAttack();
            }
        };
        //题5 创静态
        Hero.EnemyCrystal enemyCrystal = new Hero.EnemyCrystal(100);
        //题2
        while (!enemyCrystal.checkIfVictory()) {
            h1.hitEnemyCrystal(enemyCrystal);
        }

        //题4
        class SomeHero extends Hero {
            public SomeHero(String name, float armor, float speed, float magicResistance, float attack) {
                super(name, armor, speed, magicResistance, attack);
            }

            @Override
            float attack() {
                System.out.println(this.getName() + "造成了一次伤害");

                return getAttack();
            }
        }
        Hero h2 = new SomeHero("SomeHero李四", 35, 35, 35, 35);
        //题5 创非静态
        Hero.BattaleScore battaleScore=h2.new BattaleScore(0,0,0);
        System.out.println(h2.getName());
        while (!battaleScore.lengedary()){
            h2.attack();
            battaleScore.setKill(battaleScore.getKill()+3);

        }
    }

}
