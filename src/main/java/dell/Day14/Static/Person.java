package dell.Day14.Static;

public class Person {
    private  int id;
    public static  int total = 0;
    public Person(){
        total ++;
        id = total;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            Person person = new Person();
            System.out.println(person.id+" "+total);
        }
    }
}
