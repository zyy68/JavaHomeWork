/**
 *
 *Sum1_500.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��19�� ����10:49:27
 *
 */
package com.������ϰ.train1;

/**
 * @author sylvia.zhao
 *��1-500֮��
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
		
		//��1-100ż����
		int sum2 = 0;
		for(int j=0;j<101;j++){
			if(j%2 != 0)
				continue;
			sum2 += j;
		}
		System.out.println(sum2);
		
		//��1-100ż����---��󽵵��˳������е�ʱ��ɱ�
		int sum3 = 0;
		for(int j=0;j<101;j+=2){
			
			sum3 += j;
		}
		System.out.println(sum3);
	}

}
