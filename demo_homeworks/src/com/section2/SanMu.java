/**
 *
 *SanMu.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月12日 上午11:10:06
 *
 */
package com.section2;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *
 */
public class SanMu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
