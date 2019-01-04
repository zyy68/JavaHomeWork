/**
 *X.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2019年1月4日 下午7:06:20
 */
package com.第13章.线程;

import cn.蓝桥杯.入门练习.Main;

/**
 * @author sylvia.zhao
 *
 */
class X extends Thread implements Runnable{
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		System.out.println("正在运行。。。");
	}
}
public class XTestDriver {
	public static void main(String[] args) {
		Thread thread = new Thread(new X());
		thread.start();
	}

}
