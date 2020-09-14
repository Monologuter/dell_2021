package dell.Day39_0914.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author 马小姐
 * @Date 2020-09-14 09:09
 * @Version 1.0
 * @Description:
 */
public class DemoArrays {
    public static void main(String[] args) {
        //创建对象数组
        Person [] array = new Person[4];
        array[0] = new Person(23,"陈亚");
        array[1] = new Person(22,"华妍");
        array[2] = new Person(21,"马静娴");
        array[3] = new Person(14,"陈诺");


        //常规方式比较器
        Arrays.sort(array,new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {

                return o1.getAge() - o2.getAge();
            }
        });

        //使用lambda表达式
        Arrays.sort(array,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });


        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
