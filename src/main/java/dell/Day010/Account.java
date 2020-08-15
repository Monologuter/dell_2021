package dell.Day010;

/**
 * @Author 马小姐
 * @Date 2020/8/15 9:16
 * @Version 1.0
 * @Description:
 */
public class Account {
    private  int id; //编号
    private double balance;  //余额
    private double annualInterestRate ;  //年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){
        if (amount> balance){
            System.out.println("不好意思，您的余额不足！");
        }else {
            balance -= amount;
            System.out.println("您的取款金额为："+amount);
        }
    }


    public void deposit(double amount){
        balance += amount;
        System.out.println("成功存入："+amount);
    }
}
