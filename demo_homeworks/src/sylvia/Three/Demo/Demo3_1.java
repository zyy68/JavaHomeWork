package sylvia.Three.Demo;

import java.util.Scanner;

public class Demo3_1 {

	//������ʾ�ı�����
	static void displayMessage(){
		System.out.println("��ע�Ᵽ����������!");
		System.out.print("������ȡ�����룺");
		
	}
	
	//3-2���������жϷ���
	static boolean isLeapYear(int year){
		boolean result = false;
		if(year%4 == 0 && year%100 != 0){
			result = true;
		}else if(year%400 == 0){
			result = true;
		}
		return result;
	}
	
	//3-4��Բ���
	static double circleArea(double r){
//		���峣��PI��ֵ
		final double PI = 3.14;//������float���͵�����
		
		return (PI * r * r);
	}
	
//	3-5 ���ƾ����淽��
	static void drawRectangle(char symbol,int row,int col){
		//row ���ƶ�����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String pwd ;
		int pwd;
		
//		��������֮��Ķ��巽ʽ
		float maxScore = (float) 2.9837;
		float minScore = 2.34f;
		
//		������ʾ���ݵķ���
		displayMessage();
		//�����ַ��������� 
//		pwd = sc.nextInt();
		
		//�����ж��Ƿ�������ķ���
		boolean isYear ;
		isYear = isLeapYear(1996);
		System.out.print(isYear);
		
		
//		3-4������Բ����ķ���
		
		System.out.println(circleArea(4.0));
		 
	}

}
