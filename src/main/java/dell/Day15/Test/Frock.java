package dell.Day15.Test;

public class Frock {
    private  static  int currentNum=100000;  //衣服出厂的序列号起始值
    private  int serialNumber;
    public static  final  int INCREMENT = 100;

    public Frock() {
        super();
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static  int   getNextNum(){
      int   total = currentNum;
      currentNum += INCREMENT ;
      return total;
  }


  static {
      int currentNum = 150000;
      System.out.println("衣服出厂的序列号起始值:"+currentNum);
  }
}
