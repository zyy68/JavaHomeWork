package com.section2;

import java.util.Scanner;

import javax.annotation.Generated;

public class Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����λ������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//��λ��ge,ʮλ��shi ,��λ��bai,ǧλ��qian
		int ge = num%10;
		int shi = num%100/10;
		int bai = num/100%10;
		int qian = num/1000;
//		Double t = num/7%10.0;//ȡģ����
		System.out.println(qian+"\n"+bai+"\n"+shi+"\n"+ge+"\n");
		
		
		
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

}
