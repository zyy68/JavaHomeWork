/**
 *
 *SelectSort.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月4日 下午4:14:16
 *
 */
package com.第4章.数组;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组排序的方法
 * @author sylvia.zhao
 *作业1 排序
 *作业2 合并两个无序数组并排序--小->大
 *（1）插入排序[2 6 7 9 15] [5 7 8 11 12]
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
		SelectSort sort = new SelectSort();
		// TODO Auto-generated method stub
		int arr[]={134,45,788,23};
		int arr1[] = new int[7];
//		System.out.print("排序前arr的元素顺序为： ");  
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
		
		
		
		//生成随机数
		for(int i=0;i<arr.length;i++){
			arr1[i] =(int) (Math.random()*100+1);	
		}
		
		//1-1调用冒泡排序函数
		System.out.println("冒泡排序算法 的结果为：");
		sort.sortArray(arr);
		for(int item:arr){
			System.out.print("\t"+item);
		}
		
		//1-2插入排序
		int a[] = {2,6,7,9,15};
		int b[] = {5,7,8,11,12};
		int temp[];
		
		System.out.println("\n插入排序算法 的结果为：");
		temp=insertSort(a,b);
		for(int item:temp){
			System.out.print("\t"+item);
		}
			
		
		//1-3合并+冒泡排序
		
		System.out.println("\n合并+冒泡排序的元素顺序为： ");
		temp=sort.sortArray(concatArray(a,b));
		
		for(int item:temp){
			System.out.print("\t"+item);
		}


	}
	
	
	//1-1 冒泡排序------
	 int[] sortArray(int[] arr){
		int temp;
		for(int i=0;i<arr.length-1;i++){//选择第一个待比较的数字（为了不漏，进行顺序选择）
			for(int j=i+1;j<arr.length;j++){//选择剩下的数中的第二个和第一个数做比较
				//当第二个数较小的时候，交换位置，直到该位置上的数是整个数组中的元素最小值的时候，循环结束，进行下一趟数字比较）
				if(arr[i]>arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
		
	}
	
	
//	1--2 插入排序
	static int[] insertSort(int[] a,int[] b){
		int temp[] = new int[a.length+b.length];//声明一个新的数组空间变量
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
	
	//---1-3---将两个数组合并成一个数组
	//插入排序
	//
	static int[] concatArray(int[] a,int[] b) {
        
//        ArrayList list = new ArrayList(Arrays.asList(a));
//        list.addAll(Arrays.asList(b));
//        Object[] c = list.toArray();
//        return  c;
		int[] c=new int[a.length+b.length];
		//获取c中存完a元素之后的数组元素下标位置--从该下标开始存储b数组中 的元素。
		int index=a.length;
		//将a中值全部赋值进去
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
//		将b中元素全部赋值给c
		for(int j=0;j<b.length;j++){
			c[j+index]=b[j];
		}
		return c;
    }

}
