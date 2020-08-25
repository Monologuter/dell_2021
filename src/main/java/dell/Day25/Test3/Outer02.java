package dell.Day25.Test3;

public class Outer02 {

    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.methodOuter();
    }

    public void  methodOuter(){

        class  Inner {
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }

        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
