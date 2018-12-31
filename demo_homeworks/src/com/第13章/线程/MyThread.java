package com.��13��.�߳�;

public class MyThread implements Runnable{
	private Object flag;
	private String threadName;
	
	public MyThread(Object flag,String threadName) {
		// TODO Auto-generated constructor stub
		this.flag=flag;
		this.threadName=threadName;
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++){
				if(i==3){
					//������Դ������
					synchronized (this.flag) {
						System.out.println(this.threadName);
						this.flag.wait();
					}
				}
				System.out.println(this.threadName+i);
				
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
