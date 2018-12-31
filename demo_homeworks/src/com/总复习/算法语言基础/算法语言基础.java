package com.总复习.算法语言基础;

import java.util.Scanner;

public class 算法语言基础 {
	
	
	public static void main(String[] args) {
		
		
//		Scanner scanner = new Scanner(System.in);
	
//		System.out.println(Integer.parseInt(args[0]));
		int a[] = new int[3];
		a[1]=3;
		int b[] = a;
		b[1]=7;
		System.out.println(a==b ? true : false);
		
		/**
*【程序	1】题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
		 * */
//		fun1_InsertArrary();
		
		
		
/**+【程序2】题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？*/
//		String str1 = fun2_xiaoQiu(100.0,10);
//		System.out.println(str1);
		
		
		/**
* 【程序3】题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。

		 * */
//		1 2 3 4 5 6 7 8 9 10
//		 1 2   4 5   7 8   10
//		 1     4 5     8   10
//		       4 5         10
//	           4          10
//		       4    
		
		 	Scanner s = new Scanner(System.in);
	        System.out.print("请输入排成一圈的人数：");
//	        int n = s.nextInt();
//	        fun3_leftMember(n);


		
		/*-------------------以前的思路--------------------------------------------
		//假设10个人围城一个圈，进行报数
		//数组的方法，将去掉的号标识为1，其他初始化为0，最后剩下的就是留下的最后一人
//		int a[] = new int[10];
		int countIndex=0;//计算数到第3个人的数
		//遍历历数组
//		for(int i=0;i<10;i++){
//			
//			//遍历历数组
//			if(i%3==0){
//				a[i] = 1;
//			}
//			
//			//
//		}
//		for(int i=0;i<10;i++){
//			if(i%3==0){
//				a[i]=1;
//			}
//			if(i>=10){
//				i=0;
//			}
//			if(a[i]==0){
//				if(i%3==0){
//					a[i]=1;
//				}
//				i++;	
//			}
//			
//		}
//		for (int i : a) {
//			System.out.println(i);
//		}
		-------------------------------------------------*/
		
		
/**+【程序4】题目：写一个程序,将一个3*3的整型矩阵转置.//行变成列 ， 列变成行*/
		//3*3矩阵
		/**
		 * 123 
		 * 123 
		 * 123 
		 * 
		 * 111
		 * 
		 * **/
		
		//遍历二维数组
//		int juZhen[][] = {{1,2,3},{1,2,3},{1,2,3}};
//		
//		for(int j=0;j<9;j++){
//			if(j%3==0)
//			System.out.println();
//			System.out.print((fun4_zhuanZhi(juZhen))[j/3][j%3]+" ");
//		}
//		

		
		/**
 *+【程序5】题目：编写一方法,用来判断一个一元二次方程 aX*X+b*X+c=0 是否有实根。方法的参数是该方程的系数（float型或double型），有实根返回1，否则返回0。
		 * b*b - 4ac =0   唯一一个根；     b*b - 4ac >0   两个根；      b*b - 4ac <0  无根
		 * */
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入a:");
//		double a = scanner.nextDouble();
//		System.out.println("请输入b:");
//		double b = scanner.nextDouble();
//		System.out.println("请输入c:");
//		double c = scanner.nextDouble();
//		System.out.println(fun5_fangChe(a, b, c));
		
		
		
		
/**+【程序6】题目：编写一个方法void fun(string s,int pp[])，统计在s字符串中’a’到’z’26个字母各自出现的次数，并依次放在pp数组中。 
	例如，当输入字符串：abcdefgabcdeabc后，程序的输出结果应该是： 
	3 3 3 2 2 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 */
//		int temp6[] = fun6_countChar("abcdefgabcdeabc");
//		for(int j=0;j<temp6.length;j++){
//			System.out.print(temp6[j]+"  ");
//		}
	}
	
	static void fun3_leftMember(int n){
		boolean[] arr = new boolean[n];
		 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        } // 数组赋值都是true
 
        int leftCount = n;
        int countNum = 0;
        int index = 0;
        while (leftCount > 1) {
            if (arr[index] == true) {
                countNum++;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    leftCount--;
                }
            }
            index++;
            if (index == n) {
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                System.out.println("原排在第" + (i + 1) + "位的人留下了。");
            }
        }
	}
	
	static int[] fun6_countChar(String inputStr){
		//初始化数组为0
				int countChar[] = new int[26];
				char ziMu[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
						'u','v','w','x','y','z'};
//				String str = "abcdefgabcdeabc";

				for(int i=0;i<inputStr.length();i++){
					
					for(int j=0;j<26;j++){
						if( inputStr.charAt(i) == ziMu[j]){
							countChar[j]+=1;
							continue;
						}
					}
					
				}
				return countChar;
	}
	
	static String fun5_fangChe(double a,double b,double c){
		
		double det = b*b-4*a*c;
		String str1="";
		if(det<0){
			str1 = "该一元二次方程无实根。";
		}else if(det==0){
			str1 ="该一元二次方程有且只有一个相等的实根。";
		}else {
			str1 ="该一元二次方程有两个不同的实根。";
		}
		return str1;
	}
	
	static int[][] fun4_zhuanZhi(int[][] JuZhen){
		int juZhen[][] = {{1,2,3},{1,2,3},{1,2,3}};
		for(int i=0;i<3;i++){
			for(int j=i;j<3;j++){
				int temp = juZhen[i][j];
				juZhen[i][j] = juZhen[j][i];
				juZhen[j][i] = temp;
			}
		}
		
		return juZhen;
	}
		
		
		
	public static String fun2_xiaoQiu(Double startH,int countTan){
//		double startH = 100.0;
//		int countTan = 10;
		double sumS=0,nextH=0;
		for(int i=1;i<countTan+1;i++){
			nextH = startH/2;
			sumS+=(startH+nextH);
			startH = nextH;
		}
		
		return  "达到最高点时，小球经过的路程长为："+sumS+"米\n求弹起的高度为："+nextH+"米";
		
	}
	

	
	static void fun1_InsertArrary(){
		int a[] = new int [5];
		Scanner src=new Scanner(System.in);
		int temp=0;
		for (int i=0;i<a.length-1;i++) {
			a[i]=(int)(Math.random()*10+1);
		}
		for(int j=0;j<a.length-2;j++) {
			for(int k=0;k<a.length-2-j;k++) {
				if(a[k]>a[k+1]) {
					temp = a[k];
					a[k] = a[k+1];
					a[k+1] = temp;
				}
			}
		}
		for(int m:a) {
			System.out.print(m + " ");
		}
		System.out.println();
		 System.out.println("请输入一个数：");
		 a[4] = src.nextInt();
		 for(int n=0;n<a.length-1;n++) {
			 for(int z=0;z<a.length-n-1;z++) {
				 if(a[z]>a[z+1]) {
					 temp = a[z];
					 a[z] = a[z+1];
					 a[z+1] = temp;
				 }
			 }
		 }
		 System.out.println("排序后：");
		 for(int f:a) {
				System.out.print(f + " ");
		 }
	}
}










