package com.第13章.线程;
/**
 * 使用join()方法调度
 * */
public class TestJoinThread {
	public static void main(String[] args) {
		Runner runner = new Runner();
		Thread thread = new Thread(runner);//创建线程
		thread.start();
		try {
			thread.join();//将子线程加入到主线程中，主线程被阻塞，直到子线程执行结束之后才能进行主线程
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("主线程被阻塞时出现错误："+e);
		}
		
	}
}
class Runner implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//实现接口方式的线程代码
		for(int i=0;i<6;i++){
			System.out.println("子线程:"+i);
		}
	}
}