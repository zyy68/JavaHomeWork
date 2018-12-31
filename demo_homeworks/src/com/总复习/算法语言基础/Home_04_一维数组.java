/**
 *Home_04_一维数组.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月27日 下午7:05:05
 */
package com.总复习.算法语言基础;

/**
 * @author sylvia.zhao
 *
 */
public class Home_04_一维数组 {

	public static void main(String[] args) {
		//声明方法
		int a[] = new int[4];//声明一维数组并分配空间
		int b[] = {11,2,4};//静态初始化一个一维数组
		System.out.println(a);
		System.out.println('\u0021');//
		a = null;//NULL不是java的关键字，For也不是
		System.out.println("abc"==new String("abc"));
		
		int list[] = new int[20];
		for(int i=0;i<20;i++){
			list[i] = (int)(Math.random()*100+1);
			System.out.print(list[i]+" ");
		}
		
		
	
	}
}
