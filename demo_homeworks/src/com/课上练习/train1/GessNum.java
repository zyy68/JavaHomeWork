/**
 *
 *GessNum.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月18日 下午9:57:01
 *
 */
package com.课上练习.train1;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *猜1-100 之间的整数，
 */
public class GessNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//作业1
		int guessNum = 0;
		int num = 0;//由电脑随机生成的数
		int countGuess = 0;//记录猜了多少次
		boolean flag = true;
		
		//先生成一个随机数
		num = (int) Math.ceil((Math.random()*100));//范围1-100
		
		//控制用户一直猜测随机数的值，知道猜对后跳出程序
		while(flag){
			Scanner scanner = new Scanner(System.in);
			System.out.println("请猜一个1-100之间的整数：");
			
			//先随机生成1-100之间的整数
			
			guessNum = scanner.nextInt();
			countGuess ++;//将用户输入的次数加一
		
			if(guessNum == num){
				System.out.println("恭喜你猜对啦！\n您猜的数是"+guessNum+"\n一共猜了"+countGuess+"次。");
				flag = false;
				
			}else if (guessNum<num) {
				System.out.println("你猜的数 "+guessNum+"小啦，再猜一次！");
			}else if (guessNum > num) {
				System.out.println("你猜的数 "+guessNum+"大啦，再猜一次！");
			}
		}
		
		
		
	}

}
