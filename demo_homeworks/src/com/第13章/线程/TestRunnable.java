package com.��13��.�߳�;
/***
 * ʵ��Runnable�ӿڴ������߳�
 * 
 * ʵ��Runnable�ӿڷ�ʽ�ͼ̳�Thread�෽ʽ������
 * 1��ʵ��Runnable�ӿڷ�ʽ�����˼̳�Thread��ľ����ԡ�
 * 2���ڶ����߳�ʱ��������ʹ��ʵ�ַ�ʽ
 * 3���洢λ�ò�ͬ����1���̳з�ʽ �̴߳������thread��������У�
 *   ��2��ʵ�ַ�ʽ �̴߳������ڽӿڵ������С�
 * 
 * ͨ��ʵ��Runnable�ӿڴ������߳���Ĳ���Ϊ��
 * ��1�������࣬ʵ��Runnable�ӿڣ�
 * ��2����дRunnable�ӿ��е�run���������߳�Ҫִ�еĴ�����ڷ����У�
 * ��3��ͨ��Thread�ཨ���̶߳��󣬽�Runnable�ӿڵ����������Ϊ�������ݸ�Thread��Ĺ��췽��
 * ��4������Thread���start�����������̡߳�
 */
public class TestRunnable {
	public static void main(String[] args) {
//		��3��ͨ��Thread�ཨ���̶߳��󣬽�Runnable�ӿڵ����������Ϊ�������ݸ�Thread��Ĺ��췽��
		ClassInterface t=new ClassInterface();//�����̶߳���
		Thread thread = new Thread(t);//��t��Ϊ�������ݸ�Thread���вεĹ��캯��
//		��4������Thread���start�����������̡߳�
		thread.start();
		
		
		//kuo zhan
		ClassInterface2 t2=new ClassInterface2();//��ʵ�ֿ�����һ���̣߳�ClassInterface2.run��������
//		Thread thread2 = new Thread(t2);//������һ���̣߳�ClassInterface2.run��
		Thread thread2 = new Thread(t);//������һ���̣߳�ClassInterface.run��
		thread2.start();
		System.out.println("Main is running.");
	}
}
//(1)�����࣬ʵ��Runnable�ӿڣ�
class ClassInterface implements Runnable{
	@Override//ʵ�ֽӿ��е�run��������Ҫִ�е��̴߳���Ž���
//	��2����дRunnable�ӿ��е�run���������߳�Ҫִ�еĴ�����ڷ�����
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" is running.");
	}
}

//kuo zhan
class ClassInterface2 implements Runnable{
	@Override//ʵ�ֽӿ��е�run��������Ҫִ�е��̴߳���Ž���
//	��2����дRunnable�ӿ��е�run���������߳�Ҫִ�еĴ�����ڷ�����
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" is running.");
	}
}
