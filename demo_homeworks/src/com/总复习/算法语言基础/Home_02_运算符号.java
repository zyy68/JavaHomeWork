/**
 *HomeTrain01.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��12��27�� ����3:37:32
 */
package com.�ܸ�ϰ.�㷨���Ի���;

import cn.���ű�.������ϰ.Main;

/**
 * @author sylvia.zhao
 *
 */
public class Home_02_������� {

//	public static void main(String[] args) {
////		P43 ij��Ϊ��������ѭ��֮��Ľ��;
//		int i, j;
////					=================��ϰһ=========================
//
//		for(i=0,j=0;i<10;i++){
//			j+=i;
//		}
//		System.out.println(j);
//		//����ļ���ȼ���������㷨-----------
//		int sum=0;
//		for(i=0;i<10;i++){
//			sum+=i;
//		}
//		System.out.println(sum);
//
//		
//		
//	}
//	
	
	
//	public static void main(String[] args) {
////		====================��ϰ��======================
//		int i,j;
//		for(i=0,j=1;i<10;i++){
//			j+=j;
//		}
//		System.out.println(j);
//		//-----------------------�ȼ�����ʽ��
//		int sum=1;
//		for(i=0;i<10;i++){
//			sum+=sum;//(10�Σ�1+1+(1+1)+(1+1+2)+...+(...+)
//		}
//		
//		System.out.println(sum);
//
//	}

//	public static void main(String[] args) {
////		====================��ϰ��======================
//
//		for(int j=0;j<10;j++){
//			j+=j;
//			/**��һ��ִ�еĲ����ǣ�
//			 * j=0
//			 * j=j+j��
//			 * j++;
//			 * ����forѭ�����ж�����
//			 * 
//			 * */
//		}
////		for(j=0;j<10;j++){
////			j=9;
		
//		}
//		System.out.println(j);

//	}
	
	public static void main(String[] args) {
		int a=0;
		int j=0;
		for(int i=0;i<10;i++){
//			j+=j++;
			j=j+(j++);
			System.out.println(j);             
			
		}
		System.out.println(j);
	}

	
	
	
	
	
}
