/**
 *
 *ArrayTwo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��4�� ����4:53:49
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
	 * ��ά�������������3*3�ľ���ת��Խ����ϵ�ֵ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int a[][] = {{1,8,10,11},{34,2,12,45},{0,13,3,20},{14,35,47,4}};
		int len=a.length;
		//����ԭ����
		System.out.print("\nԭ����Ϊ��\n");
		for(int m=0;m<len;m++){
			for(int n=0;n<len;n++){
				System.out.print(a[m][n]+" ");
			}
			System.out.println();
		}
		
		
		//���Խ��߷�ת��0����0��--[3][3] [1][1]---[2][2]  [i][i]--[len-i][len-i]
		//ע�⣺��תֻ��Ҫ��תһ�뼴�ɣ����ܳ����м�ֵ�������������η�ת
		for(int i=0;i<len/2;i++){
			temp = a[i][i];
			a[i][i]=a[len-1-i][len-1-i];
			a[len-1-i][len-1-i]=temp;
			System.out.print("\nfnazhuan---"+a[i][i]+"--"+a[len-1-i][len-1-i]);
		}
		
		System.out.print("\n\n����һ�θ��Խ��߷�ת��Ϊ��\n");
		for(int m=0;m<len;m++){
			for(int n=0;n<len;n++){
				System.out.print(a[m][n]+" ");
			}
			System.out.println();
		}
		
		
		//���Խ��߽��з�ת [len-1][0]---[0][len-1]   [len-2][1]---[1][len-2]
		for(int j=0;j<len/2;j++){
			temp = a[len-1-j][j];
			a[len-1-j][j]=a[j][len-1-j];
			a[j][len-1-j]=temp;
		}
		
		System.out.print("\n\n�����ڶ������Խ��߷�ת��Ϊ��\n");
		for(int m=0;m<len;m++){
			for(int n=0;n<len;n++){
				System.out.print(a[m][n]+" ");
			}
			System.out.println();
		}
		
	}

}
