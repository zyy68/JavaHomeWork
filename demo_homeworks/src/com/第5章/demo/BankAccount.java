package com.��5��.demo;
//�������ʵ��
public class BankAccount {
	private String accountNumber;//�����˻����ʽ���
	private String accountName;//�ʻ���
	private double balance;//�˻����
	private static double interestRate;//
	
	public BankAccount(String numIn,String nameIn) {
		// TODO Auto-generated constructor stub
		//�ṹ��
		accountNumber = numIn;
		accountName = nameIn;
		balance = 0;//�����ʼֵ
		
	}
	
	//3��get��������õ�ǰ�˻���Ϣ
	//����˻���
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//��Ǯ�Ĳ���
	public void deposite(double numIn) {
		//��ǰ��� = ֮ǰ��� + �����Ǯ��
		balance += numIn;
	}
	
	
	//ȡǮ����
	public void withdraw(double numOut) {
		//��ǰ��� = ֮ǰ��� - ȡ����Ǯ��
		balance -= numOut;
	}
	
	//����˰�ʲ���
	public static void setInterestRate(double interestRateIn) {
		 interestRate = interestRateIn;
	}
	
	//��ȡ˰�ʲ���
	public static double  getInterestRate() {
		return interestRate;
	}
	
}
