/**
 *
 *Frame1.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��7�� ����10:17:25
 *
 */
package com.�ھ���.demo;

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
	 *����һ��GUI���
	 */
	public static void main(String[] args) {
		//main�����д����Ŀ�ܲ��ܱ����ã����Ҫ�������޸ģ����Frame2.java��
		// TODO Auto-generated method stub
		//����һ�����
		JFrame jFrame = new JFrame();//ʵ����һ��JFrame����
		jFrame.setSize(400, 900);//���ÿ�ܵĿ�͸�
		jFrame.setTitle("�����ҵĵ�һ��GUI�������");//��������ñ���
		
		
//		�ڿ������Ӱ�ť���
		JButton jButton = new JButton("ȷ��");//ʵ����һ����ť
		jFrame.add(jButton);
		jFrame.setVisible(true);//���ÿ���Ƿ���ʾ��Ĭ�������صģ�ע��:z����Ҫ��
		
	}

}


