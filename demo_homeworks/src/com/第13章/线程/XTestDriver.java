/**
 *X.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2019��1��4�� ����7:06:20
 */
package com.��13��.�߳�;

import cn.���ű�.������ϰ.Main;

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
		System.out.println("�������С�����");
	}
}
public class XTestDriver {
	public static void main(String[] args) {
		Thread thread = new Thread(new X());
		thread.start();
	}

}
