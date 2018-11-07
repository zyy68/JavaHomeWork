/**
 *
 *Bank.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月28日 下午3:04:35
 *
 */
package com.第五章.demo;

/**
 * @author sylvia.zhao
 *
 */
//聚集类案例--总体和部分的关系
public class Bank {
	private BankAccount [] list;
	private int total;//存放聚集类中部分的个数

	//构造方法
	public Bank(int sizeIn) {
		// TODO Auto-generated constructor stub
		//给list赋初始值
		list = new BankAccount[sizeIn];
		total = 0;
	}
	
	//查找当前账户在数组中的索引位置，成功则返回索引下标，失败则返回-999错误下标
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
	
	//得到当前系统中的账户总数
	public int getTatal() {
		return total;
	}
	
	//添加新的账户到列表中，成功返回true，失败返回false;(参数为BankAccount类对象)
	public boolean add(BankAccount accountIn){
		if(total == list.length){
			  return false;//返回false说明添加账户失败	  
		}else {
			list[total] = accountIn;//将账户信息添加到当前列表中
			total ++;
			return true;//添加成功
		}
	}
	
	//从银行账户列表中删除一个账户信息，成功返回true，失败返回false;
		public boolean remove(String accountNumIn){
			int index = search(accountNumIn);
			//删除用户思路：数组中存储账户信息，是顺序表结构存数据，
			//因此当删除一个账号后就应该自该位置起，往后的每一个元素都要向前移动位置
			if (index == -999) {
				return false;
			}else {
				for(int i=index;i<total-2;i++)//控制到最后两个元素，防止数组下标溢出而报错
					list[i] = list[i+1];//将后面的元素值往前挪
				total--;//将账户总数自减一
				return true;
			}
			
			 
		}
		
	
	
	//获取账户的账号信息,返回类实例化后的对象
	public BankAccount getItem(String accountNumIn) {
		int index;
		index = search(accountNumIn);//调用查找账户信息的方法--确定列表中有无账户信息
		if(index == -999){
			//查找失败，说明没有当前账号
			return null;
		}else {
			return list[index]; 
		}
	}
	
	//向账户中存钱 成功true,失败false
	public boolean depositeMoney(String accountNum,double amountIn) {
		int index = search(accountNum);//查询列表中是否有该账号
		if (index == -999) {
			return false;
		}else {
			list[index].deposite(amountIn);//调用bankaccount对象的deposite方法来完成存钱操作
			return true;
		}
	}
	
	
	//从账户中提钱 成功true,失败false
	public boolean withdrawMoney(String accountNum,double amountIn) {
		int index = search(accountNum);//查询列表中是否有该账号
		if (index == -999) {
			return false;
		}else {
			list[index].withdraw(amountIn);//调用bankaccount对象的deposite方法来完成存钱操作
			return true;
		}
	}
	
	
	
	

	
}
