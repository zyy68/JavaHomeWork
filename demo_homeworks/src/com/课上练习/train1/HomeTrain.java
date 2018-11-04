/**
 *
 *HomeTrain.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月3日 下午2:29:49
 *
 */
package com.课上练习.train1;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @author sylvia.zhao
 * java课后习题剩下的题目
 */
public class HomeTrain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//第（2）题 打印正倒三角⭐图形
		printSanJiaoXing();
		
		//第（3）题 菱形图形
//		printLingTu();
//		LingTu();
		
//		第（5）题 输出对称三角形数字图形
//		printDuiChenSanJiao();
		
		
		
		//第（6）题 东方之门
//		printDongFangGate();
		
		//第（7）题 杨辉三角形
//		printYangHui();
		
//		第2题 101-500之间所有的奇数之和
//		jiSum();
		
//		第3题 100-200之间不能被3整除的数
//		printIsNotThree();
		
		//第4题 输入初值，输出该数之后100个不能被3整除的数；
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		inputNumFind3(num);
		
//		第5题 S=1+（1+2）+（1+2+3）+...+(1+2+...+n) 求s的值
//		Scanner scanner2 = new Scanner(System.in);
//		int num2 = scanner2.nextInt();
//		printNSum(num2);	
		
//		第7题 S=11*22*33*...*nn,求S不大于400000时的最大n
//		findN();
		
//		第9题 百鸡问题
//		resolveCharect();
		
		//第10题 ,统计一个班学生0-9,10-19,..90-99及100各分数段的人数.
//		countScort();
		
		//第11题，插入法升序排序
//		insertArray();
		
		//第12题，（归并排序） 将两个有序的数组归并成一个数组，且按照升序的方式排序
//		mergeArray();
	

	}
	
//	static void mergeArray(){
//		//归并排序
//		int a[] = {1,12,23,44,65,96};//6
//		int b[] = {12,23,24,25,46,57,57,78,79,100};
//		
//		int len=a.length+b.length;
//		int c[] = new int[len];
//		
//		int index=0;
//		for(int j=0;j<a.length;j++){
//			for(int k=0;k<b.length;k++){
//				if(a[j]<b[j]){
//					c[index]=a[j];
//					index++;
//				}else {
//					c[index]=b[k];
//					index++;
//				}
//			}
//		}
//	
//		
//		for(int v:c){
//			System.out.print(" "+v);
//		}
//		
//	}
//	
	static void insertArray(){
		//插入排序，先确定第一个数，然后确定含有两个数的排序位置，接下来再确定第三个
		int a[] = {12,3,4,56,76,90,6,7,76,45};//静态初始化一个数组
		int temp=0;
		for(int i:a){
			System.out.print(i+" ");
		}
		for(int i=1;i<a.length;i++){//依次选择要插入数组中的元素			
			for(int j=0;j<i;j++){//遍历前面的数组元素
				//控制待比较的数组元素
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}				
			}
		}
		
		for(int i:a){
			System.out.print("\n"+i+" ");
		}
		
	}
	
	static void countScort(){
		//第10题 ,统计一个班学生0-9,10-19,..90-99及100各分数段的人数.	static void countScort(){
		int scortArray[]={12,5,45,23,35,90,89,76,57,65,100,100,12,5,45,23,3,4,6,76,57};
		int countScortArr[] = new int[11];
		int value=0;
		
		//动态给数组赋值，元素为0
		for(int i=0;i<11;i++){
			countScortArr[i]=0;
		}
		//遍历数组，按照各个分数段的成绩进行计数统计
		for(int i:scortArray){
			value = i/10;
			switch (value) {
			case 0:
				countScortArr[0]++;
				break;
			case 1:
				countScortArr[1]++;
				break;
			case 2:
				countScortArr[2]++;
				break;
			case 3:
				countScortArr[3]++;
				break;
			case 4:
				countScortArr[4]++;
				break;
			case 5:
				countScortArr[5]++;
				break;
			case 6:
				countScortArr[6]++;
				break;
			case 7:
				countScortArr[7]++;
				break;
			case 8:
				countScortArr[8]++;
				break;
			case 9:
				countScortArr[9]++;
				break;

			default:
				countScortArr[10]++;
				break;
			}
		}
		
		//各分数段成绩的个数分别为：
		System.out.println("\n\n各分数段成绩的个数分别为：");
		for(int v:countScortArr){
			System.out.print(v+" ");
		}
		System.out.print("\n共有"+scortArray.length+"个学生。\n");
	}
	
