/**
 *
 *SelectSort.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��4�� ����4:14:16
 *
 */
package com.��4��.����;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ��������ķ���
 * @author sylvia.zhao
 *��ҵ1 ����
 *��ҵ2 �ϲ������������鲢����--С->��
 *��1����������[2 6 7 9 15] [5 7 8 11 12]
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
		SelectSort sort = new SelectSort();
		// TODO Auto-generated method stub
		int arr[]={134,45,788,23};
		int arr1[] = new int[7];
//		System.out.print("����ǰarr��Ԫ��˳��Ϊ�� ");  
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
		
		
		
		//���������
		for(int i=0;i<arr.length;i++){
			arr1[i] =(int) (Math.random()*100+1);	
		}
		
		//1-1����ð��������
		System.out.println("ð�������㷨 �Ľ��Ϊ��");
		sort.sortArray(arr);
		for(int item:arr){
			System.out.print("\t"+item);
		}
		
		//1-2��������
		int a[] = {2,6,7,9,15};
		int b[] = {5,7,8,11,12};
		int temp[];
		
		System.out.println("\n���������㷨 �Ľ��Ϊ��");
		temp=insertSort(a,b);
		for(int item:temp){
			System.out.print("\t"+item);
		}
			
		
		//1-3�ϲ�+ð������
		
		System.out.println("\n�ϲ�+ð�������Ԫ��˳��Ϊ�� ");
		temp=sort.sortArray(concatArray(a,b));
		
		for(int item:temp){
			System.out.print("\t"+item);
		}


	}
	
	
	//1-1 ð������------
	 int[] sortArray(int[] arr){
		int temp;
		for(int i=0;i<arr.length-1;i++){//ѡ���һ�����Ƚϵ����֣�Ϊ�˲�©������˳��ѡ��
			for(int j=i+1;j<arr.length;j++){//ѡ��ʣ�µ����еĵڶ����͵�һ�������Ƚ�
				//���ڶ�������С��ʱ�򣬽���λ�ã�ֱ����λ���ϵ��������������е�Ԫ����Сֵ��ʱ��ѭ��������������һ�����ֱȽϣ�
				if(arr[i]>arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
		
	}
	
	
//	1--2 ��������
	static int[] insertSort(int[] a,int[] b){
		int temp[] = new int[a.length+b.length];//����һ���µ�����ռ����
//		System.out.println(temp.length);
		int index1 , index2,index;
		index1=index2=index=0;
		
		
		while(index1<a.length&&index2<b.length){
			if(a[index1]<=b[index2]){
				temp[index++]=a[index1++];				
			}else {
				temp[index++]=b[index2++];
			}
		}
		while(index1<a.length){
			temp[index++]=a[index1++];
		}
		while(index2<b.length){
			temp[index++]=b[index2++];
		}
		return temp;
		
	}
	
	//---1-3---����������ϲ���һ������
	//��������
	//
	static int[] concatArray(int[] a,int[] b) {
        
//        ArrayList list = new ArrayList(Arrays.asList(a));
//        list.addAll(Arrays.asList(b));
//        Object[] c = list.toArray();
//        return  c;
		int[] c=new int[a.length+b.length];
		//��ȡc�д���aԪ��֮�������Ԫ���±�λ��--�Ӹ��±꿪ʼ�洢b������ ��Ԫ�ء�
		int index=a.length;
		//��a��ֵȫ����ֵ��ȥ
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
//		��b��Ԫ��ȫ����ֵ��c
		for(int j=0;j<b.length;j++){
			c[j+index]=b[j];
		}
		return c;
    }

}
