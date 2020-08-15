package dell.Day010;

/**
 * @Author 马小姐
 * @Date 2020/8/15 9:25
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("jane","smith");
        customer.setAccount(new Account(1000,2000,1.00123));
        Account account = customer.getAccount();
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960.0);
        customer.getAccount().withdraw(2000);
        System.out.println("Customer ["+customer.getLastName()+","+customer.getFirstName()+"]"+
                " has a account : id is "+account.getId()+" annualInterestRate is "+
                account.getAnnualInterestRate()*100+"%"+" balance is"+account.getBalance());


    }
}
