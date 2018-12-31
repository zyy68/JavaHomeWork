/**
 *
 *StackDemo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��12��3�� ����3:45:24
 *
 */
package com.��11��.������;

import java.util.Stack;

/**
 * @author sylvia.zhao
 *
 */
public class StackDemo {

	static String[] months={"January","February","March",
			"April","May","June","July","August","September",
			"October","November","December"};
	
	
	public static void main(String[] args) {
//		����һ��ջ����
		Stack myStack=new Stack();
		for(int i=0;i<months.length;i++)
			myStack.push(months[i]+"");
		System.out.println("Stack="+myStack);
			
		myStack.addElement("lastOne");
		 
		 //ȡ�±���5��Ԫ��
		System.out.println("Element 5 is:"+myStack.elementAt(5));
		System.out.println("pop Element:");
//		 ��Stack�е�Ԫ��������
		while(!myStack.empty()){
		 	System.out.println(myStack.pop());
		}
			
		
	}

}
