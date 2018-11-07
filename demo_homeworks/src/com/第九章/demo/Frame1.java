/**
 *
 *Frame1.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月7日 上午10:17:25
 *
 */
package com.第九章.demo;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author sylvia.zhao
 *
 */
public class Frame1 {

	/**
	 * @param args
	 *
	 *创建一个GUI框架
	 */
	public static void main(String[] args) {
		//main函数中创建的框架不能被重用，因此要重新做修改，详见Frame2.java。
		// TODO Auto-generated method stub
		//创建一个框架
		JFrame jFrame = new JFrame();//实例化一个JFrame对象
		jFrame.setSize(400, 900);//设置框架的宽和高
		jFrame.setTitle("这是我的第一个GUI框架例子");//给框架设置标题
		
		
//		在框架中添加按钮组件
		JButton jButton = new JButton("确定");//实例化一个按钮
		jFrame.add(jButton);
		jFrame.setVisible(true);//设置框架是否显示（默认是隐藏的）注意:z这里要将
		
	}

}


