package dell.Day15.Project1;

public class Computer extends GamePlayer {

    public Computer() {
        setName(Constant.ComputerName[RandomUtil.getRandomNumber()]);
    }

    @Override
    public int getInputValue() {
//        this.setValue(RandomUtil.getRandomNumber());
     return   RandomUtil.getRandomNumber();
    }
}
