package com.第13章.线程;
/**
 *
 *ThreadStateDemo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月28日 上午10:32:29
 *
 */

/**课上老师创建的线程demo
 * @author sylvia.zhao
 *
 */
public class ThreadStateDemo extends Thread{
	private Thread thread;
	private String threadName;
	
	public ThreadStateDemo(String name) {
		// TODO Auto-generated constructor stub
		threadName = name;
		System.out.println("创建"+threadName);
	}
	
	public void run() {
		System.out.println("Running "+threadName);
		try {
			for(int i=100;i>0;i--){
				System.out.println("Thread "+threadName+"interrupted.");
				//让线程睡眠一会
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Thread "+threadName+"interrupted");
		}
		System.out.println("Thread "+thread+" exiting");
		
		
	}
	
	public void start() {
		System.out.println("Starting "+threadName);
		if(thread==null){
			thread=new Thread(this,threadName);//创建线程实例
			thread.start();//开启线程
		}
	}

}
