package com.第13章.线程;
/***
 * 实现Runnable接口创建多线程
 * 
 * 实现Runnable接口方式和继承Thread类方式的区别：
 * 1，实现Runnable接口方式避免了继承Thread类的局限性。
 * 2，在定义线程时，尽量多使用实现方式
 * 3，存储位置不同：（1）继承方式 线程代码放在thread类的子类中；
 *   （2）实现方式 线程代码存放在接口的子类中。
 * 
 * 通过实现Runnable接口创建多线程类的步骤为：
 * （1）定义类，实现Runnable接口；
 * （2）重写Runnable接口中的run方法，将线程要执行的代码放在方法中；
 * （3）通过Thread类建立线程对象，将Runnable接口的子类对象作为参数传递给Thread类的构造方法
 * （4）调用Thread类的start方法，启动线程。
 */
public class TestRunnable {
	public static void main(String[] args) {
//		（3）通过Thread类建立线程对象，将Runnable接口的子类对象作为参数传递给Thread类的构造方法
		ClassInterface t=new ClassInterface();//建立线程对象
		Thread thread = new Thread(t);//将t作为参数传递给Thread中有参的构造函数
//		（4）调用Thread类的start方法，启动线程。
		thread.start();
		
		
		//kuo zhan
		ClassInterface2 t2=new ClassInterface2();//能实现开启另一个线程（ClassInterface2.run）的运行
//		Thread thread2 = new Thread(t2);//创建另一个线程（ClassInterface2.run）
		Thread thread2 = new Thread(t);//创建上一个线程（ClassInterface.run）
		thread2.start();
		System.out.println("Main is running.");
	}
}
//(1)定义类，实现Runnable接口；
class ClassInterface implements Runnable{
	@Override//实现接口中的run方法，将要执行的线程代码放进来
//	（2）重写Runnable接口中的run方法，将线程要执行的代码放在方法中
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" is running.");
	}
}

//kuo zhan
class ClassInterface2 implements Runnable{
	@Override//实现接口中的run方法，将要执行的线程代码放进来
//	（2）重写Runnable接口中的run方法，将线程要执行的代码放在方法中
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" is running.");
	}
}
