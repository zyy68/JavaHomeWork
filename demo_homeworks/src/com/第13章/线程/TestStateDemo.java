package com.��13��.�߳�;
/***
 * ʹ��sleep()�����ı��̵߳�״̬
 */
public class TestStateDemo extends Thread {
	Thread thread;
	
	public TestStateDemo() {
		thread=new Thread(this);
		System.out.println("����һ���̣߳�thread");
		thread.start();
	}
	public void run() {
		try {
			System.out.println("�߳�thread�������У�");
			System.out.println("�߳�˯��3��");
//			thread.sleep(3000);//��λ�Ǻ��� 1000ms=1s
			Thread.sleep(3000);
			System.out.println("�߳�thread��˯��3���Ӻ���������");
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("�̱߳��ж��ˡ�");
		}
	}
	public static void main(String[] args) {
		new TestStateDemo();
		System.out.println("Main is finishing");
	}
}

/***
 * ע�⣺������߳����н��������߳�ֻ�����в��֣��ܲ���������ȡ���������߳̽������Ǹ�˲�䣬���߳��ܹ����ж��١�
 */

