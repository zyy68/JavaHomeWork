/**
 *
 *LessonTrain.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月1日 上午10:41:11
 *
 */
package com.课上练习.train1;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *
 */
public class LessonTrain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//第一题 画星号
		printTu();
		System.out.println("\n");
//第二题 列出数字三角形
		printShuZiTu();
		System.out.println("\n");
//第三题 猜数字
		findNum();
		System.out.println("\n");
//第四题 找出同购数
		findTongGou();
		System.out.println("\n");
//第五题 三目运算
		sanMu();
		
		
		
	}
	//输出星号图案
	static void printTu(){
		System.out.println("第（1）题 画星号");
		for(int i = 1;i<=4;i++){
			
			for(int k =1;k<i;k++){
				System.out.print(" ");
			}
			
			//
			for(int j=0;j<9;j++){
				System.out.print("*");
			}
			
			
			System.out.println();
//			System.out.println("*********");
			
		}
		System.out.println("\n\n");
	}
	//输出数字三角形
	static void printShuZiTu(){
		System.out.println("第（4）题 数字三角形");
//		for(int i=2;i<9;i++){
//			for(int j=1;j<i;j++){
//				System.out.print(i-j);
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=7;i++){//i=2
			for(int j=i;j>=1;j--){//
				System.out.print(j);//
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
	
	
	
	
	static void findNum(){
		System.out.println("第 6 题 找n 使得S=1*2*...*n<=400000");
		int ji = 1;//ji
		int n=1;
		while(ji<=400000){
			n++;
			ji = ji*n;
			
		}
		System.out.print(--n);
		System.out.println();
	}

	
	//4找同构数
	static void findTongGou(){
		System.out.println("第8题 找1-1000内的所有同构数");
		String qaString = "";
		String hou = "";
		
		for(int i=1 ;i<1000;i++){
			qaString = String.valueOf(i*i);
			hou = String.valueOf(i);
			if(qaString.endsWith(hou)){
				System.out.println(hou+" "+qaString);
			}
			
			
		}
	}
	
	static void sanMu(){

		Scanner sc = new Scanner(System.in);
		System.out.print("please input your score");
		int score,count;
		score = count =0;
		score = sc.nextInt();
		
		//判断score等级
		char result = score >= 90?'A' :(score>=80?'B':(score>=70?'C':(score>=60?'D':'E')));
		System.out.println(result);
		
		if(score>=90){
			System.out.println('A');
		}else {
			if(score>=80){
				System.out.println('B');
			}else {
				if (score>=70) {
					System.out.println('C');
				}else {
					if(score>=60){
						System.out.println('D');
					}else {
						System.out.println('E');
					}
				}
			}
		}
		
		
		if(score>=90){
			System.out.println('A');
		}else if (score>=80) {
			System.out.println('B');
		}else if (score>=70) {
			System.out.println('C');
		}else if (score>=60) {
			System.out.println('D');
		}else {
			System.out.println('E');
		}
		
		int num = score/10 ;
		System.out.println(num);
		switch (num) {
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('E');
			break;
		}
		
		//24h
	}
}


