/**
 *Train1.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月17日 下午8:09:15
 */
package cn.蓝桥杯.校内试题;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *
 */
public class Train1 {

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
				
					int year = sc.nextInt();
					if(year%4==0&&year%100!=0){
						System.out.println("yes");
					}else {
						System.out.println("no");
					}
			
		}
	
}
