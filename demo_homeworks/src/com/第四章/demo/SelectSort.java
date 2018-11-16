/**
 *
 *SelectSort.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��4�� ����4:14:16
 *
 */
package com.������.demo;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ��������ķ���
 * @author sylvia.zhao
 *��ҵ1 ����
 *��ҵ2 �ϲ������������鲢����--С->��
 *��1����������
 *��2���ϲ�����
 *��3���ϲ���Ԫ��֮���ڽ���ð�ݻ���������
 *
 */
public class SelectSort {

	/**
	 * @param args
	 * ������Ϊ�����Ĳ���demo
	 * ���������ǽ������С�����������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={134,45,788,23};
		System.out.print("����ǰarr��Ԫ��˳��Ϊ�� ");  
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		//1-1����������
		sortArray(arr);
		
		//1-2��ֵ����
		int arrMax,arrMin;
		arrMax=arrMin=arr[0];
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]>arrMax)
//				arrMax=arr[i];
//			else {
//				arrm
//			}
//			System.out.print(arr[i]+" ");
//		}
		
		System.out.print("\n�����arr��Ԫ��˳��Ϊ�� ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
	
	
	//1-1 ð������------
	static void sortArray(int[] arr){
		int temp;
		for(int i=0;i<arr.length-1;i++){//ѡ���һ�����Ƚϵ����֣�Ϊ�˲�¶������˳��ѡ��
			for(int j=i+1;j<arr.length;j++){//ѡ��ʣ�µ����еĵڶ����͵�һ�������Ƚ�
				//���ڶ�������С��ʱ�򣬽���λ�ã�ֱ����λ���ϵ��������������е�Ԫ����Сֵ��ʱ��ѭ��������������һ�����ֱȽϣ�
				if(arr[i]>arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
		//û�з���ֵ
	}
	//����������ϲ���һ������
	//�鲢����
	//��������
	//
	static int[] concatArray(int[] a,int[] b) {
        
        ArrayList list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        return  c;
    }

}
