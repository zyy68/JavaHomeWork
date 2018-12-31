/**
 *
 *IteratorExample.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��12��3�� ����12:40:47
 *
 */
package com.��11��.������;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author sylvia.zhao
 *
 */
public class IteratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��collection���͵�����
		Collection intList = new ArrayList();
		//��̬��ʼ��һ��һά����
		int[] values={9,11,-7,1,14,89,3,0};
		//
		//��һλ�������
		for(int i=0;i<values.length;i++){
			//��ֵ��ӵ����������������ȥ,Integer(values[i])---����д����ΪCollection
//			������ֻ�����ɶ��󣬲������ɻ����������͡�
			intList.add(new Integer(values[i]));
		}
		System.out.println("����֮ǰ��"+intList);
		
		//����һ��Interactor���͵ļ��϶���,.iterator---���ؼ��ϵĵ�����(�����кܶ෽��)
		Iterator myInterator = intList.iterator();
//		�жϼ������Ƿ���Ԫ��
		while(myInterator.hasNext()){
//			����Integer�������洢������ ��Ԫ��
			Integer element=(Integer)myInterator.next();
//			��Integer���͵�Ԫ��ת���ɻ�����������
			int value=element.intValue();
			//�Ի����������ͼ����ж�
//			������1~10�ڵ�Ԫ���Ƴ�
			if(value<1 || value>10){
				myInterator.remove();//intList.iterator().remove();//���õ������еķ���
			}
			System.out.println("intList����֮��"+intList);
		}//end while
//		System.out.println("intList����֮��"+intList);
		

	}

	
	
}
