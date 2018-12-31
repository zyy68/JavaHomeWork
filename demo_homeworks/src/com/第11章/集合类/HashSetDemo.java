package com.第11章.集合类;
/**
 * 汽车牌照的集合存储例子
 * */

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
//		创建set集合
		Set regNums=new HashSet();
//		向元组中添加元素
		regNums.add("v5230");
		regNums.add("x8934");
		regNums.add("L3423");
		regNums.add("R8934");
		regNums.add("Y3423");
//		输出集合中元素的个数
		System.out.println("regNums的元素个数为："+regNums.size());
		System.out.println(regNums);//输出集合中的元素
		
		boolean ok;
		ok=regNums.add("W9076");
		if(!ok){
			System.out.println("item is already set.");
			regNums.remove("W9076");
			
		}
		
		System.out.println("******");
		System.out.println("Number of items in set:"+regNums.size());
		System.out.println(regNums);
		
		
		regNums.add("Y3423");//由于集合内部已经有了Y3423这个元素，所以程序不允许再添加重复的元素。
		System.out.println(regNums);
	}
}
