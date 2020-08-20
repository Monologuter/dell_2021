package dell.Day14.Static.Test;

public class Bank {
    private  int  account ;
    private int password;
    private double money;
    private static double rate = 0.01;
    private double minMoney;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Bank.rate = rate;
    }

    public double getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(double minMoney) {
        this.minMoney = minMoney;
    }

    public Bank() {
    }

    public Bank(int account, int password, double money, double minMoney) {
        this.account = account;
        this.password = password;
        this.money = money;
        this.minMoney = minMoney;
    }
}
