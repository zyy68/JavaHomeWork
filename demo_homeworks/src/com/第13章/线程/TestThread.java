package com.��13��.�߳�;
/**
 * �̳�Thread�ഴ�����߳�
 * */
public class TestThread extends Thread{
	public static void main(String[] args) {
		//���߳�
		//�����������߳�
		new ThreadClass().start();//���������������߳�
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
 * ��һ�����н����
 * Main Thread is running
   Thread-1 is running.
   Thread-0 is running.
   
   
       ��2�����н����
   Main Thread is running
   Thread-0 is running.
   Thread-1 is running.
   
   ԭ�������̵߳ĵ�����������ȵģ�����ÿ���������е��̶߳���һ������ÿ������˳����ͬ
   

 * /
 */