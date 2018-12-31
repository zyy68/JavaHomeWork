/**
 *HomeTrain01.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月27日 下午3:37:32
 */
package com.总复习.算法语言基础;

import cn.蓝桥杯.入门练习.Main;

/**
 * @author sylvia.zhao
 *
 */
public class Home_02_运算符号 {

//	public static void main(String[] args) {
////		P43 ij均为整数，求循环之后的结果;
//		int i, j;
////					=================练习一=========================
//
//		for(i=0,j=0;i<10;i++){
//			j+=i;
//		}
//		System.out.println(j);
//		//上面的计算等价于下面的算法-----------
//		int sum=0;
//		for(i=0;i<10;i++){
//			sum+=i;
//		}
//		System.out.println(sum);
//
//		
//		
//	}
//	
	
	
//	public static void main(String[] args) {
////		====================练习二======================
//		int i,j;
//		for(i=0,j=1;i<10;i++){
//			j+=j;
//		}
//		System.out.println(j);
//		//-----------------------等价于下式：
//		int sum=1;
//		for(i=0;i<10;i++){
//			sum+=sum;//(10次：1+1+(1+1)+(1+1+2)+...+(...+)
//		}
//		
//		System.out.println(sum);
//
//	}

//	public static void main(String[] args) {
////		====================练习三======================
//
//		for(int j=0;j<10;j++){
//			j+=j;
//			/**第一次执行的操作是：
//			 * j=0
//			 * j=j+j；
//			 * j++;
//			 * 返回for循环的判断条件
//			 * 
//			 * */
//		}
////		for(j=0;j<10;j++){
////			j=9;
		
//		}
//		System.out.println(j);

//	}
	
	public static void main(String[] args) {
		int a=0;
		int j=0;
		for(int i=0;i<10;i++){
//			j+=j++;
			j=j+(j++);
			System.out.println(j);             
			
		}
		System.out.println(j);
	}

	
	
	
	
	
}
