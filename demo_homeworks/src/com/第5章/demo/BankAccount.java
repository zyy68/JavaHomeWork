package com.第5章.demo;
//对象参数实例
public class BankAccount {
	private String accountNumber;//存入账户的资金数
	private String accountName;//帐户名
	private double balance;//账户余额
	private static double interestRate;//
	
	public BankAccount(String numIn,String nameIn) {
		// TODO Auto-generated constructor stub
		//结构体
		accountNumber = numIn;
		accountName = nameIn;
		balance = 0;//给予初始值
		
	}
	
	//3个get方法，获得当前账户信息
	//获得账户名
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//存钱的操作
	public void deposite(double numIn) {
		//当前余额 = 之前余额 + 存入的钱数
		balance += numIn;
	}
	
	
	//取钱操作
	public void withdraw(double numOut) {
		//当前余额 = 之前余额 - 取出的钱数
		balance -= numOut;
	}
	
	//设置税率操作
	public static void setInterestRate(double interestRateIn) {
		 interestRate = interestRateIn;
	}
	
	//获取税率操作
	public static double  getInterestRate() {
		return interestRate;
	}
	
}
