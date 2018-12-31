package com.第3章.demo;
/**1111，调试状态：
 *  step into进到函数体
 *  step over 不仅函数体，继续向下运行
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
//		System.out.println("dfjsh");//error 这是一句永远执行不到的废话，且编译不通-=】p
		
	}
	public int plusFunc2(int s,int d){
		return s+d;
	}
}
