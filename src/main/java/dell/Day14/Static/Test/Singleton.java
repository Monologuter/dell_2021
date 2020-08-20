package dell.Day14.Static.Test;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private  double i ;
    private Singleton(){
        i= Math.random();
    }

    public static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