//	第9题 百鸡问题
	static void resolveCharect(){
		System.out.println("第9题 百鸡问题");
		int gong=5,mu=3,xiao=1/3;//价格
		int gongNum=0,muNum=0,xiaoNum=0;//个数
		
//		gongNum+muNum+xiaoNum
		for(int i=1;i<20;i++){//公鸡数量
			for(int j=0;j<34;j++){//母鸡数量
				for(int k=0;k<100;k++){//小鸡组数（3个一组是一钱）
					if(i*5+j*3+k==100 && i+j+3*k==100){
						System.out.println("\n\n百钱买百鸡\n其中鸡翁："+i+"只；\n鸡母:"+j+"只；\n鸡雏:"+3*k+"只。");
					}
				}
			}
			
		}
	}
	
	static void printSanJiaoXing(){
		//第（2）题 绘制正倒三角形图形
		System.out.println("\n第（2）题 绘制正倒三角形图形");
		
		for(int i =1;i<=9;i+=2){//控制行数--步长为2
			//首行空格的输出
			for(int k=3;k<=i;k+=2){//第一行不缩进
				System.out.print(" ");
			}
			
			for(int j=1;j<=10;j++){//循环输出每行的*号
				System.out.print("*");
				//空格前面打印的数量 j = 10 - 行数
				if(j==(10-i)){
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		System.out.println("\n\n");
				

		
		/**
		 * 老孟的方法
		for(int i=1;i<=5;i++){//控制行数
			for(int k=2;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=10;j++){
				
				System.out.print("*");
				
			}
			System.out.println();
		}

		*/
	}
	
	static void printLingTu(){
		System.out.println("第（3）题 菱形图形");
		int p=1;
		int count=5;
		for(int i=1;i<=5;i++){
			
			for(int j=5-i;j>=1;j--){
					System.out.print(" ");
				}
			 
			System.out.print("*");
			if(i>1){
				
				for(int q=1;q<=p;q++){
					System.out.print(" ");
				}
				p+=2;

				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		for(int m=1;m<5;m++){
			for(int n=5-m;n<=4;n++){
				System.out.print(" ");
			}
			
			System.out.print("*");
			
				
			if(m<4){
				
				for(int q=1;q<=count;q++){
					System.out.print(" ");
				}
				count-=2;

				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		
	}
	
	static void LingTu(int layer){
		//
	
//		int layer = 5;
		for(int n=1; n<=layer;n++ ){
			for(int j=1;j<=(layer-n);j++){
			System.out.print(" ");
			}
			for(int j=1;j<=(2*n-1);j++){
				if(j==1|| j==(2*n-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int n=1; n<=(layer-1);n++){
			for(int j=1;j<=n;j++){
			System.out.print(" ");
			}
			for(int j=1;j<=(2*(layer-n)-1);j++){
				if(j==1|| j==(2*(layer-n)-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
				
		
		
		/**
		 *      *
		 *	   *
		 *    *
		 * */
//		for(int i = 1;i<=5;i++){//控制上半段
//			for(int j=1;j<=5;j++){//输出上面的*号
//				if(j+i==6)
//					System.out.print("*");
//				System.out.print(" ");
//				
//			}
//			System.out.println();
//		}
//		
	}
	
	static void printDongFangGate(){
		//第（6）题  东方之门
			System.out.println("第（6）题 东方之门");
			int p=1;
			for(int i=1;i<=6;i++){
				
				for(int j=6-i;j>=1;j--){
						System.out.print(" ");
					}
				
//				for(int k=1;k<=9;k++){
//					System.out.print("*");
//				}
				System.out.print("*********");
				
				if(i==1){
//					for(int k=1;k<=8;k++){//原16个
//						System.out.print("*");
//					}
					System.out.print("********");
				}else {
					
					for(int q=1;q<=p;q++){
						System.out.print(" ");
					}
					p+=2;
	
					System.out.print("*********");
//					for(int k=1;k<=9;k++){
//						System.out.print("*");
//					}
				}
				
				System.out.println();
				
			}
		}
	static void printDuiChenSanJiao(){
		System.out.println("第（5）题 回文三角形");
		for(int i=1;i<=6;i++){
			for(int k=1;k<6-i;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<i;j++){
				System.out.print(j);
			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	//杨辉三角形
	static void printYangHui(){//------------------------------------
		//数组做
		System.out.println("第（7）题 杨辉三角形");
		System.out.println("    1");
		for(int i=1;i<=4;i++){
//			if(i==1){//如果是第二行的1 1直接放值
//				
//			}else {
				for(int j=1;j<5;j++){
					if(i==1){
						System.out.print("   1 1");
					}
				}
//			}
			
		}
	}
	
	static void jiSum(){
		System.out.println("第2题 101-500之间所有的奇数之和");
		int sum=0;
		for(int i=101;i<=500;i++){
			 if(i%2==0)
				 continue;
			 sum+=i;
//			 System.out.print(i+" ");
		}
		System.out.print(sum);
	}

//	100-200之间不能被3整除的数字
	static void printIsNotThree(){
		System.out.println("第3题 100-200之间不能被3整除的数字" );
		System.out.println("100-200之间不能被3整除的有");
		int count =0;
		for(int i=100;i<=200;i++){
			if(i%3!=0){
				System.out.print(i+" ");
				count++;
				if(count%5==0){
					System.out.println();
				}
			}
		}
	}

	static void printNSum(int num){
		System.out.println("第5题 S=1+（1+2）+（1+2+3）+...+(1+2+...+n) 求s的值");
//		num = 4;
		int sum=0;
		int temp=0;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				temp+=j;
//				System.out.println("#"+temp);
			}
		}
		System.out.println(temp);
	}

	
	static void inputNumFind3(int num){
		System.out.println("第四题 输入初值，输出该数之后100个不能被3整除的数；");
		int count =0;
		while(count<=100){
			
			if(num%3!=0){
				System.out.print(num+" ");
				count++;
				if(count%5==0){
					System.out.println();
				}
			}
			num++;
			
		}
		
	}


	static void findN(){
		System.out.println("第7题 S=11*22*33*...*nn,求S不大于400000时的最大n");
		int num = 1,sum=1;
		while(sum<=400000){
			num++;
			sum*=Math.pow(num, num);
			
		}
		System.out.print(--num);
	}
	
	
}

