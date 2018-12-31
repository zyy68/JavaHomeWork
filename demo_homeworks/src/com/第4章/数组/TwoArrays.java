/**
 *
 *TwoArrays.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��23�� ����10:30:36
 *
 */
package com.��4��.����;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

/**
 * ��ά����Ķ����ʵ��
 * @author sylvia.zhao
 *
 */
public class TwoArrays {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//			��ά��һλ����֮���໥ת��
		//oneTransTwo();
//		��ά�������
		//aChengBArr();		
		
		//����ת--��ҵ3
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int reverseArr[];//����һ�������飬���ڴ��arr��������֮���Ԫ��
//		reverseArr = reverseArray(arr);
//		System.out.println("\n����洢֮������飺\t");
//		for(int i:reverseArr){//��ǿ���forѭ��--(�������ڶ�����ȫ��Ԫ�صĲ鿴)
//			System.out.print(i+" ");
//		}
		
		//�����ε����------��ҵ�����߶����λ�ã���
		
		//���ϵı���⣨5��Ԥ����Ʊ
		orderPlane();

		//���ϵı���⣨6��
/**
 * ʹ�ö�ά����洢һ����ÿ����������º�������¡��ó������һ���м�ֵ���µľ�ֵ����ֵ��
 * 
 * */
		//�����ά�����������һ�д��ÿ���µ�������£��ڶ��д��ÿ�����������
		int tempreture[][] = {{9,-2},{8,-16},{10,8},{12,-4},{13,4},
				{20,14},{22,18},{25,14},{34,24},{38,25},
				{29,20},{23,13}};
		int tempreture2[][]={{9,8,10,12,13,20,22,25,34,38,29,23},{-2,-16,8,-4,4,14,18,14,24,25,20,13}};
//		getData()�����������û��ӿ���̨�������� 
//		averageTemp(tempreture2);
		
		
		

	}
	
//	��ά�����һά����֮���ת��
	static void oneTransTwo(){
		int a[][]={{2,4,7},{5,2,3},{6,4,1}};
		
		int c[] = new int[9];
		int d[][] = new int[3][3];
		int sum=0;
		for(int i=0;i<a.length*a[0].length;i++){
			sum+=a[i/3][i%3];
			c[i]=a[i/3][i%3];
			d[i/3][i%3]=c[i];
		}
		
		
		for(int j=0;j<9;j++){
			if(j%3==0)
				System.out.println();
			System.out.print(d[j/3][j%3]+" ");
		}
		
		
	}
	
//-----------------------------�������a*b=c  ------------------------------	
	static void aChengBArr(){
	
		//�������a*b=c  
		/***
		 * a1 a2 a3   e1 e2 e3   (a1*e1+a2*f1+a3*g1)  (a1*e2+a2*f2+a3*g2)  (a1*e3+a2*f3+a3*g3) 
		 * b1 b2 b3 * f1 f2 f3 = (b1*e1+b2*f1+b3*g1)  (b1*e2+b2*f2+b3*g2)  (b1*e3+b2*f3+b3*g3)
		 * c1 c2 c3   g1 g2 g3   ...
		 * */
		int arr1[][] = {{1,1,1},{1,1,1},{1,1,1}};
		int arr2[][]={{1,1,1},{1,1,1},{1,1,1}};
		int arr3[][] = new int[3][3];
		int sum=0;
		for(int i=0;i<3;i++){//���ڿ��Ƶ�һ������arr1����		
			for(int j=0;j<3;j++){//a1 a2 a3//j,k���ڿ��ƶ�ά������к���===j�ɿ��Ƶڶ�������arr2����
				sum=0;//ÿȷ��һ��Ԫ�ص�λ�ú�Ҫ��sum����
				for(int k=0;k<3;k++){//e1 f1 g1//k���ڿ���arr1���У�arr2����
					sum+=arr1[i][k]*arr2[k][j];
				}
				arr3[i][j]=sum;//ֱ�ӽ��õ��ĺͷ����µĶ�ά�����С�
			}
		}
		//������ά����
		for(int j=0;j<9;j++){
			if(j%3==0)
				System.out.println();
			System.out.print(arr3[j/3][j%3]+" ");
		}
		
		
	}

	
