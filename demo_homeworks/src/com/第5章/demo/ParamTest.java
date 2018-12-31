/**
 *
 *ParamTest.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月28日 下午2:43:35
 *
 */
package com.第5章.demo;

/**
 * @author sylvia.zhao
 *
 */
//测试将类对象作为方法的参数
public class ParamTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//实例化对象
		BankAccount myAccount = new BankAccount("1", "Sylvia");//创建账户对象：账户为1，帐户名为sylvia的用户
		
		//在静态方法中调用同类中其他方法，那么其他方法必须加上static修饰（原因：静态方法只能访问同类中的其他静态方法，不能直接访问同类中的其他非静态成员方法。）
		testParam(myAccount);
		//输出账户信息
		System.out.println("account Num : "+myAccount.getAccountNumber());
		System.out.println("account Name : "+myAccount.getAccountName());
		System.out.println("Balance "+myAccount.getBalance());
	}
	
	
	//声明一个参数为BankAccount类型的函数方法
	public static void testParam(BankAccount account) {//为什么要将testParam（）方法修饰设置成static ？？？？--见上面static main（）函数的使用
		account.deposite(300000);//向账户account中存入300000元
		
		
	}
	

}
