package dell.Day25.demo;

public abstract class Drink {

    int a=1,b=2,c=3;//a是咖啡，b是啤酒，c是牛奶

    public int getDrinkType(int drinkType) {
        switch (drinkType){ //通过switch case语句， 选择则饮料种类
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
        }
        return 0;
    }
    public abstract void taste();//定义抽象方法 taste

}
