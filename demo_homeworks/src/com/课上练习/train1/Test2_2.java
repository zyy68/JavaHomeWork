package com.������ϰ.train1;

import java.util.Scanner;
/**
 * ����һ����λ���������
 * */

import javax.annotation.Generated;

public class Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����λ������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		����1�����������
		//��λ��ge,ʮλ��shi ,��λ��bai,ǧλ��qian
		int ge = num%10;
		int shi = num%100/10;
		int bai = num/100%10;
		int qian = num/1000;
//		Double t = num/7%10.0;//ȡģ����
//		System.out.println(qian+"\n"+bai+"\n"+shi+"\n"+ge+"\n");
		
		newFunc(num);
		
		
	}
	
	public void train7_4() {
		int a = 0;
		int b= 0;
		int c = 0;
		for(int i=0,j=0;i<3;i++){
			c=j+=j++;			
		}
		System.out.println(a);
		
	}
//����2 ���ú���
	public static void newFunc(int num) {
//		System.out.println("������һ����λ������");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		//��λ��ge,ʮλ��shi ,��λ��bai,ǧλ��qian
//		int ge = num%10;
//		int shi = num%100/10;
//		int bai = num/100%10;
//		int qian = num/1000;
//		Double t = num/7%10.0;//ȡģ����
		

		System.out.println((num/1000)+"\n"+(num/100%10)+"\n"+(num%100/10)+"\n"+(num%10)+"\n");
		
//		System.out.println(qian+"\n"+bai+"\n"+shi+"\n"+ge+"\n");
		
		
		
	}
}
