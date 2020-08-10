package dell.Day06_0810.animal;

/**
 * @Author 马小姐
 * @Date 2020/8/10 14:19
 * @Version 1.0
 * @Description:
 */
public class Animal {

    public String animalsName ;  //动物名字
    public double weight;  //动物的重量

    public void eat(){
        System.out.println(animalsName + "正在吃");
    }

    //方法2
    public void sleep(){
        System.out.println(animalsName + "正在睡");
    }

    //方法3
    public void roar(){
        System.out.println(animalsName + "正在叫");
    }



//    public static void main(String[] args) {
//        //熊猫
//        Animal panda = new Animal();
//        panda.animalsName = "熊猫";
//        panda.weight = 300;
//
//
//        //长颈鹿
//        Animal giraffe = new Animal();
//        giraffe.animalsName="长颈鹿";
//        giraffe.weight=400;
//
//
//        panda.eat();
//        panda.sleep();
//        panda.roar();
//
//        giraffe.eat();
//        giraffe.sleep();
//        giraffe.roar();
//    }
}


