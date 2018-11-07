/**
 *
 *Sum1_500.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月19日 上午10:49:27
 *
 */
package com.课上练习.train1;

/**
 * @author sylvia.zhao
 *求1-500之和
 */
public class Sum1_500 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i=0;i<501;i++){
			sum += i;
		}
		System.out.println(sum);
		
		//求1-100偶数和
		int sum2 = 0;
		for(int j=0;j<101;j++){
			if(j%2 != 0)
				continue;
			sum2 += j;
		}
		System.out.println(sum2);
		
		//求1-100偶数和---大大降低了程序运行的时间成本
		int sum3 = 0;
		for(int j=0;j<101;j+=2){
			
			sum3 += j;
		}
		System.out.println(sum3);
	}

}
