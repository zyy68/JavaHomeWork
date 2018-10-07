/**
 *
 *Test2_1.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月6日 下午4:21:56
 *
 */
package com.section2;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *(1)编写程序，提示用户输入一个小数，然后输出一个离这个的小鼠最近的整数
 */
public class Test2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个小数：");
		Double dNum = sc.nextDouble();
		Double dCeil = Math.ceil(dNum);
		Double dFloor = Math.floor(dNum);
		int nearNum = 0;
		
		//判断方法一：针对性考点

		Double dFloor2 = Math.floor(dNum+0.5);
		int result = dFloor2.intValue();
		System.out.println("靠近"+dNum+"的整数是："+result);
		
//		if((dFloor+0.5)!=dFloor){
//			//如1.6 + 0.5 = 2.1    此时dNum显然靠近2
//			nearNum = dFloor.intValue();
//		}else {
//			nearNum = dFloor.intValue();
//		}
		
		
		//判断方法二：
		if((dCeil-dNum)<(dNum-dFloor)){
//			nearNum = (int) dCeil;//语法错误
			nearNum = dCeil.intValue();//
			
		}else {
			nearNum = dFloor.intValue();
		}
		
		System.out.println("靠近"+dNum+"的整数是："+nearNum);
		

	}

}
