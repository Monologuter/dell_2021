package dell.Day07.Test;

/**
 * @Author 马小姐
 * @Date 2020/8/11 15:00
 * @Version 1.0
 * @Description:
 */
public class Customer {
    private String name;
    private String idNumber;
    private String phoneNumber;
    private String address;
    private Account account;

    public Customer() {
    }

    public Customer(String name, String idNumber, String phoneNumber, String address, Account account) {
        this.name = name;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", account=" + account +
                '}';
    }
}
