/**
 *
 *GussSum.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月18日 下午10:32:12
 *
 */
package sylvia.Second.Train;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *用户输入两个数，并输入一个猜测的数，如果猜测数是两数之和，那么就祝贺用户，否则给予慰问信息和正确答案
 */
public class GussSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		num1 = num2 = 0.0;
		double guessNum = 0.0;
		boolean flag = false;
		while(!flag){
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入第一个数：");
			num1 = scanner.nextDouble();
			
			System.out.println("请输入第二个数：");
			num2 = scanner.nextDouble();
			
			System.out.println("请猜测这两个数之和是：");
			guessNum = scanner.nextDouble();
			
			
			if(num1+num2 == guessNum){
				System.out.println("恭喜你猜对啦！这个两数和是："+(num1+num2));
				flag = true;
			}else {
				System.out.println("你猜的数字不正确哦，请重新输入！");
			}
		}
		
		
		
	}

}
