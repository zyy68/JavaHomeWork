package com.��11��.������;
/**
 * �������յļ��ϴ洢����
 * */

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
//		����set����
		Set regNums=new HashSet();
//		��Ԫ�������Ԫ��
		regNums.add("v5230");
		regNums.add("x8934");
		regNums.add("L3423");
		regNums.add("R8934");
		regNums.add("Y3423");
//		���������Ԫ�صĸ���
		System.out.println("regNums��Ԫ�ظ���Ϊ��"+regNums.size());
		System.out.println(regNums);//��������е�Ԫ��
		
		boolean ok;
		ok=regNums.add("W9076");
		if(!ok){
			System.out.println("item is already set.");
			regNums.remove("W9076");
			
		}
		
		System.out.println("******");
		System.out.println("Number of items in set:"+regNums.size());
		System.out.println(regNums);
		
		
		regNums.add("Y3423");//���ڼ����ڲ��Ѿ�����Y3423���Ԫ�أ����Գ�������������ظ���Ԫ�ء�
		System.out.println(regNums);
	}
}
