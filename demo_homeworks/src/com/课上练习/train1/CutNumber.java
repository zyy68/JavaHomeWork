/**
 *
 *CutNumber.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月18日 下午10:02:53
 *
 */
package com.课上练习.train1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author sylvia.zhao
 *编写程序，将用户输入的小数以整数和小数部分分别输出
 */
public class CutNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 0;
		int zheng = 0;
		double wei = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个小数：");
		num = scanner.nextDouble();
		zheng = (int)num;//得到整数部分
		wei = num - zheng;//得到小数部分
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
//		String string = Double.toString(wei);
		System.out.println("输入的小数是"+num+"\n整数部分是："+zheng+"\n小数部分是："+decimalFormat.format(wei));
		

	}

}
