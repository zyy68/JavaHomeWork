/**
 *
 *ShowHour.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��18�� ����9:57:37
 *
 */
package sylvia.Second.Train;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *����һ�������0-24֮����������ж������绹�����缸��
 */
public class ShowHour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int count=2;
		Scanner scanner = new Scanner(System.in);
		while(count>=0){
			System.out.println("������һ��0-24֮���������");
			num = scanner.nextInt();
			
			if(num>=0&&num<=24){
				if(num<12){
					System.out.println("����"+num+"�㡣");
				}else if(num == 12){
					System.out.println("����12��");
				}else if (num<24) {
					System.out.println("����"+(num-12)+"�㡣");
				}else {
					System.out.println("�賿���");
				}
			}else {
				System.out.println("������һ��0-24֮�������!");
			}
			count--;
		}		
		
		
		

	}

}
