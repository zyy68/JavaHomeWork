/**
 *
 *ReverseArray.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��4�� ����4:30:02
 *
 */
package com.������.demo;

/**
 * @author sylvia.zhao
 *
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int reverseArr[];//����һ�������飬���ڴ��arr��������֮���Ԫ��
		System.out.println("ԭ���飺\t");
		for(int i:arr){//��ǿ���forѭ��--(�������ڶ�����ȫ��Ԫ�صĲ鿴)
			System.out.print(i+" ");
		}
		//���ú�����ʵ�ֶ���������洢
		reverseArr = reverseArray(arr);
		System.out.println("\n����洢֮������飺\t");
		for(int i:reverseArr){//��ǿ���forѭ��--(�������ڶ�����ȫ��Ԫ�صĲ鿴)
			System.out.print(i+" ");
		}


	}
	
	//��дһ����������������������
	static int[] reverseArray(int[] arr){
		//�з���ֵ�ĺ�������
		int tempArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			
			tempArr[i] = arr[arr.length-1-i];//��arr�����һ������ֵ��tempArr�ĵ�һ��Ԫ��

		}
		//����Ĳ��貢δ�ı�arr������ԭ����Ԫ��λ��
		return tempArr;
	}

}
