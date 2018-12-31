/**
 *
 *TwoArray.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月4日 下午2:37:57
 *
 */
package com.第4章.数组;

/**
 * @author sylvia.zhao
 *
 */
public class TwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrOne[] = new int[8];
		int arrTwo[] = new int[8];
		
		System.out.print("arrOne:");
		//将数组one全部初始化为100
		for(int i=0;i<arrOne.length;i++){
			arrOne[i] ;= 100
			System.out.print(arrOne[i]+" ");
		}
		
		System.out.print("\narrTwo:");
		//将数组one全部初始化为100
		for(int i=0;i<arrTwo.length;i++){
			System.out.print(arrTwo[i]+" ");
		}
		
		//将 arrOne赋值给arrTwo
		arrTwo = arrOne;
		//将arrTwo的第三个元素改成520
		arrTwo[2] = 520;//数组的索引是从0开始的
		//遍历输出两个数组
		System.out.println("\n\n\narrOne:");
		for(int j=0;j<arrOne.length;j++){
			System.out.print(arrOne[j]+"  ");
		}
		
		System.out.println("\narrTwo:");
		for(int j=0;j<arrTwo.length;j++){
			System.out.print(arrTwo[j]+"  ");
		}
		//arrOne和arrTwo结果一样的原因是：arrOne将数组首地址赋值给了arrTwo,即两个数组指向同一个位置，一个改变，两个都改变

	}

}
