package com.��3��.demo;
/**1111������״̬��
 *  step into����������
 *  step over ���������壬������������
 *  
 *  
 * */

public class TiaoShiDemo {
	public static void main(String[] args) {
		int a=2;
		int b=9;
		int sum=plusFunc(a, b);
		System.out.println("a+b="+sum);
		
		
		TiaoShiDemo tiaoShiDemo=new TiaoShiDemo();
		int sum2=tiaoShiDemo.plusFunc2(a, b);
		System.out.println(sum2);
	}
	public static int plusFunc(int x,int y) {
//		int x;//duplicate declare
//		int y;
		return x+y;
//		System.out.println("dfjsh");//error ����һ����Զִ�в����ķϻ����ұ��벻ͨ-=��p
		
	}
	public int plusFunc2(int s,int d){
		return s+d;
	}
}
