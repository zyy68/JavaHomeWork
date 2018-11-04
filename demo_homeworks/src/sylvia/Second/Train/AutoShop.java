/**
 *
 *AutoShop.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月18日 下午10:45:51
 *
 */
package sylvia.Second.Train;

import java.util.Scanner;

/**
 * @author sylvia.zhao
 *自动售货机
 *1，允许用户循环进行商品选择
 *2，1-4时，显示适当的信息确认选项
 *【1】口香糖 【2】巧克力 【3】爆米花 【4】果汁 【5】显示购买总数 【6】退出
 *3，选择5提示用户购买的商品的数量
 *4，输入6程序退出
 *5，输入1-6以外的数，提示用户：错误，请输入1-6之间的数
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
		
		//控制用户循环输入
		while(flag){
			//输入整数提示
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入一个1~6之间的整数：");
			num = scanner.nextInt();
			
			//爆出错误提示信息
			if(num<0 || num>6){
				System.out.println("错误，请输入一个1~6之间的整数！");
			}else {

				//分支判断
				switch (num) {
				case 1:
					System.out.println("您购买了口香糖");
					count1++;
					break;
				case 2:
					System.out.println("您购买了巧克力");
					count2++;
					break;
				case 3:
					System.out.println("您购买了爆米花");
					count3++;
					break;
				case 4:
					System.out.println("您购买了果汁");
					count4++;
					break;
				case 5:
					//只有用户买商品的时候，才会将买的数量显示出来
					if(count1>0)
						System.out.println("您购买了"+count1+"个口香糖");
					if(count2>0)
						System.out.println("您购买了"+count2+"个巧克力");
					if(count3>0)
						System.out.println("您购买了"+count3+"个爆米花");
					if(count4>0)
						System.out.println("您购买了"+count4+"杯果汁");
					
					//输出购买的数量
//					System.out.println("您购买了"+count1+"个口香糖"+
//							"您购买了"+count2+"个巧克力"+
//							"您购买了"+count3+"个爆米花"+
//							"您购买了"+count4+"杯果汁");
					break;

				default:
					flag = false;
					break;
				}
				
			}
			
		}
		
		

	}

}
