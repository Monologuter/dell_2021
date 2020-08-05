package dell.Day02_0805;

public class Test01 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int k = 5;
        switch (x % y){
            case 0 :
                k = x * y;
                break;
             case 6 :
                 k = x / y;
                 break;
            case 12:
                k = x - y ;
                break;
            default:
                k = x * y - x ;

        }
        System.out.println(k);
    }
}
