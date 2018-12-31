/**
 *Home_03_方法的重载.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月27日 下午6:49:07
 */
package com.总复习.算法语言基础;

/**
 * @author sylvia.zhao
 *
 */
public class Home_03_方法的重载 {

	//写一个add方法，要求实现不同参数类型的数据进行加法运算，不同的参数个数进行加法
	public static void main(String[] args) {
		int a,b,c,sum;
		a=b=c=8;
		sum=0;
		
	}
	//方法的重载只能通过两种方式：
	/**1、参数的列表不同（参数个数不相同）
	 * 2、参数的类型不同（一个或多个参数类型不相同）
	 * */
	static int add(int x,int y){
		return x+y;
	}
	
	static int add(int x,int y,int z){
		return x+y+z;
	}
	static int add(Double x,int y){
		return (int)(x+y);
	}

	//error---这里返回值不同，但函数名和参数列表以及参数类型都相同不能实现方法的重载。
//	static double add(int x,int y){
//		return 3.0945;
//	}
	
	//编译不通过的几种情况：error来表示
	public static int plusFunc(int x,int y) {
//		int x;//error duplicate declare
//		int y;
		return x+y;
//		System.out.println("dfjsh");//error 这是一句永远执行不到的废话，且编译不通-=】p
		
	}
	
}
