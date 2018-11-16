/**
 *
 *SelectSort.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月4日 下午4:14:16
 *
 */
package com.第四章.demo;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组排序的方法
 * @author sylvia.zhao
 *作业1 排序
 *作业2 合并两个无序数组并排序--小->大
 *（1）插入排序
 *（2）合并排序
 *（3）合并好元素之后，在进行冒泡或者推排序
 *
 */
public class SelectSort {

	/**
	 * @param args
	 * 数组作为函数的参数demo
	 * 函数作用是将数组从小到大进行排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={134,45,788,23};
		System.out.print("排序前arr的元素顺序为： ");  
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		//1-1调用排序函数
		sortArray(arr);
		
		//1-2最值排序
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
		
		System.out.print("\n排序后arr的元素顺序为： ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
	
	
	//1-1 冒泡排序------
	static void sortArray(int[] arr){
		int temp;
		for(int i=0;i<arr.length-1;i++){//选择第一个待比较的数字（为了不露，进行顺序选择）
			for(int j=i+1;j<arr.length;j++){//选择剩下的数中的第二个和第一个数做比较
				//当第二个数较小的时候，交换位置，直到该位置上的数是整个数组中的元素最小值的时候，循环结束，进行下一趟数字比较）
				if(arr[i]>arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
		//没有返回值
	}
	//将两个数组合并成一个数组
	//归并排序
	//插入排序
	//
	static int[] concatArray(int[] a,int[] b) {
        
        ArrayList list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        return  c;
    }

}
