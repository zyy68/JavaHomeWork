package com.第11章.集合类;

import java.util.HashMap;
import java.util.Map;

/**HashMap管理网络名和密码
 * */
public class HashMapDemo {
	public static void main(String[] args) {
//		实例化类HashMap对象 类型为Map
		Map<String, String> users=new HashMap<String,String>();
		
		users.put("Marry", "monkey");
		users.put("Jenny", "network");
		users.put("Sussan", "network");
//		输出集合中元素个数和集合中的元素
		System.out.println("Number of items in Map:"+users.size());
		System.out.println(users);
		
//		检查用户Tom(key关键字)是否被占用，若被使用则删除旧的再添加
		if(users.containsKey("Tom")){
				users.remove("Tom");
		}
		users.put("Tom", "banner");
		System.out.println("*****************");
		System.out.println("Number of item in Map:"+users.size());
		System.out.println(users);
		
		System.out.println("users.containsKey('Tom') is :5"+users.containsKey("Tom"));
		//-拓展：users.containsKey("Tom");检查key为Tom的值value是否存在
		
		
	}
}
