/**
 *
 *AutoShop.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��10��18�� ����10:45:51
 *
 */
package sylvia.Second.Train;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *�Զ��ۻ���
 *1�������û�ѭ��������Ʒѡ��
 *2��1-4ʱ����ʾ�ʵ�����Ϣȷ��ѡ��
 *��1�������� ��2���ɿ��� ��3�����׻� ��4����֭ ��5����ʾ�������� ��6���˳�
 *3��ѡ��5��ʾ�û��������Ʒ������
 *4������6�����˳�
 *5������1-6�����������ʾ�û�������������1-6֮�����
 */
public class AutoShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		int num = 0;
		boolean flag = true;
		
		//�����û�ѭ������
		while(flag){
			//����������ʾ
			Scanner scanner = new Scanner(System.in);
			System.out.println("������һ��1~6֮���������");
			num = scanner.nextInt();
			
			//����������ʾ��Ϣ
			if(num<0 || num>6){
				System.out.println("����������һ��1~6֮���������");
			}else {

				//��֧�ж�
				switch (num) {
				case 1:
					System.out.println("�������˿�����");
					count1++;
					break;
				case 2:
					System.out.println("���������ɿ���");
					count2++;
					break;
				case 3:
					System.out.println("�������˱��׻�");
					count3++;
					break;
				case 4:
					System.out.println("�������˹�֭");
					count4++;
					break;
				case 5:
					//ֻ���û�����Ʒ��ʱ�򣬲ŻὫ���������ʾ����
					if(count1>0)
						System.out.println("��������"+count1+"��������");
					if(count2>0)
						System.out.println("��������"+count2+"���ɿ���");
					if(count3>0)
						System.out.println("��������"+count3+"�����׻�");
					if(count4>0)
						System.out.println("��������"+count4+"����֭");
					
					//������������
//					System.out.println("��������"+count1+"��������"+
//							"��������"+count2+"���ɿ���"+
//							"��������"+count3+"�����׻�"+
//							"��������"+count4+"����֭");
					break;

				default:
					flag = false;
					break;
				}
				
			}
			
		}
		
		

	}

}
