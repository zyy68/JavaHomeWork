/**
 *
 *ArrayOne.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月4日 下午1:38:32
 *
 */
package com.Four.Demo;

/**
 * @author sylvia.zhao
 *数组的声明和相关练习
 */
public class ArrayOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//熟悉数组的声明和创建
 		//声明一个数组（变量的声明+数组空间的分配）
		int[] arr1;//1声明数组名
		arr1 = new int[4];//2内存给数组分配空间
	
		int arr2[]={1,23,4,5};//12静态初始化数组
		int[] arrName = new int[10];
		
		
		//为每个元素赋值
		for(int i=0;i<10;i++){
			
			arrName[i] = i;//为数组赋值---动态初始化
//			System.out.println(arrName[i]);
			
		}
		
		
//		System.out.println(arrName);
		
		
		
		//声明一个数组，存放七天的温度
		int temperature[] = new int[7];
		//动态初始化数组元素
		for(int i=27;i>20;i--){
			//温度逐渐降低
			temperature[i-21]=i;
		}
		//遍历数组
		for(int j=temperature.length-1;j>-1;j--){
			System.out.println(temperature[j]);
		}

	}

}
