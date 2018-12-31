/**
 *
 *ChengjiDemo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月9日 上午11:20:33
 *
 */
package com.第4章.数组;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *键盘接受10个学生的成绩，然后控制台显示这些成绩和均分
 */
public class ChengjiDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++){
			int temp=scanner.nextInt();
			a[i]=temp;
			
		}
		scanner.close();//关闭输入流
//		
//		int sum=0;
		for(int elem:a){
			System.out.print(" "+elem);
			sum+=elem;
		}
//		
		System.out.println("sum is"+sum+ "\n avege is"+sum/a.length);
		
		

	}

}
