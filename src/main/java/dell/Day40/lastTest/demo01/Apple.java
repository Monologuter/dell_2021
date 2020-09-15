package dell.Day40.lastTest.demo01;

/**
 * @Author 马小姐
 * @Date 2020-09-15 08:49
 * @Version 1.0
 * @Description:
 */
public class Apple<T> {
    private  T weght;


    public Apple() {
    }

    public Apple(T weght) {
        this.weght = weght;
    }


    public T getWeght() {
        return weght;
    }

    public void setWeght(T weght) {
        this.weght = weght;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weght=" + weght +
                '}';
    }
}
