package com.��4��.����;

import java.util.Scanner;

//������λ
/**
 * 13�� ÿ��6�� ǰ����Ϊͷ�Ȳգ����µ�Ϊ���òգ�
 * �û���ƱʱҪ�����û��ձ�
 * ���ݲձ�Ϊ�û��������һ��δ��ռ�õ���λ��
 * */
public class PlaneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ����λϵͳ�ռ�
		int  seats[][] = new int[13][6];
		int count1=12;//���ڼ�¼ͷ�Ȳյ���λ��Ʊ
		int count2=seats.length*seats[0].length-12;//��¼���ò���Ʊ
		int len=seats.length*seats[0].length;
//		seats[0][2]=seats[1][0]=seats[1][4]=seats[3][5]=seats[4][4]=seats[4][5]=1;
		//Ĭ�ϳ�ʼ����Ϊ0
		
		while(true){
			System.out.println(seats[4][5]);
			System.out.println("ѡ���Ʊ����\t������ͷ�����򾭼òգ�");
			Scanner scanner = new Scanner(System.in);
			String type = scanner.nextLine();//�õ��û����������
			
			
			if(type.equals("ͷ����")){
	//			//����һ  д��1��������������У�������ֻʣ�¼�����λ��ѡ��Ч�ʻή�͡�
	//			//�����������
	//			int hang=(int) (Math.random()*2);
	//			//�����������
	//			int lie=(int) (Math.random()*6);
	//			//�����ѡ�е�ֵ����1ʱ����ֵΪ1����ʾ�Ѿ�ѡ�У������ٴ��������λ
	//			if()
				
				if(count1==0){
					System.out.println("ͷ�Ȳ���ƱΪ��0 �š�");
				}else {
					System.out.println("ͷ�Ȳ�������ƱΪ��"+count1+"�š�");
					//����һ  д��2��ͨ�������ֱ�ӿ��ƿ�ѡ����λ
					int id=(int) Math.random()*12;
					if(seats[id/2][id%6]!=1){
						seats[id/2][id%6]=1;
						count1--;
					}
					
					System.out.println("");
				}
				
				
			}else if(type.equals("���ò�")){
				if(count2==0){
					System.out.println("���ò���ƱΪ��0 �š�");
				}else {
					System.out.println("���ò�������ƱΪ��"+count2+"�š�");
					//����һ  д��2��ͨ�������ֱ�ӿ��ƿ�ѡ����λ
					int id=(int) Math.random()*len;
					if(seats[id/seats[0].length+2][id%seats.length]!=1){
						seats[id/seats[0].length+2][id%seats.length]=1;
						count2--;
					}
					
					System.out.println("");
				}
				
			}else {
				System.out.println("�˳�ѡƱϵͳ��");
				break;
			}
		}//while
		//���seats
		System.out.println(seats[0].length+"\t"+seats.length);
		
		for(int i=0;i<seats.length;i++){
			for(int j=0;j<seats[0].length;j++){
				System.out.print(seats[i][j]+"  ");	
			}
			System.out.println();
		}

	}

}
