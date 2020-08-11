package dell.Day07.Test;

/**
 * @Author 马小姐
 * @Date 2020/8/11 14:55
 * @Version 1.0
 * @Description:
 */
public class Bank {
    public static void main(String[] args) {
        Customer customer =new Customer();

        Account account = new Account(1000, 2000, 0.0123);
        customer.setAccount(account);

        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println(customer.getName()+","+customer.getPhoneNumber()+customer.getIdNumber()+customer.getAddress()+customer.getAccount());
    }

}

