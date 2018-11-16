package com.第三章.demo;

import java.util.Scanner;

public class Demo3_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String pwd ;
		int pwd;
		
//		区分两者之间的定义方式
		float maxScore = (float) 2.9837;
		float minScore = 2.34f;
		
//		调用显示数据的方法
		displayMessage();
		//接收字符串的输入 
//		pwd = sc.nextInt();
		
		//调用判断是否是闰年的方法
		boolean isYear ;
		isYear = isLeapYear(1996);
		System.out.print(isYear);
		
		
//		3-4调用求圆面积的方法
		
		System.out.println(circleArea(4.0));
		
		
		int n=8;//求8的阶乘   8！
		System.out.print(Factorial(n));
		
		
		System.out.print(fiBo(8));//输出斐波那契数列中第8位数的值。
		
		 
	}
	//定义显示文本方法
		static void displayMessage(){
			System.out.println("请注意保护个人密码!");
			System.out.print("请输入取款密码：");
			
		}
		
		//3-2定义闰年判断方法
		static boolean isLeapYear(int year){
			boolean result = false;
			if(year%4 == 0 && year%100 != 0){
				result = true;
			}else if(year%400 == 0){
				result = true;
			}
			return result;
		}
		
		//3-4求圆面积
		static double circleArea(double r){
//			定义常量PI的值
			final double PI = 3.14;//区别于float类型的数据
			
			return (PI * r * r);
		}
		
//		3-5 绘制矩形面方法
		static void drawRectangle(char symbol,int row,int col){
			//row 控制多少行
		}
		
		
		//递归的方式调用  求阶乘
		static long  Factorial(int n){
			if(n==1){
				return 1;
			}else {
				return n*Factorial(n-1);
			}
		}
		

		//运用递归求斐波那契数列
		static long fiBo(int n){
			if(n==0 || n==1){
				return n;
			}else {
				return fiBo(n-1)+fiBo(n-2);// 1 1 2 3 5---后面的数值是前面两数之和，且第一位和第二位都是1；
				
			}
		}
}
