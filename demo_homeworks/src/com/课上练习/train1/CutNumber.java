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

import java.awt.Stroke;
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
		String strNum = String.valueOf(num);//�������С��ת�����ַ���
		String a[] = new String[2];
		a=strNum.split("\\.");
//		System.out.println();
		System.out.println("�����С����"+num+"\n���������ǣ�"+a[0]+"\nС�������ǣ�0."+a[1]);
		
		
		
		
//		zheng = (int)num;//�õ���������
//		wei = num - zheng;//�õ�С������
//		System.out.println(String.format("%.2f", wei));
		
//		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
//		String string = Double.toString(wei);
//		System.out.println("�����С����"+num+"\n���������ǣ�"+zheng+"\nС�������ǣ�0."+decimalFormat.format(wei));
		

	}

}
