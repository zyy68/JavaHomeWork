package com.��13��.�߳�;
/**
 *
 *ThreadStateDemo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��28�� ����10:32:29
 *
 */

/**������ʦ�������߳�demo
 * @author sylvia.zhao
 *
 */
public class ThreadStateDemo extends Thread{
	private Thread thread;
	private String threadName;
	
	public ThreadStateDemo(String name) {
		// TODO Auto-generated constructor stub
		threadName = name;
		System.out.println("����"+threadName);
	}
	
	public void run() {
		System.out.println("Running "+threadName);
		try {
			for(int i=100;i>0;i--){
				System.out.println("Thread "+threadName+"interrupted.");
				//���߳�˯��һ��
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
			thread=new Thread(this,threadName);//�����߳�ʵ��
			thread.start();//�����߳�
		}
	}

}
