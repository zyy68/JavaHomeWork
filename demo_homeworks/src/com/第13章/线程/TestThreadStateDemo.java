package com.��13��.�߳�;
/**����  ������ʦ�������߳�demo
 * */
import javax.rmi.CORBA.Tie;

public class TestThreadStateDemo {
	public static void main(String[] args) {
		ThreadStateDemo t1=new ThreadStateDemo("Thread-1");
		t1.start();//�����߳�1
//		t1.run();//�����߳�1
		ThreadStateDemo t2 = new ThreadStateDemo("Thread-2");
		t2.start();
//		t1.run();
	}
}
