package com.��11��.������;

import java.util.HashMap;
import java.util.Map;

/**HashMap����������������
 * */
public class HashMapDemo {
	public static void main(String[] args) {
//		ʵ������HashMap���� ����ΪMap
		Map<String, String> users=new HashMap<String,String>();
		
		users.put("Marry", "monkey");
		users.put("Jenny", "network");
		users.put("Sussan", "network");
//		���������Ԫ�ظ����ͼ����е�Ԫ��
		System.out.println("Number of items in Map:"+users.size());
		System.out.println(users);
		
//		����û�Tom(key�ؼ���)�Ƿ�ռ�ã�����ʹ����ɾ���ɵ������
		if(users.containsKey("Tom")){
				users.remove("Tom");
		}
		users.put("Tom", "banner");
		System.out.println("*****************");
		System.out.println("Number of item in Map:"+users.size());
		System.out.println(users);
		
		System.out.println("users.containsKey('Tom') is :5"+users.containsKey("Tom"));
		//-��չ��users.containsKey("Tom");���keyΪTom��ֵvalue�Ƿ����
		
		
	}
}
