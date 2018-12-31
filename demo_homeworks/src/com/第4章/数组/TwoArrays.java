/**
 *
 *TwoArrays.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月23日 上午10:30:36
 *
 */
package com.第4章.数组;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

/**
 * 二维数组的定义和实现
 * @author sylvia.zhao
 *
 */
public class TwoArrays {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//			二维与一位数组之间相互转换
		//oneTransTwo();
//		二维矩阵相乘
		//aChengBArr();		
		
		//矩阵翻转--作业3
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int reverseArr[];//声明一个空数组，用于存放arr数组逆序之后的元素
//		reverseArr = reverseArray(arr);
//		System.out.println("\n逆序存储之后的数组：\t");
//		for(int i:reverseArr){//增强后的for循环--(仅适用于对数组全部元素的查看)
//			System.out.print(i+" ");
//		}
		
		//求多边形的面积------作业（告诉定点的位置，）
		
		//书上的编程题（5）预定机票
		orderPlane();

		//书上的编程题（6）
/**
 * 使用二维数组存储一年中每个月最高气温和最低气温。该程序输出一年中极值气温的均值和最值。
 * 
 * */
		//定义二维数组变量，第一行存放每个月的最高气温，第二行存放每个月最低气温
		int tempreture[][] = {{9,-2},{8,-16},{10,8},{12,-4},{13,4},
				{20,14},{22,18},{25,14},{34,24},{38,25},
				{29,20},{23,13}};
		int tempreture2[][]={{9,8,10,12,13,20,22,25,34,38,29,23},{-2,-16,8,-4,4,14,18,14,24,25,20,13}};
//		getData()方法就是让用户从控制台自行输入 
//		averageTemp(tempreture2);
		
		
		

	}
	
//	二维数组和一维数组之间的转换
	static void oneTransTwo(){
		int a[][]={{2,4,7},{5,2,3},{6,4,1}};
		
		int c[] = new int[9];
		int d[][] = new int[3][3];
		int sum=0;
		for(int i=0;i<a.length*a[0].length;i++){
			sum+=a[i/3][i%3];
			c[i]=a[i/3][i%3];
			d[i/3][i%3]=c[i];
		}
		
		
		for(int j=0;j<9;j++){
			if(j%3==0)
				System.out.println();
			System.out.print(d[j/3][j%3]+" ");
		}
		
		
	}
	
//-----------------------------矩阵相乘a*b=c  ------------------------------	
	static void aChengBArr(){
	
		//矩阵相乘a*b=c  
		/***
		 * a1 a2 a3   e1 e2 e3   (a1*e1+a2*f1+a3*g1)  (a1*e2+a2*f2+a3*g2)  (a1*e3+a2*f3+a3*g3) 
		 * b1 b2 b3 * f1 f2 f3 = (b1*e1+b2*f1+b3*g1)  (b1*e2+b2*f2+b3*g2)  (b1*e3+b2*f3+b3*g3)
		 * c1 c2 c3   g1 g2 g3   ...
		 * */
		int arr1[][] = {{1,1,1},{1,1,1},{1,1,1}};
		int arr2[][]={{1,1,1},{1,1,1},{1,1,1}};
		int arr3[][] = new int[3][3];
		int sum=0;
		for(int i=0;i<3;i++){//用于控制第一个矩阵arr1的行		
			for(int j=0;j<3;j++){//a1 a2 a3//j,k用于控制二维数组的行和列===j可控制第二个数组arr2的列
				sum=0;//每确定一个元素的位置后要将sum清零
				for(int k=0;k<3;k++){//e1 f1 g1//k用于控制arr1的列，arr2的行
					sum+=arr1[i][k]*arr2[k][j];
				}
				arr3[i][j]=sum;//直接将得到的和放在新的二维数组中。
			}
		}
		//遍历二维数组
		for(int j=0;j<9;j++){
			if(j%3==0)
				System.out.println();
			System.out.print(arr3[j/3][j%3]+" ");
		}
		
		
	}

	
