/**
 *
 *CutNumber.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��18�� ����10:02:53
 *
 */
package com.������ϰ.train1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author sylvia.zhao
 *��д���򣬽��û������С����������С�����ֱַ����
 */
public class CutNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 0;
		int zheng = 0;
		double wei = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��С����");
		num = scanner.nextDouble();
		zheng = (int)num;//�õ���������
		wei = num - zheng;//�õ�С������
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
//		String string = Double.toString(wei);
		System.out.println("�����С����"+num+"\n���������ǣ�"+zheng+"\nС�������ǣ�"+decimalFormat.format(wei));
		

	}

}
