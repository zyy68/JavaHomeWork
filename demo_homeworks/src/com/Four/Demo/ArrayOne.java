/**
 *
 *ArrayOne.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��4�� ����1:38:32
 *
 */
package com.Four.Demo;

/**
 * @author sylvia.zhao
 *����������������ϰ
 */
public class ArrayOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ϥ����������ʹ���
 		//����һ�����飨����������+����ռ�ķ��䣩
		int[] arr1;//1����������
		arr1 = new int[4];//2�ڴ���������ռ�
	
		int arr2[]={1,23,4,5};//12��̬��ʼ������
		int[] arrName = new int[10];
		
		
		//Ϊÿ��Ԫ�ظ�ֵ
		for(int i=0;i<10;i++){
			
			arrName[i] = i;//Ϊ���鸳ֵ---��̬��ʼ��
//			System.out.println(arrName[i]);
			
		}
		
		
//		System.out.println(arrName);
		
		
		
		//����һ�����飬���������¶�
		int temperature[] = new int[7];
		//��̬��ʼ������Ԫ��
		for(int i=27;i>20;i--){
			//�¶��𽥽���
			temperature[i-21]=i;
		}
		//��������
		for(int j=temperature.length-1;j>-1;j--){
			System.out.println(temperature[j]);
		}

	}

}
