/**
 *
 *GessNum.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��18�� ����9:57:01
 *
 */
package com.������ϰ.train1;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *��1-100 ֮���������
 */
public class GessNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��ҵ1
		int guessNum = 0;
		int num = 0;//�ɵ���������ɵ���
		int countGuess = 0;//��¼���˶��ٴ�
		boolean flag = true;
		
		//������һ�������
		num = (int) Math.ceil((Math.random()*100));//��Χ1-100
		
		//�����û�һֱ�²��������ֵ��֪���¶Ժ���������
		while(flag){
			Scanner scanner = new Scanner(System.in);
			System.out.println("���һ��1-100֮���������");
			
			//���������1-100֮�������
			
			guessNum = scanner.nextInt();
			countGuess ++;//���û�����Ĵ�����һ
		
			if(guessNum == num){
				System.out.println("��ϲ��¶�����\n���µ�����"+guessNum+"\nһ������"+countGuess+"�Ρ�");
				flag = false;
				
			}else if (guessNum<num) {
				System.out.println("��µ��� "+guessNum+"С�����ٲ�һ�Σ�");
			}else if (guessNum > num) {
				System.out.println("��µ��� "+guessNum+"�������ٲ�һ�Σ�");
			}
		}
		
		
		
	}

}