//	将数组元素逆序存储
	static int[] reverseArray(int[] arr){
		//有返回值的函数方法
		int tempArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			
			tempArr[i] = arr[arr.length-1-i];//把arr中最后一个数赋值给tempArr的第一个元素

		}
		//上面的步骤并未改变arr数组中原来的元素位置
		return tempArr;
	}
	//温度极值的平均值
	static void averageTemp(int[][] arr2){
		int averageHeight = 0;
		int averageLow =0;
		int indexHighi,indexHighj,indexLowi,indexLowj;
		indexHighi=indexHighj=indexLowi=indexLowj=0;
		int max,min;
		int temp=0;
		max=min=arr2[0][0];
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[0].length;j++){
				if(i==0){
					averageHeight+=arr2[0][j];
				}else {
					averageLow+=arr2[1][j];
				}
				if(max<arr2[i][j]){
					max = arr2[i][j];
					indexHighi=i;
					indexHighj=j;
				}
				if(min>arr2[i][j]){
					min = arr2[i][j];
					indexLowi=i;
					indexLowj=j;
				}
			}
			
		}
		//求均值
		averageHeight/=12;
		averageLow/=12;
		System.out.println("averageHeight="+averageHeight+"\taverageLow="+averageLow);
		
		System.out.println("The Highest Temp is "+arr2[indexHighi][indexHighj]+
				" indexHighTemp is ["+indexHighi+"]"+"["+indexHighj+
				"]\n"+"The Highest Temp is "+arr2[indexLowi][indexLowj]+
				" indexLowTemp is ["+indexLowi+"]"+"["+indexLowj+"]");
		
		
	}
	
	static void orderPlane(){
		int piaoArr[][] = new int[13][6];
		//头等舱
		int touArr[][] = new int[2][6];
		//经济舱
		int jingJiArr[][] = new int[11][6];
		int touLeave[] = new int[12];
		int jingLeave[] = new int[66];
		//用于唯一标记用户预定的座位id
		int indexTou=0;
		int indexJing=0;
		//用于界定余票张数
		int countTou=12;
		int countJing=11*6;
		
		//接受用户选择预定类型
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入订票种类编号（头等舱1号，经济舱2号，其他3号）：");
		while(true){
	//		给用户出票--预定结果
			//用户预定头等舱
			int num = scanner.nextInt();
			if(num==1){
				//判断还剩多少张机票，余票为0就跳系统
				if(countTou<1){
					break;
				}
				int select = (int) (Math.random()*12);
				while(touLeave[select]==1){
					select++;
					if(select>11){
						select=0;
					}
				}
				touLeave[select]=1;
				indexTou = select;
				countTou--;
				//直接将二维数组中被选中的下标所在元素值置为1
				
				touArr[select/6][select%6]=1;
				//遍历输出售票结果
				for(int i=0;i<2;i++){
					for(int j=0;j<6;j++){
						System.out.print(touArr[i][j]+"  ");
					}
					System.out.println();
				}
			}//if num==1
			else if (num==2) {
				System.out.println("选择经济舱。");
				
				//判断还剩多少张机票，余票为0就跳系统
				if(countJing<1){
					break;
				}
				int select = (int) (Math.random()*66);
				while(jingLeave[select]==1){
					select++;
					if(select>66){
						select=0;
					}
				}
				jingLeave[select]=1;
				indexJing = select;
				countJing--;
				//直接将二维数组中被选中的下标所在元素值置为1
				
				jingJiArr[select/6][select%6]=1;
				//遍历输出售票结果
//				System.out.println("    A  B  C  D  E  F");
				for(int i=0;i<11;i++){
					System.out.print("第"+(i+2)+"行：");
					for(int j=0;j<6;j++){
						System.out.print(jingJiArr[i][j]+"  ");
					}
					System.out.println();
				}
				
				
			}else {
				break;
			}
		}//while
		System.out.println("跳出预定机票系统！");
	}
	
	
	//未优化的代码
	static void selectTicket(int countTicket,int[] leaveArr,int indexTiclet,int[] ticketArr){
		//判断还剩多少张机票，余票为0就跳系统
		if(countTicket<1){
//			break;
		}
		int select = (int) (Math.random()*66);
		while(leaveArr[select]==1){
			select++;
			if(select>66){
				select=0;
			}
		}
		leaveArr[select]=1;
		indexTiclet = select;
		countTicket--;
		//直接将二维数组中被选中的下标所在元素值置为1
		
//		ticketArr[select/6][select%6]=1;
	}

}
