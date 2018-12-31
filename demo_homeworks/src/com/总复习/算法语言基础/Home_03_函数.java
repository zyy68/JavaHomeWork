/**
 *Home_03_函数.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月27日 下午6:23:34
 */
package com.总复习.算法语言基础;

/**
 * @author sylvia.zhao
 *
 */
public class Home_03_函数 {

	public static void main(String[] args) {
		
//1		判断闰年方法：
		System.out.println(fun1_isYear(2018));
		
//2		斐波那契数列
		int n=9;
		System.out.println(fun2_fiBo(9));
		
//3		递归的方式调用  求阶乘
		long ji = fun3_jiCheng(n);
		System.out.println(ji);
		
//4		圆面积
		System.out.println(fun4_Area(5.0f));
		

	}
 //	4年一闰100年不闰，400年又闰
	static	boolean fun1_isYear(int y){
		if (y%4 == 0 && y%100 != 0 || y%400==0){
			return true;
		}else {
			return false;
		}
		
	}
	
	
//--------------------递归调用--------------------
//	斐波那契数列

	static  int fun2_fiBo(int n){
		if(n==0 || n==1){
			return n;
		}else {
			return fun2_fiBo(n-1)+fun2_fiBo(n-2);// 1 1 2 3 5---后面的数值是前面两数之和，且第一位和第二位都是1；
			
		}
	}
	
	//递归的方式调用  求阶乘
	static long  fun3_jiCheng(int n){
		//递归头，跳出循环的条件（临界值，最小值）
		if(n==1){
			return 1;
		}else {
			//递归体
			return n*fun3_jiCheng(n-1);
		}
	}

	
	//4		圆面积
	static float fun4_Area(float r){
		float area = 0.0f;
		area = (float) (Math.PI*r*r);
		return area;
	}

}
