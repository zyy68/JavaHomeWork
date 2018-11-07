/**
 *
 *Frame2.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年11月7日 上午10:44:32
 *
 */
package com.第九章.demo;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author sylvia.zhao
 *
 */
public class Frame2 extends JFrame{
	
	public  Frame2(){//定义无参的构造函数
		JButton button = new JButton();
		this.add(button);
		this.setSize(300,300);
		this.setTitle("TestFrame");  
		
		
	}
	public static void main(String[]  args) {
		// TODO Auto-generated method stub
		Frame2 frame2=new Frame2();//测试 
		frame2.setVisible(true);//显示框架
		

	}

}
