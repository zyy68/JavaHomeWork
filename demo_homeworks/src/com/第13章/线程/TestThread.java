package com.第13章.线程;
/**
 * 继承Thread类创建新线程
 * */
public class TestThread extends Thread{
	public static void main(String[] args) {
		//主线程
		//开启两个子线程
		new ThreadClass().start();//创建匿名对象开启线程
		new ThreadClass().start();
		System.out.println("Main Thread is running");
	}
}

class ThreadClass extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running.");
	}
}

/***
 * 第一次运行结果：
 * Main Thread is running
   Thread-1 is running.
   Thread-0 is running.
   
   
       第2次运行结果：
   Main Thread is running
   Thread-0 is running.
   Thread-1 is running.
   
   原因：由于线程的调度是随机调度的，所以每次启动运行的线程都不一样，即每次启动顺序不相同
   

 * /
 */