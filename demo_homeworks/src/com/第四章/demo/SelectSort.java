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

/**
 * @author sylvia.zhao
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
		
		//����������
		sortArray(arr);
		System.out.print("\n�����arr��Ԫ��˳��Ϊ�� ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
	//����һ��������������������
	static void sortArray(int[] arr){
		int temp;
		for(int i=0;i<arr.length;i++){//ѡ���һ�����Ƚϵ����֣�Ϊ�˲�¶������˳��ѡ��
			for(int j=i+1;j<arr.length;j++){//ѡ��ʣ�µ����еĵڶ����͵�һ�������Ƚ�
				//���ڶ�������С��ʱ�򣬽���λ�ã�ֱ����λ���ϵ��������������е�Ԫ����Сֵ��ʱ��ѭ��������������һ�����ֱȽϣ�
				if(arr[i]>arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		//û�з���ֵ
	}

}
