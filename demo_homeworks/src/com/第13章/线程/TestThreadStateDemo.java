package com.第13章.线程;
/**测试  课上老师创建的线程demo
 * */
import javax.rmi.CORBA.Tie;

public class TestThreadStateDemo {
	public static void main(String[] args) {
		ThreadStateDemo t1=new ThreadStateDemo("Thread-1");
		t1.start();//启动线程1
//		t1.run();//运行线程1
		ThreadStateDemo t2 = new ThreadStateDemo("Thread-2");
		t2.start();
//		t1.run();
	}
}
