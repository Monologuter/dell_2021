package dell.Day40.lastTest.demo03;

/**
 * @Author 马小姐
 * @Date 2020-09-15 09:18
 * @Version 1.0
 * @Description:
 */
public class MyDate implements  Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int compare = year - o.year;
        if (compare == 0) {
            return compare;
        }else {
            int compare2 = month - o.month;
            if (compare2!=0){
                return compare2;
            }else {
                return day - o.day;
            }
        }
    }
}
