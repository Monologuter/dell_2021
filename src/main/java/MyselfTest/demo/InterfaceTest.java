package MyselfTest.demo;

public class InterfaceTest {
    public static void main(String[] args) {

        ComparableCircle comparableCircle1 = new ComparableCircle(100);

        ComparableCircle comparableCircle2 = new ComparableCircle(6);

        System.out.println(comparableCircle1.compareTo(comparableCircle2));
        System.out.println(comparableCircle1.compareTo(comparableCircle1));
        System.out.println(comparableCircle2.compareTo(comparableCircle1));

    }
}
