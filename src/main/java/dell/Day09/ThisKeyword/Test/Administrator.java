package dell.Day09.ThisKeyword.Test;

/**
 * @Author 马小姐
 * @Date 2020/8/13 11:41
 * @Version 1.0
 * @Description:
 */

/*
* 定义一个Administrator类，类中有两个私有属性，loginAccount以及loginPassword,并生成对应的get和set方法
（1）编写测试类，在类中调用Administrator 的set方法为属性进行赋值
（2）键盘输入登录名，以及密码实现登录功能
（3）拓展：登录错误次数不能超过五次




*
*
*
* */
public class Administrator {
    private String loginAccount;
    private int loginPassword;

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public int getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(int loginPassword) {
        this.loginPassword = loginPassword;
    }
}
