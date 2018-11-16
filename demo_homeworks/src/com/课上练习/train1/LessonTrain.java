/**
 *
 *LessonTrain.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��1�� ����10:41:11
 *
 */
package com.������ϰ.train1;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *
 */
public class LessonTrain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��һ�� ���Ǻ�
		printTu();
		System.out.println("\n");
//�ڶ��� �г�����������
		printShuZiTu();
		System.out.println("\n");
//������ ������
		findNum();
		System.out.println("\n");
//������ �ҳ�ͬ����
		findTongGou();
		System.out.println("\n");
//������ ��Ŀ����
//		sanMu();
		
		
		
	}
	//����Ǻ�ͼ��
	static void printTu(){
		System.out.println("�ڣ�1���� ���Ǻ�");
		for(int i = 1;i<=4;i++){
			
			for(int k =1;k<i;k++){
				System.out.print(" ");
			}
			
			//
			for(int j=0;j<9;j++){
				System.out.print("*");
			}
			
			
			System.out.println();
//			System.out.println("*********");
			
		}
		System.out.println("\n\n");
	}
	//�������������
	static void printShuZiTu(){
		System.out.println("�ڣ�4���� ����������");
//		for(int i=2;i<9;i++){
//			for(int j=1;j<i;j++){
//				System.out.print(i-j);
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=7;i++){//i=2
			for(int j=i;j>=1;j--){//
				System.out.print(j);//
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
	
	
	
	
	static void findNum(){
		System.out.println("�� 6 �� ��n ʹ��S=1*2*...*n<=400000");
		int ji = 1;//ji
		int n=1;
		while(ji<=400000){
			n++;
			ji = ji*n;
			
		}
		System.out.print(--n);
		System.out.println();
	}

	
	//4��ͬ���� ����һ
	static void findTongGou1(){
		
		System.out.println("��8�� ��1-1000�ڵ�����ͬ����");
		String qaString = "";
		String hou = "";
		
		
		for(int i=1 ;i<1000;i++){
			qaString = String.valueOf(i*i);
			hou = String.valueOf(i);
			if(qaString.endsWith(hou)){
				System.out.println(hou+" "+qaString);
			}
			
			
		}
	}
	//������
	static void findTongGou(){
		int result=0;
		boolean flag=false;
		for(int i=1;i<=1000;i++){
			if(i == i*i%1000 || i==i*i%100 || i==i*i%10){
				System.out.println(i*i+" ��ͬ�����ǣ�  "+i);
			}
//			result=i*i;//ƽ����Ľ��
//			if(result>1000){
//				break;
//			}
			
//			if(i<10 && i%10==result%10 ){
//				flag=true;
////				System.out.println(result+"��ͬ������"+i);
//			}else if(i<100 && i%100==result%100){
//				flag=true;
//			}else if(i<1000 &&i%1000==result%1000){
//				flag=true;
////				System.out.println(result+"��ͬ������"+i);
//			}
//				
//			if(flag){
//				
//			}
//			flag=false;
		}
	}
	
	static void sanMu(){

		Scanner sc = new Scanner(System.in);
		System.out.print("please input your score");
		int score,count;
		score = count =0;
		score = sc.nextInt();
		
		//�ж�score�ȼ�
		char result = score >= 90?'A' :(score>=80?'B':(score>=70?'C':(score>=60?'D':'E')));
		System.out.println(result);
		
		if(score>=90){
			System.out.println('A');
		}else {
			if(score>=80){
				System.out.println('B');
			}else {
				if (score>=70) {
					System.out.println('C');
				}else {
					if(score>=60){
						System.out.println('D');
					}else {
						System.out.println('E');
					}
				}
			}
		}
		
		
		if(score>=90){
			System.out.println('A');
		}else if (score>=80) {
			System.out.println('B');
		}else if (score>=70) {
			System.out.println('C');
		}else if (score>=60) {
			System.out.println('D');
		}else {
			System.out.println('E');
		}
		
		int num = score/10 ;
		System.out.println(num);
		switch (num) {
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('E');
			break;
		}
		
		//24h
	}
}


