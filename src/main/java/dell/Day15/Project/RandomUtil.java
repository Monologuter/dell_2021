package dell.Day15.Project;

import java.util.Random;

public class RandomUtil {
    public static int getRandomNumber(){

        return new Random().nextInt(Constant.CLOTH+1);
    }
}
