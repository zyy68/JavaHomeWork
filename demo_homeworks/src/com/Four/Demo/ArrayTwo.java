/**
 *
 *ArrayTwo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月4日 下午4:53:49
 *
 */
package com.Four.Demo;

/**
 * @author sylvia.zhao
 *
 */
public class ArrayTwo {

	/**
	 * @param args
	 * 二维数组的声明，将3*3的矩阵翻转其对角线上的值
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int a[][] = {{1,8,10,11},{34,2,12,45},{0,13,3,20},{14,35,47,4}};
		int len=a.length;
		//遍历原数组
		System.out.print("\n原数组为：\n");
		for(int m=0;m<len;m++){
			for(int n=0;n<len;n++){
				System.out.print(a[m][n]+" ");
			}
			System.out.println();
		}
		
		
		//副对角线翻转【0】【0】--[3][3] [1][1]---[2][2]  [i][i]--[len-i][len-i]
		//注意：翻转只需要翻转一半即可，不能超过中间值，否则会进行两次翻转
		for(int i=0;i<len/2;i++){
			temp = a[i][i];
			a[i][i]=a[len-1-i][len-1-i];
			a[len-1-i][len-1-i]=temp;
			System.out.print("\nfnazhuan---"+a[i][i]+"--"+a[len-1-i][len-1-i]);
		}
		
		System.out.print("\n\n经过一次副对角线翻转后为：\n");
		for(int m=0;m<len;m++){
			for(int n=0;n<len;n++){
				System.out.print(a[m][n]+" ");
			}
			System.out.println();
		}
		
		
		//主对角线进行翻转 [len-1][0]---[0][len-1]   [len-2][1]---[1][len-2]
		for(int j=0;j<len/2;j++){
			temp = a[len-1-j][j];
			a[len-1-j][j]=a[j][len-1-j];
			a[j][len-1-j]=temp;
		}
		
		System.out.print("\n\n经过第二次主对角线翻转后为：\n");
		for(int m=0;m<len;m++){
			for(int n=0;n<len;n++){
				System.out.print(a[m][n]+" ");
			}
			System.out.println();
		}
		
	}

}
