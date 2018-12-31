/**
 *
 *MethodsExp5.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月13日 下午10:47:51
 *
 */
package com.第3章.demo;

/**方法的重载
 * @author sylvia.zhao
 *
 */
public class MethodsExp5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isum;
		double dsum;
		isum=add(3, 4);
		System.out.println(isum);
		
		isum = add(23, 34, 45);
		System.out.println(isum);
		
		dsum = add(3.14, 8.13);
		System.out.println(isum);
		
	}
	
	
	//方法的重载（方法的名字一样，参数列表不一样，返回值也不相同）
	static int add(int x,int y){
		return x+y;
	}
	static int add(int x,int y,int z){
		return x+y+z;
		
	}
	
	static double add(double x,double y){
		return x+y;
	}

}
