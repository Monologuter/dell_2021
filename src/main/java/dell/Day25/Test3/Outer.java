package dell.Day25.Test3;

public class Outer {
    int num = 10;

    public class  inner{
        int num = 20;
        public void showNum(){
            int num  = 30;
            System.out.println(num);  //30
            System.out.println(this.num);  //20
            System.out.println(Outer.this.num);  //10
        }
    }

    public static void main(String[] args) {
        Outer.inner show = new Outer().new inner();
        show.showNum();

    }
}
