/**
 *
 *Frame2.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��7�� ����10:44:32
 *
 */
package com.�ھ���.demo;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author sylvia.zhao
 *
 */
public class Frame2 extends JFrame{
	
	public  Frame2(){//�����޲εĹ��캯��
		JButton button = new JButton();
		this.add(button);
		this.setSize(300,300);
		this.setTitle("TestFrame");  
		
		
	}
	public static void main(String[]  args) {
		// TODO Auto-generated method stub
		Frame2 frame2=new Frame2();//���� 
		frame2.setVisible(true);//��ʾ���
		

	}

}
