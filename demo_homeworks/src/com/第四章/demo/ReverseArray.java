/**
 *
 *ReverseArray.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月4日 下午4:30:02
 *
 */
package com.第四章.demo;

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
		int reverseArr[];//声明一个空数组，用于存放arr数组逆序之后的元素
		System.out.println("原数组：\t");
		for(int i:arr){//增强后的for循环--(仅适用于对数组全部元素的查看)
			System.out.print(i+" ");
		}
		//调用函数，实现对数组逆序存储
		reverseArr = reverseArray(arr);
		System.out.println("\n逆序存储之后的数组：\t");
		for(int i:reverseArr){//增强后的for循环--(仅适用于对数组全部元素的查看)
			System.out.print(i+" ");
		}


	}
	
	//编写一个函数用于数组的逆序输出
	static int[] reverseArray(int[] arr){
		//有返回值的函数方法
		int tempArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			
			tempArr[i] = arr[arr.length-1-i];//把arr中最后一个数赋值给tempArr的第一个元素

		}
		//上面的步骤并未改变arr数组中原来的元素位置
		return tempArr;
	}

}
