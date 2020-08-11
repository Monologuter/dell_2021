package dell.Day07.Test;

/**
 * @Author 马小姐
 * @Date 2020/8/11 15:17
 * @Version 1.0
 * @Description:
 */
public class Account {
    private int id;  // 账号
    private double balance;  // 余额

    public Account(int id, double balance, double annualInterestRate) {
        super();
        this.id = id;
        this.balance = balance;
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



    // 在提款方法 withdraw 中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
    //取钱
    public void withdraw (double amount){
        if (amount > this.balance) {
            System.out.println("账户余额不足，取款失败");
        }else{
            this.balance -= amount;
            System.out.println("取款:"+amount+"元,账户余额："+this.balance);
        }
    }

    //存钱
    public void deposit (double amount){
        if (amount > 0) {
            this.balance += amount;
            System.out.println("存款:"+amount+"元,账户余额："+this.balance);
        }

    }


}

