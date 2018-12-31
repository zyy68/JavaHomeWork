/**
 *
 *ListDemo.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月3日 下午2:40:59
 *
 */
package com.第11章.集合类;

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
//11111		ArrayList的使用
		ArrayList myList=new ArrayList();
		myList.add('q');
		myList.add("String,name");
		myList.add(new Integer(2018));
		myList.add(true);
		String[] strings={"I"," am ","a girl"};
		myList.add(strings);//将数组数据追加到集合列表中
		
		System.out.println(myList);
		
		
//22222   vector的使用
		Vector myVector=new Vector();
		myVector.add("我是一只小青虫");
		myVector.add(false);
		myVector.add('Q');
		int[] a={1,2,34,56,67};
		myVector.add(a);
		System.out.println(myVector);

	}

}

/**
 * [q, String,name, 2018, true, [Ljava.lang.String;@2a139a55]
  函数可嵌套
  1，List按照插入的先后顺序排序
  2，list的元素可重复
  3，list中的元素可以是不同类型的
  4，list可嵌套列表

 * */
