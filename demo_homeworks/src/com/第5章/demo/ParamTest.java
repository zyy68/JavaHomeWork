/**
 *
 *ParamTest.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��28�� ����2:43:35
 *
 */
package com.��5��.demo;

/**
 * @author sylvia.zhao
 *
 */
//���Խ��������Ϊ�����Ĳ���
public class ParamTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ʵ��������
		BankAccount myAccount = new BankAccount("1", "Sylvia");//�����˻������˻�Ϊ1���ʻ���Ϊsylvia���û�
		
		//�ھ�̬�����е���ͬ����������������ô���������������static���Σ�ԭ�򣺾�̬����ֻ�ܷ���ͬ���е�������̬����������ֱ�ӷ���ͬ���е������Ǿ�̬��Ա��������
		testParam(myAccount);
		//����˻���Ϣ
		System.out.println("account Num : "+myAccount.getAccountNumber());
		System.out.println("account Name : "+myAccount.getAccountName());
		System.out.println("Balance "+myAccount.getBalance());
	}
	
	
	//����һ������ΪBankAccount���͵ĺ�������
	public static void testParam(BankAccount account) {//ΪʲôҪ��testParam���������������ó�static ��������--������static main����������ʹ��
		account.deposite(300000);//���˻�account�д���300000Ԫ
		
		
	}
	

}
