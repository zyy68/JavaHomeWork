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
		
//		运算时间最短时间的方法
//		int类型是去尾， 
//		思路：例如int（1.3 + 0.5）=> 1 ;int(2.9+0.5) => 3
//		特殊情况：int(-1.2+0.5) => -1;int(-1.9+0.5) => -1//error不符合这样思路
//		然而 int(-1.2-0.5) => -1;int(-1.9-0.5)=>-2//那么要预先判断输入的小数的正负情况
//		
//		Double resultNum = (dNum>0) ? ((dNum+0.5).intValue()) : int(dNum-0.5);
		
		
		//位移
		int a=0b110;//2*2+2+0=6
		int b=a<<2;
		System.out.print(b);
		
		
		//方法0 ：直接Math.round函数
		int ddNum = (int) Math.round(dNum);
		System.out.println("靠近"+dNum+"的整数是："+ddNum);
		
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
		
//		int result3 = (Math.round(dNum)).intValue();
		
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
