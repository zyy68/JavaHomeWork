/**
 *
 *TwoArray.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��11��4�� ����2:37:57
 *
 */
package com.��4��.����;

/**
 * @author sylvia.zhao
 *
 */
public class TwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrOne[] = new int[8];
		int arrTwo[] = new int[8];
		
		System.out.print("arrOne:");
		//������oneȫ����ʼ��Ϊ100
		for(int i=0;i<arrOne.length;i++){
			arrOne[i] ;= 100
			System.out.print(arrOne[i]+" ");
		}
		
		System.out.print("\narrTwo:");
		//������oneȫ����ʼ��Ϊ100
		for(int i=0;i<arrTwo.length;i++){
			System.out.print(arrTwo[i]+" ");
		}
		
		//�� arrOne��ֵ��arrTwo
		arrTwo = arrOne;
		//��arrTwo�ĵ�����Ԫ�ظĳ�520
		arrTwo[2] = 520;//����������Ǵ�0��ʼ��
		//���������������
		System.out.println("\n\n\narrOne:");
		for(int j=0;j<arrOne.length;j++){
			System.out.print(arrOne[j]+"  ");
		}
		
		System.out.println("\narrTwo:");
		for(int j=0;j<arrTwo.length;j++){
			System.out.print(arrTwo[j]+"  ");
		}
		//arrOne��arrTwo���һ����ԭ���ǣ�arrOne�������׵�ַ��ֵ����arrTwo,����������ָ��ͬһ��λ�ã�һ���ı䣬�������ı�

	}

}
