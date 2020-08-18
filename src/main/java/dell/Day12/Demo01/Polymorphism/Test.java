package dell.Day12.Demo01.Polymorphism;

/**
 * @Author 马小姐
 * @Date 2020/8/18 14:45
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        Animal animal01 = new Cat();
//        animal01.move();
//        animal01.roar();
//
//        Animal animal02 = new Chicken();
//        animal02.move();
//        animal02.roar();
//
//
//        Animal animal03 = new Dog();
//        animal03.roar();
//        animal03.move();


        Test test = new Test();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();

        test.pet(dog);
        test.pet(cat);
        test.pet(chicken);

        Animal animal = new Dog();



    }

    public void pet(Animal animal){
        animal.move();
        animal.roar();

    }

}
