/**
 *
 *MethodsExp5.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��13�� ����10:47:51
 *
 */
package com.��3��.demo;

/**����������
 * @author sylvia.zhao
 *
 */
public class MethodsExp5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isum;
		double dsum;
		isum=add(3, 4);
		System.out.println(isum);
		
		isum = add(23, 34, 45);
		System.out.println(isum);
		
		dsum = add(3.14, 8.13);
		System.out.println(isum);
		
	}
	
	
	//���������أ�����������һ���������б�һ��������ֵҲ����ͬ��
	static int add(int x,int y){
		return x+y;
	}
	static int add(int x,int y,int z){
		return x+y+z;
		
	}
	
	static double add(double x,double y){
		return x+y;
	}

}
