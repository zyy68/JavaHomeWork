/**
 *
 *ListDemo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��12��3�� ����2:40:59
 *
 */
package com.��11��.������;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

/**
 * @author sylvia.zhao
 *
 */
public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//11111		ArrayList��ʹ��
		ArrayList myList=new ArrayList();
		myList.add('q');
		myList.add("String,name");
		myList.add(new Integer(2018));
		myList.add(true);
		String[] strings={"I"," am ","a girl"};
		myList.add(strings);//����������׷�ӵ������б���
		
		System.out.println(myList);
		
		
//22222   vector��ʹ��
		Vector myVector=new Vector();
		myVector.add("����һֻС���");
		myVector.add(false);
		myVector.add('Q');
		int[] a={1,2,34,56,67};
		myVector.add(a);
		System.out.println(myVector);

	}

}

/**
 * [q, String,name, 2018, true, [Ljava.lang.String;@2a139a55]
  ������Ƕ��
  1��List���ղ�����Ⱥ�˳������
  2��list��Ԫ�ؿ��ظ�
  3��list�е�Ԫ�ؿ����ǲ�ͬ���͵�
  4��list��Ƕ���б�

 * */
