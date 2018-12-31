/**
 *
 *IteratorExample.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月3日 下午12:40:47
 *
 */
package com.第11章.集合类;

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
		//创建一个collection类型的数组
		Collection intList = new ArrayList();
		//静态初始化一个一维数组
		int[] values={9,11,-7,1,14,89,3,0};
		//
		//对一位数组遍历
		for(int i=0;i<values.length;i++){
			//将值添加到声明的数组对象中去,Integer(values[i])---这样写是因为Collection
//			集合中只能容纳对象，不能容纳基本数据类型。
			intList.add(new Integer(values[i]));
		}
		System.out.println("迭代之前："+intList);
		
		//创建一个Interactor类型的集合对象,.iterator---返回集合的迭代器(里面有很多方法)
		Iterator myInterator = intList.iterator();
//		判断集合中是否还有元素
		while(myInterator.hasNext()){
//			定义Integer变量来存储集合中 的元素
			Integer element=(Integer)myInterator.next();
//			将Integer类型的元素转换成基本数据类型
			int value=element.intValue();
			//对基本数据类型加以判断
//			将不在1~10内的元素移除
			if(value<1 || value>10){
				myInterator.remove();//intList.iterator().remove();//调用迭代器中的方法
			}
			System.out.println("intList迭代之后："+intList);
		}//end while
//		System.out.println("intList迭代之后："+intList);
		

	}

	
	
}
