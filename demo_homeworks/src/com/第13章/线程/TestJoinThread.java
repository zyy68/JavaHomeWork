package com.��13��.�߳�;
/**
 * ʹ��join()��������
 * */
public class TestJoinThread {
	public static void main(String[] args) {
		Runner runner = new Runner();
		Thread thread = new Thread(runner);//�����߳�
		thread.start();
		try {
			thread.join();//�����̼߳��뵽���߳��У����̱߳�������ֱ�����߳�ִ�н���֮����ܽ������߳�
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("���̱߳�����ʱ���ִ���"+e);
		}
		
	}
}
class Runner implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//ʵ�ֽӿڷ�ʽ���̴߳���
		for(int i=0;i<6;i++){
			System.out.println("���߳�:"+i);
		}
	}
}