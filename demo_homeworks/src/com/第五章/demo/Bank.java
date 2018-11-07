/**
 *
 *Bank.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��28�� ����3:04:35
 *
 */
package com.������.demo;

/**
 * @author sylvia.zhao
 *
 */
//�ۼ��స��--����Ͳ��ֵĹ�ϵ
public class Bank {
	private BankAccount [] list;
	private int total;//��žۼ����в��ֵĸ���

	//���췽��
	public Bank(int sizeIn) {
		// TODO Auto-generated constructor stub
		//��list����ʼֵ
		list = new BankAccount[sizeIn];
		total = 0;
	}
	
	//���ҵ�ǰ�˻��������е�����λ�ã��ɹ��򷵻������±꣬ʧ���򷵻�-999�����±�
	public int search(String accountNumberIn) {
		for(int i=0;i<total;i++){
			BankAccount tempAccount = list[i];
			String tempNumber = tempAccount.getAccountNumber();
			if(tempNumber.equals(accountNumberIn)){
				return i ;
			}
		}
		return -999;
	}
	
	//�õ���ǰϵͳ�е��˻�����
	public int getTatal() {
		return total;
	}
	
	//����µ��˻����б��У��ɹ�����true��ʧ�ܷ���false;(����ΪBankAccount�����)
	public boolean add(BankAccount accountIn){
		if(total == list.length){
			  return false;//����false˵������˻�ʧ��	  
		}else {
			list[total] = accountIn;//���˻���Ϣ��ӵ���ǰ�б���
			total ++;
			return true;//��ӳɹ�
		}
	}
	
	//�������˻��б���ɾ��һ���˻���Ϣ���ɹ�����true��ʧ�ܷ���false;
		public boolean remove(String accountNumIn){
			int index = search(accountNumIn);
			//ɾ���û�˼·�������д洢�˻���Ϣ����˳���ṹ�����ݣ�
			//��˵�ɾ��һ���˺ź��Ӧ���Ը�λ���������ÿһ��Ԫ�ض�Ҫ��ǰ�ƶ�λ��
			if (index == -999) {
				return false;
			}else {
				for(int i=index;i<total-2;i++)//���Ƶ��������Ԫ�أ���ֹ�����±����������
					list[i] = list[i+1];//�������Ԫ��ֵ��ǰŲ
				total--;//���˻������Լ�һ
				return true;
			}
			
			 
		}
		
	
	
	//��ȡ�˻����˺���Ϣ,������ʵ������Ķ���
	public BankAccount getItem(String accountNumIn) {
		int index;
		index = search(accountNumIn);//���ò����˻���Ϣ�ķ���--ȷ���б��������˻���Ϣ
		if(index == -999){
			//����ʧ�ܣ�˵��û�е�ǰ�˺�
			return null;
		}else {
			return list[index]; 
		}
	}
	
	//���˻��д�Ǯ �ɹ�true,ʧ��false
	public boolean depositeMoney(String accountNum,double amountIn) {
		int index = search(accountNum);//��ѯ�б����Ƿ��и��˺�
		if (index == -999) {
			return false;
		}else {
			list[index].deposite(amountIn);//����bankaccount�����deposite��������ɴ�Ǯ����
			return true;
		}
	}
	
	
	//���˻�����Ǯ �ɹ�true,ʧ��false
	public boolean withdrawMoney(String accountNum,double amountIn) {
		int index = search(accountNum);//��ѯ�б����Ƿ��и��˺�
		if (index == -999) {
			return false;
		}else {
			list[index].withdraw(amountIn);//����bankaccount�����deposite��������ɴ�Ǯ����
			return true;
		}
	}
	
	
	
	

	
}
