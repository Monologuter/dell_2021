package dell.Day06_0810.animal;

/*
* 动物园属性：
    * 地点
    * 门票价格
    * 动物列表
    * 开放时间
* 方法：
    * 卖票
    * 动物介绍
    * 开门时间
* */
/**
 * @Author 马小姐
 * @Date 2020/8/10 15:45
 * @Version 1.0
 * @Description:
 */
public class Zoo {
    public  String location;
    public  double ticketPrice;
    public  Animal[] animals = new Animal[2];
    public  String startTime;


    public  void sellTicket(){
        System.out.println("一张票50元");
    }


    public void instroduceAnimal(Animal animal){
        System.out.println(animal.animalsName);
        System.out.println(animal.weight);
        animal.eat();

    }

    public static void main(String[] args) {
        Zoo yangzhouZoo = new Zoo();

        Animal panda = new Animal();
        panda.animalsName = "熊猫";
        panda.weight = 390;
        yangzhouZoo.animals[0] = panda;

        Animal giraffe = new Animal();
        giraffe.animalsName = "长颈鹿";
        giraffe.weight = 400;
        yangzhouZoo.animals[1] = giraffe;



        for (int i = 0; i<yangzhouZoo.animals.length;i++){
            yangzhouZoo.instroduceAnimal(yangzhouZoo.animals[i]);

        }
    }
}
