package dell.Day08;

/**
 * @Author 马小姐
 * @Date 2020/8/12 9:48
 * @Version 1.0
 * @Description:
 */
public class AnimalConstructor {
    private  String name;
    private  String sex;
    private  int legNumber;
    private  String callWay;

    public AnimalConstructor() {
    }

    public AnimalConstructor(String name) {
        this.name = name;
    }

    public AnimalConstructor(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }



    public AnimalConstructor(String name, String sex, int legNumber, String callWay) {
        this.name = name; //名字
        this.sex = sex; //性别
        this.legNumber = legNumber; //腿的数量
        this.callWay = callWay;// 叫的方式
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getLegNumber() {
        return legNumber;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    public String getCallWay() {
        return callWay;
    }

    public void setCallWay(String callWay) {
        this.callWay = callWay;
    }

    private  void sleep(){
        System.out.println(this.name+"正在睡觉");
    }

    void eat(){
        System.out.println(this.name+"正在吃饭");
    }

    protected void play(){
        System.out.println(this.name+"正在玩耍");

    }

//    public void show(String name , String sex , int legNumber, String callWay){
//        System.out.println(name+sex+legNumber+callWay);
//    }

}
