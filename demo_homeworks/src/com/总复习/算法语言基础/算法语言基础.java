package com.�ܸ�ϰ.�㷨���Ի���;

import java.util.Scanner;

public class �㷨���Ի��� {
	
	
	public static void main(String[] args) {
		
		
//		Scanner scanner = new Scanner(System.in);
	
//		System.out.println(Integer.parseInt(args[0]));
		int a[] = new int[3];
		a[1]=3;
		int b[] = a;
		b[1]=7;
		System.out.println(a==b ? true : false);
		
		/**
*������	1����Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ�������������
		 * */
//		fun1_InsertArrary();
		
		
		
/**+������2����Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�*/
//		String str1 = fun2_xiaoQiu(100.0,10);
//		System.out.println(str1);
		
		
		/**
* ������3����Ŀ����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��

		 * */
//		1 2 3 4 5 6 7 8 9 10
//		 1 2   4 5   7 8   10
//		 1     4 5     8   10
//		       4 5         10
//	           4          10
//		       4    
		
		 	Scanner s = new Scanner(System.in);
	        System.out.print("�������ų�һȦ��������");
//	        int n = s.nextInt();
//	        fun3_leftMember(n);


		
		/*-------------------��ǰ��˼·--------------------------------------------
		//����10����Χ��һ��Ȧ�����б���
		//����ķ�������ȥ���ĺű�ʶΪ1��������ʼ��Ϊ0�����ʣ�µľ������µ����һ��
//		int a[] = new int[10];
		int countIndex=0;//����������3���˵���
		//����������
//		for(int i=0;i<10;i++){
//			
//			//����������
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
		
		
/**+������4����Ŀ��дһ������,��һ��3*3�����;���ת��.//�б���� �� �б����*/
		//3*3����
		/**
		 * 123 
		 * 123 
		 * 123 
		 * 
		 * 111
		 * 
		 * **/
		
		//������ά����
//		int juZhen[][] = {{1,2,3},{1,2,3},{1,2,3}};
//		
//		for(int j=0;j<9;j++){
//			if(j%3==0)
//			System.out.println();
//			System.out.print((fun4_zhuanZhi(juZhen))[j/3][j%3]+" ");
//		}
//		

		
		/**
 *+������5����Ŀ����дһ����,�����ж�һ��һԪ���η��� aX*X+b*X+c=0 �Ƿ���ʵ���������Ĳ����Ǹ÷��̵�ϵ����float�ͻ�double�ͣ�����ʵ������1�����򷵻�0��
		 * b*b - 4ac =0   Ψһһ������     b*b - 4ac >0   ��������      b*b - 4ac <0  �޸�
		 * */
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("������a:");
//		double a = scanner.nextDouble();
//		System.out.println("������b:");
//		double b = scanner.nextDouble();
//		System.out.println("������c:");
//		double c = scanner.nextDouble();
//		System.out.println(fun5_fangChe(a, b, c));
		
		
		
		
/**+������6����Ŀ����дһ������void fun(string s,int pp[])��ͳ����s�ַ����С�a������z��26����ĸ���Գ��ֵĴ����������η���pp�����С� 
	���磬�������ַ�����abcdefgabcdeabc�󣬳����������Ӧ���ǣ� 
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
        } // ���鸳ֵ����true
 
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
                System.out.println("ԭ���ڵ�" + (i + 1) + "λ���������ˡ�");
            }
        }
	}
	
	static int[] fun6_countChar(String inputStr){
		//��ʼ������Ϊ0
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
			str1 = "��һԪ���η�����ʵ����";
		}else if(det==0){
			str1 ="��һԪ���η�������ֻ��һ����ȵ�ʵ����";
		}else {
			str1 ="��һԪ���η�����������ͬ��ʵ����";
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
		
		return  "�ﵽ��ߵ�ʱ��С�򾭹���·�̳�Ϊ��"+sumS+"��\n����ĸ߶�Ϊ��"+nextH+"��";
		
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
		 System.out.println("������һ������");
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
		 System.out.println("�����");
		 for(int f:a) {
				System.out.print(f + " ");
		 }
	}
}










