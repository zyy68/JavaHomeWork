/**
 *
 *Test2_1.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��6�� ����4:21:56
 *
 */
package com.section2;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *(1)��д������ʾ�û�����һ��С����Ȼ�����һ���������С�����������
 */
public class Test2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��С����");
		Double dNum = sc.nextDouble();
		Double dCeil = Math.ceil(dNum);
		Double dFloor = Math.floor(dNum);
		int nearNum = 0;
		
		//�жϷ���һ������Կ���

		Double dFloor2 = Math.floor(dNum+0.5);
		int result = dFloor2.intValue();
		System.out.println("����"+dNum+"�������ǣ�"+result);
		
//		if((dFloor+0.5)!=dFloor){
//			//��1.6 + 0.5 = 2.1    ��ʱdNum��Ȼ����2
//			nearNum = dFloor.intValue();
//		}else {
//			nearNum = dFloor.intValue();
//		}
		
		
		//�жϷ�������
		if((dCeil-dNum)<(dNum-dFloor)){
//			nearNum = (int) dCeil;//�﷨����
			nearNum = dCeil.intValue();//
			
		}else {
			nearNum = dFloor.intValue();
		}
		
		System.out.println("����"+dNum+"�������ǣ�"+nearNum);
		

	}

}
