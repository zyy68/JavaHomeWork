/**
 *
 *PrintXing.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月21日 下午11:22:15
 *
 */
package com.课上练习.train1;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 * *
 * **
 * ***
 * ****
 * *****
 * /第一题打印星号
	第一题 打印星号，135排列
	第三题 杨辉三角形
//		
 */
public class PrintXing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		drawnXing();//第一题打印星号
//		drawXing2();//第一题 打印星号，135排列
		printYanghui();//第三题 杨辉三角形
//		
//		whatsForDefault();//判断for()语句的默认值


		
	}//main


	
	

	
	
	
	//第一题打印星号
	public static void drawnXing(){
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				
				System.out.print("*\t");
				
			}
			System.out.println();
		}

	}
	
	
	public static void drawXing2(){
		int n=5;
        for (int i = 1; i <= n; i++) {
        	for (int j = 0; j < n - i; j++) {
        		System.out.print(" ");
        	}
        	for (int k = 0; k < 2 * i - 1; k++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }

	}
	
	//杨辉三角形
	public static void printYanghui(){
	
		 //设置杨辉三角的行数
		  int num = 8;
		
		  //申请二维数组存放杨辉三角数值
		  int[][] yangHui = new int [num][];
		  for(int i = 0; i < yangHui.length; i ++)
		    yangHui[i] = new int[i + 1];
		
		  
		  //利用杨辉三角的计算公式，初始化数组
		  for(int i = 0; i < yangHui.length; i ++)
		    for(int j = 0; j < yangHui[i].length; j ++)
		    {
		      //每一行第一个数和最后一个数都为1
		      yangHui[i][0] = yangHui[i][i] = 1;
		
		      if(i > 1 && j > 0 && j < i)
		        //杨辉三角的值等于其上一层两个值之和
		        yangHui[i][j] = yangHui[i - 1][j] + yangHui[i -1][j -1];
		    }
		
		  
		  //遍历数组，以输出
		  for(int i = 0; i < yangHui.length; i ++)
		  {
		    for(int j = 0; j < (num - i ) / 2; j ++)
		      System.out.print("\t");
		    for(int j = 0; j < yangHui[i].length; j ++)
		      System.out.print(yangHui[i][j] + "\t");
		
		    System.out.println();
		  }
	}//printYanaghui
	
	
	
	static void whatsForDefault(){
		int count =0;
		for(;;){
			count++;
			System.out.println("看for循环中的条件判断语句默认值：");
			if(count>2){
				break;//跳出当前循环
			}
		}
		//输出结果说明：for()循环的默认值是：：：for(i=0;true;不做任何操作)
//		看for循环中的条件判断语句默认值：
//		看for循环中的条件判断语句默认值：
//		看for循环中的条件判断语句默认值：
	}
}//class



	
