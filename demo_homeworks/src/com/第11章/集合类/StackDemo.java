/**
 *
 *StackDemo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月3日 下午3:45:24
 *
 */
package com.第11章.集合类;

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
//		定义一个栈对象
		Stack myStack=new Stack();
		for(int i=0;i<months.length;i++)
			myStack.push(months[i]+"");
		System.out.println("Stack="+myStack);
			
		myStack.addElement("lastOne");
		 
		 //取下标是5的元素
		System.out.println("Element 5 is:"+myStack.elementAt(5));
		System.out.println("pop Element:");
//		 将Stack中的元素逐个清出
		while(!myStack.empty()){
		 	System.out.println(myStack.pop());
		}
			
		
	}

}
