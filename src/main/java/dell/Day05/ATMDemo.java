package dell.Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 	ATM项目说明：
 * 	实现功能：
 * 		登录：登录成功后显示菜单，登录失败进行提示
 * 		功能菜单：
 * 				1.余额查询
 * 				2.存款
 * 				3.取款
 * 				4.修改密码（注意：必须验证原密码和两次输入的新密码）
 * 				5.退出
 * 		根据输入的菜单编号，进入相应的功能
 *
 * */
public class ATMDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		   ============第一部分=================
		   ============登录验证=================
		 */
		//登录账号和密码初始化，提示：String二维数组
		//将String 转化为double类型
		//double queryBalance = Double.parseDouble("123.5");
		//将String 转化为int
		//int money =Integer.parseInt("100");
		String accounts[][] = new String[][]{{"cyy","0306"},{"mjx","520"}};
		//系统当前时间获取
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int money = 500; //初始化余额
		int givemoneyNum; //存钱
		int getMoneyNumber;//取钱
		// oldPassword  旧密码
//		String checkpassword ;//需要修改的密码
		int i ;
		int j;

		//用户登录，输入用户名和密码，并验证是否正确
		System.out.println("------------------------------");
		System.out.println("请输入用户名：");
		String name = sc.next();
		System.out.println("请输入密码：");
		String password = sc.next();
		//登录成功标志位，默认为false;登录成功后，标志位为true
		boolean flag = false;

		for ( i = 0; i < accounts.length; i++) {
			for ( j = 0; j < accounts[i].length; j++) {
				if ( accounts[i][j].equals(name) ) {
					for (int k = 0; k < accounts[i].length; k++) {
						if(accounts[i][k].equals(password)){
							//登录成功之后进行提示并获取系统的当前时间
							System.out.println("登录成功!"+"\n"+"系统当前时间："+df.format(new Date()));
							flag = true;
						}
					}
					break;
				}

			}
		}
		if(!flag){
			System.out.println("对不起，密码输入错误，请重试");
		} else{
			System.out.println("######  欢迎来到实训银行    #####");
			System.out.println("##### 请按照功能菜单进行操作  #####");
			System.out.println("------------------------------");

			while (true) {
				//初始化并打印菜单 1:余额查询, 2：存款, 3：取款, 4：修改密码, 5:退出
				String[] menus = { "1:余额查询", "2：存款", "3：取款", "4：修改密码", "5:退出" };
				for (String item : menus) {
					System.out.print(item + "\n");
				}
				//功能选择
				System.out.println("-----------------------------");
				System.out.println("请进行功能选择：");
				//输入菜单编号
				int menuID = sc.nextInt();
				switch (menuID) {
					case 1:
						//余额查询功能代码
						//初始化余额  为   500RMB
						 money = 500;
						System.out.println("您当前的余额为："+money+"元");
						break;
					case 2:
						//存款功能代码
						System.out.println("请输入存款金额：");
						Scanner scanner = new Scanner(System.in);
						givemoneyNum = scanner.nextInt();
						if(givemoneyNum % 100 == 0){
							if (givemoneyNum>1000 || givemoneyNum <0){
								System.out.println("只能存储1000元以下！且合法");
							}else{
								//moneySecond  更新后的余额
								int moneySecond = money = money + givemoneyNum;
								System.out.println("您目前的余额为："+(moneySecond));
							}
						}else {
							System.out.println("您输入的金额不合法银行规定，请按100的整数进行存储！");
						}
						break;
					case 3:
						//取款功能代码
						System.out.println("请输入您需要取款的金额数,额度为100的整数！");
						Scanner scannerGetMoney = new Scanner(System.in);
						getMoneyNumber = scannerGetMoney.nextInt();
						if (getMoneyNumber % 100 == 0){
							if (getMoneyNumber < 0 || getMoneyNumber>1000){
								System.out.println("您输入的金额不合法，应该小于1000元且为100的整数");
							} else {
								System.out.println("您目前的余额为："+(money-getMoneyNumber));
							}
						}

						break;
					case 4:
						//修改密码功能代码
						System.out.println("请输入原密码");
						Scanner scan = new Scanner(System.in);
						String oldPassword   = scan.next();
						for ( i = 0; i < accounts.length; i++) {
							for ( j = 0; j < accounts[i].length; j++) {
								 {
								 	for (int k = 0; k < accounts[i].length; k++) {
										if(accounts[i][k].equals(oldPassword)){
											//登录成功之后进行提示并获取系统的当前时间
											System.out.println("请输入新密码");
											String checkPassword = scan.next();
											System.out.println("新密码为："+checkPassword);
										}

									}
								 	System.out.println("密码输入错误！");
									break;
								}

							}
						}
						break;
					case 5://退出系统
						System.out.println("系统退出成功！");
						System.exit(0);
						break;
					default:
						//非法操作
						System.out.println("非法操作");
						break;
				}
			}
		}
		}
	}


