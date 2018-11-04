/**
 *
 *ShowHour.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月18日 下午9:57:37
 *
 */
package sylvia.Second.Train;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *输入一个具体的0-24之间的整数，判断是上午还是下午几点
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
			System.out.println("请输入一个0-24之间的整数：");
			num = scanner.nextInt();
			
			if(num>=0&&num<=24){
				if(num<12){
					System.out.println("上午"+num+"点。");
				}else if(num == 12){
					System.out.println("正午12点");
				}else if (num<24) {
					System.out.println("下午"+(num-12)+"点。");
				}else {
					System.out.println("凌晨零点");
				}
			}else {
				System.out.println("请输入一个0-24之间的整数!");
			}
			count--;
		}		
		
		
		

	}

}
