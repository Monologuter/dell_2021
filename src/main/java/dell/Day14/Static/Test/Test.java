package dell.Day14.Static.Test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int total = 0;

        Bank bank = new Bank();
        for (int i = 0; i < 100000;i++){
            Random random = new Random();
            total += random.nextInt();
            bank.setMinMoney(random.nextInt());
            bank.setPassword(random.nextInt());
            bank.setMoney(random.nextInt());
            if(bank.getMoney()>0 && bank.getMinMoney()>0 && bank.getMoney() > bank.getMinMoney()){
                if(total>0 && bank.getPassword()>0){
                    String sa = "" + total;
                    String sb = "" + bank.getPassword();
                    if(sa.length() > 6 && sb.length() > 6 ){
                        bank.setAccount(total);
                    }
                    System.out.println("账号："+bank.getAccount()+"\n"+"余额"+bank.getMoney()+"\n"+"最小金额"+bank.getMinMoney()+"\n"+"密码"+bank.getPassword()+"\n"+"利率"+Bank.getRate());
                }
            }
        }
    }
}
