package com.课上练习.train1;

import java.util.Scanner;
/**
 * 输入一个四位数逆序输出
 * */

import javax.annotation.Generated;

public class Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个四位整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		方法1，多变量声明
		//个位数ge,十位数shi ,百位数bai,千位数qian
		int ge = num%10;
		int shi = num%100/10;
		int bai = num/100%10;
		int qian = num/1000;
//		Double t = num/7%10.0;//取模运算
//		System.out.println(qian+"\n"+bai+"\n"+shi+"\n"+ge+"\n");
		
		newFunc(num);
		
		
	}
	
	public void train7_4() {
		int a = 0;
		int b= 0;
		int c = 0;
		for(int i=0,j=0;i<3;i++){
			c=j+=j++;			
		}
		System.out.println(a);
		
	}
//方法2 调用函数
	public static void newFunc(int num) {
//		System.out.println("请输入一个四位整数：");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		//个位数ge,十位数shi ,百位数bai,千位数qian
//		int ge = num%10;
//		int shi = num%100/10;
//		int bai = num/100%10;
//		int qian = num/1000;
//		Double t = num/7%10.0;//取模运算
		

		System.out.println((num/1000)+"\n"+(num/100%10)+"\n"+(num%100/10)+"\n"+(num%10)+"\n");
		
//		System.out.println(qian+"\n"+bai+"\n"+shi+"\n"+ge+"\n");
		
		
		
	}
}
