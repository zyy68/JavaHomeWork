/**
 *Home_03_����������.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��12��27�� ����6:49:07
 */
package com.�ܸ�ϰ.�㷨���Ի���;

/**
 * @author sylvia.zhao
 *
 */
public class Home_03_���������� {

	//дһ��add������Ҫ��ʵ�ֲ�ͬ�������͵����ݽ��мӷ����㣬��ͬ�Ĳ����������мӷ�
	public static void main(String[] args) {
		int a,b,c,sum;
		a=b=c=8;
		sum=0;
		
	}
	//����������ֻ��ͨ�����ַ�ʽ��
	/**1���������б�ͬ��������������ͬ��
	 * 2�����������Ͳ�ͬ��һ�������������Ͳ���ͬ��
	 * */
	static int add(int x,int y){
		return x+y;
	}
	
	static int add(int x,int y,int z){
		return x+y+z;
	}
	static int add(Double x,int y){
		return (int)(x+y);
	}

	//error---���ﷵ��ֵ��ͬ�����������Ͳ����б��Լ��������Ͷ���ͬ����ʵ�ַ��������ء�
//	static double add(int x,int y){
//		return 3.0945;
//	}
	
	//���벻ͨ���ļ��������error����ʾ
	public static int plusFunc(int x,int y) {
//		int x;//error duplicate declare
//		int y;
		return x+y;
//		System.out.println("dfjsh");//error ����һ����Զִ�в����ķϻ����ұ��벻ͨ-=��p
		
	}
	
}
