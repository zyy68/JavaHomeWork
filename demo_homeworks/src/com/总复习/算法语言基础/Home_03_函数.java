/**
 *Home_03_����.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��12��27�� ����6:23:34
 */
package com.�ܸ�ϰ.�㷨���Ի���;

/**
 * @author sylvia.zhao
 *
 */
public class Home_03_���� {

	public static void main(String[] args) {
		
//1		�ж����귽����
		System.out.println(fun1_isYear(2018));
		
//2		쳲���������
		int n=9;
		System.out.println(fun2_fiBo(9));
		
//3		�ݹ�ķ�ʽ����  ��׳�
		long ji = fun3_jiCheng(n);
		System.out.println(ji);
		
//4		Բ���
		System.out.println(fun4_Area(5.0f));
		

	}
 //	4��һ��100�겻��400������
	static	boolean fun1_isYear(int y){
		if (y%4 == 0 && y%100 != 0 || y%400==0){
			return true;
		}else {
			return false;
		}
		
	}
	
	
//--------------------�ݹ����--------------------
//	쳲���������

	static  int fun2_fiBo(int n){
		if(n==0 || n==1){
			return n;
		}else {
			return fun2_fiBo(n-1)+fun2_fiBo(n-2);// 1 1 2 3 5---�������ֵ��ǰ������֮�ͣ��ҵ�һλ�͵ڶ�λ����1��
			
		}
	}
	
	//�ݹ�ķ�ʽ����  ��׳�
	static long  fun3_jiCheng(int n){
		//�ݹ�ͷ������ѭ�����������ٽ�ֵ����Сֵ��
		if(n==1){
			return 1;
		}else {
			//�ݹ���
			return n*fun3_jiCheng(n-1);
		}
	}

	
	//4		Բ���
	static float fun4_Area(float r){
		float area = 0.0f;
		area = (float) (Math.PI*r*r);
		return area;
	}

}
