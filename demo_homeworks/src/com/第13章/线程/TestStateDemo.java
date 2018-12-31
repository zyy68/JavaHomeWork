package com.第13章.线程;
/***
 * 使用sleep()方法改变线程的状态
 */
public class TestStateDemo extends Thread {
	Thread thread;
	
	public TestStateDemo() {
		thread=new Thread(this);
		System.out.println("创建一个线程：thread");
		thread.start();
	}
	public void run() {
		try {
			System.out.println("线程thread正在运行！");
			System.out.println("线程睡眠3秒");
//			thread.sleep(3000);//单位是毫秒 1000ms=1s
			Thread.sleep(3000);
			System.out.println("线程thread在睡眠3秒钟后重新运行");
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("线程被中断了。");
		}
	}
	public static void main(String[] args) {
		new TestStateDemo();
		System.out.println("Main is finishing");
	}
}

/***
 * 注意：如果主线成运行结束，子线程只能运行部分，能不能运行完取决于在主线程结束的那个瞬间，子线程能够运行多少。
 */

