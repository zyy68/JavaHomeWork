/**
 *
 *GussSum.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��18�� ����10:32:12
 *
 */
package sylvia.Second.Train;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *�û�������������������һ���²����������²���������֮�ͣ���ô��ף���û����������ο����Ϣ����ȷ��
 */
public class GussSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		num1 = num2 = 0.0;
		double guessNum = 0.0;
		boolean flag = false;
		while(!flag){
			Scanner scanner = new Scanner(System.in);
			System.out.println("�������һ������");
			num1 = scanner.nextDouble();
			
			System.out.println("������ڶ�������");
			num2 = scanner.nextDouble();
			
			System.out.println("��²���������֮���ǣ�");
			guessNum = scanner.nextDouble();
			
			
			if(num1+num2 == guessNum){
				System.out.println("��ϲ��¶���������������ǣ�"+(num1+num2));
				flag = true;
			}else {
				System.out.println("��µ����ֲ���ȷŶ�����������룡");
			}
		}
		
		
		
	}

}
