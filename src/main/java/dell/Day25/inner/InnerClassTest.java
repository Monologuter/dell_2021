package dell.Day25.inner;

public class InnerClassTest {

}

class Person{
    //成员内部类(静态  非静态)
     static  class Dog{


    }

    class bird{
         //成员内部类 非静态的
        String  name;
        int age;

        public bird() {
        }

        public bird(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }




    public void meth() {
        //局部内部类  方法内
        class AA{

        }
    }

    {
        //局部内部类  代码块内
        class BB{

        }

    }


    public Person() {
        //局部内部类  构造器内
        class CC{

        }
    }
}
