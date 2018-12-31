package com.第5章.demo;

class Outer {
	private int size=10;
	public class Inner{
		public void doStuff() {
			System.out.println(++size);
		}
	}
}
public class TestInner1{
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = new Outer().new Inner();//
//		outer.Inner inner = outer.new Inner();//这是什么原因？？？？？？？
		inner.doStuff();
		
	}
}
