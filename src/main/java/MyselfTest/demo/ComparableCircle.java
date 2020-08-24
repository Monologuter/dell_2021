package MyselfTest.demo;

public class ComparableCircle extends Circle implements ComparableObject {



    public ComparableCircle(int redius) {
        super(redius);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Circle) {
            ComparableObject comparableObject = (ComparableObject) o;
            if(this.getRedius() >  comparableObject.getRedius() )
            {
                return 1;
            }else if (this.getRedius() < comparableObject.getRedius() ) {
                return -1;
            }
        }
        return 0;

    }
}
