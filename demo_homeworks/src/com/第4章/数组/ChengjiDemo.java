/**
 *
 *ChengjiDemo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��9�� ����11:20:33
 *
 */
package com.��4��.����;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *���̽���10��ѧ���ĳɼ���Ȼ�����̨��ʾ��Щ�ɼ��;���
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
		scanner.close();//�ر�������
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
