/**
 *
 *PrintXing.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��21�� ����11:22:15
 *
 */
package com.������ϰ.train1;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 * *
 * **
 * ***
 * ****
 * *****
 * /��һ���ӡ�Ǻ�
	��һ�� ��ӡ�Ǻţ�135����
	������ ���������
//		
 */
public class PrintXing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		drawnXing();//��һ���ӡ�Ǻ�
//		drawXing2();//��һ�� ��ӡ�Ǻţ�135����
		printYanghui();//������ ���������
//		
//		whatsForDefault();//�ж�for()����Ĭ��ֵ


		
	}//main


	
	

	
	
	
	//��һ���ӡ�Ǻ�
	public static void drawnXing(){
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				
				System.out.print("*\t");
				
			}
			System.out.println();
		}

	}
	
	
	public static void drawXing2(){
		int n=5;
        for (int i = 1; i <= n; i++) {
        	for (int j = 0; j < n - i; j++) {
        		System.out.print(" ");
        	}
        	for (int k = 0; k < 2 * i - 1; k++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }

	}
	
	//���������
	public static void printYanghui(){
	
		 //����������ǵ�����
		  int num = 8;
		
		  //�����ά���������������ֵ
		  int[][] yangHui = new int [num][];
		  for(int i = 0; i < yangHui.length; i ++)
		    yangHui[i] = new int[i + 1];
		
		  
		  //����������ǵļ��㹫ʽ����ʼ������
		  for(int i = 0; i < yangHui.length; i ++)
		    for(int j = 0; j < yangHui[i].length; j ++)
		    {
		      //ÿһ�е�һ���������һ������Ϊ1
		      yangHui[i][0] = yangHui[i][i] = 1;
		
		      if(i > 1 && j > 0 && j < i)
		        //������ǵ�ֵ��������һ������ֵ֮��
		        yangHui[i][j] = yangHui[i - 1][j] + yangHui[i -1][j -1];
		    }
		
		  
		  //�������飬�����
		  for(int i = 0; i < yangHui.length; i ++)
		  {
		    for(int j = 0; j < (num - i ) / 2; j ++)
		      System.out.print("\t");
		    for(int j = 0; j < yangHui[i].length; j ++)
		      System.out.print(yangHui[i][j] + "\t");
		
		    System.out.println();
		  }
	}//printYanaghui
	
	
	
	static void whatsForDefault(){
		int count =0;
		for(;;){
			count++;
			System.out.println("��forѭ���е������ж����Ĭ��ֵ��");
			if(count>2){
				break;//������ǰѭ��
			}
		}
		//������˵����for()ѭ����Ĭ��ֵ�ǣ�����for(i=0;true;�����κβ���)
//		��forѭ���е������ж����Ĭ��ֵ��
//		��forѭ���е������ж����Ĭ��ֵ��
//		��forѭ���е������ж����Ĭ��ֵ��
	}
}//class



	
