package dell.Day25.demo;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //分别创建coffee、beer、milk对象
        Coffee drink = new Coffee();
        Beer drink1 = new Beer();
        Milk drink2 = new Milk();
        System.out.println("请输入饮料类型：1.咖啡 2.啤酒 3.牛奶");
        //获取输入
        int drinkType=scanner.nextInt();
        //判断类型
        switch (drink.getDrinkType(drinkType)){

            case 1:
                drink.taste();
                break;
            case 2:
                drink1.taste();
                break;
            case 3:
                drink2.taste();
                break;
        }
    }
}