//	������Ԫ������洢
	static int[] reverseArray(int[] arr){
		//�з���ֵ�ĺ�������
		int tempArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			
			tempArr[i] = arr[arr.length-1-i];//��arr�����һ������ֵ��tempArr�ĵ�һ��Ԫ��

		}
		//����Ĳ��貢δ�ı�arr������ԭ����Ԫ��λ��
		return tempArr;
	}
	//�¶ȼ�ֵ��ƽ��ֵ
	static void averageTemp(int[][] arr2){
		int averageHeight = 0;
		int averageLow =0;
		int indexHighi,indexHighj,indexLowi,indexLowj;
		indexHighi=indexHighj=indexLowi=indexLowj=0;
		int max,min;
		int temp=0;
		max=min=arr2[0][0];
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[0].length;j++){
				if(i==0){
					averageHeight+=arr2[0][j];
				}else {
					averageLow+=arr2[1][j];
				}
				if(max<arr2[i][j]){
					max = arr2[i][j];
					indexHighi=i;
					indexHighj=j;
				}
				if(min>arr2[i][j]){
					min = arr2[i][j];
					indexLowi=i;
					indexLowj=j;
				}
			}
			
		}
		//���ֵ
		averageHeight/=12;
		averageLow/=12;
		System.out.println("averageHeight="+averageHeight+"\taverageLow="+averageLow);
		
		System.out.println("The Highest Temp is "+arr2[indexHighi][indexHighj]+
				" indexHighTemp is ["+indexHighi+"]"+"["+indexHighj+
				"]\n"+"The Highest Temp is "+arr2[indexLowi][indexLowj]+
				" indexLowTemp is ["+indexLowi+"]"+"["+indexLowj+"]");
		
		
	}
	
	static void orderPlane(){
		int piaoArr[][] = new int[13][6];
		//ͷ�Ȳ�
		int touArr[][] = new int[2][6];
		//���ò�
		int jingJiArr[][] = new int[11][6];
		int touLeave[] = new int[12];
		int jingLeave[] = new int[66];
		//����Ψһ����û�Ԥ������λid
		int indexTou=0;
		int indexJing=0;
		//���ڽ綨��Ʊ����
		int countTou=12;
		int countJing=11*6;
		
		//�����û�ѡ��Ԥ������
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����붩Ʊ�����ţ�ͷ�Ȳ�1�ţ����ò�2�ţ�����3�ţ���");
		while(true){
	//		���û���Ʊ--Ԥ�����
			//�û�Ԥ��ͷ�Ȳ�
			int num = scanner.nextInt();
			if(num==1){
				//�жϻ�ʣ�����Ż�Ʊ����ƱΪ0����ϵͳ
				if(countTou<1){
					break;
				}
				int select = (int) (Math.random()*12);
				while(touLeave[select]==1){
					select++;
					if(select>11){
						select=0;
					}
				}
				touLeave[select]=1;
				indexTou = select;
				countTou--;
				//ֱ�ӽ���ά�����б�ѡ�е��±�����Ԫ��ֵ��Ϊ1
				
				touArr[select/6][select%6]=1;
				//���������Ʊ���
				for(int i=0;i<2;i++){
					for(int j=0;j<6;j++){
						System.out.print(touArr[i][j]+"  ");
					}
					System.out.println();
				}
			}//if num==1
			else if (num==2) {
				System.out.println("ѡ�񾭼òա�");
				
				//�жϻ�ʣ�����Ż�Ʊ����ƱΪ0����ϵͳ
				if(countJing<1){
					break;
				}
				int select = (int) (Math.random()*66);
				while(jingLeave[select]==1){
					select++;
					if(select>66){
						select=0;
					}
				}
				jingLeave[select]=1;
				indexJing = select;
				countJing--;
				//ֱ�ӽ���ά�����б�ѡ�е��±�����Ԫ��ֵ��Ϊ1
				
				jingJiArr[select/6][select%6]=1;
				//���������Ʊ���
//				System.out.println("    A  B  C  D  E  F");
				for(int i=0;i<11;i++){
					System.out.print("��"+(i+2)+"�У�");
					for(int j=0;j<6;j++){
						System.out.print(jingJiArr[i][j]+"  ");
					}
					System.out.println();
				}
				
				
			}else {
				break;
			}
		}//while
		System.out.println("����Ԥ����Ʊϵͳ��");
	}
	
	
	//δ�Ż��Ĵ���
	static void selectTicket(int countTicket,int[] leaveArr,int indexTiclet,int[] ticketArr){
		//�жϻ�ʣ�����Ż�Ʊ����ƱΪ0����ϵͳ
		if(countTicket<1){
//			break;
		}
		int select = (int) (Math.random()*66);
		while(leaveArr[select]==1){
			select++;
			if(select>66){
				select=0;
			}
		}
		leaveArr[select]=1;
		indexTiclet = select;
		countTicket--;
		//ֱ�ӽ���ά�����б�ѡ�е��±�����Ԫ��ֵ��Ϊ1
		
//		ticketArr[select/6][select%6]=1;
	}

}
