package MyselfTest.Test_0827;

/**
 * @Author 马小姐
 * @Date 2020-08-27 16:11
 * @Version 1.0
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴",19);
        Person two = new Person("陈亚",18);
        Person three = new Person("马静娴",18);

        System.out.println(three.getName()+three.getAge());

        array[0] = one;
        array[1] = two;
        array[2] = three;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
