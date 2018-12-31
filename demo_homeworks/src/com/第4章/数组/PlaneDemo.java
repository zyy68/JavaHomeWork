package com.第4章.数组;

import java.util.Scanner;

//分配座位
/**
 * 13排 每排6座 前两排为头等舱，余下的为经济舱，
 * 用户购票时要提醒用户舱别，
 * 根据舱别为用户随机分配一个未被占用的座位。
 * */
public class PlaneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明一个座位系统空间
		int  seats[][] = new int[13][6];
		int count1=12;//用于记录头等舱的座位余票
		int count2=seats.length*seats[0].length-12;//记录经济舱余票
		int len=seats.length*seats[0].length;
//		seats[0][2]=seats[1][0]=seats[1][4]=seats[3][5]=seats[4][4]=seats[4][5]=1;
		//默认初始化都为0
		
		while(true){
			System.out.println(seats[4][5]);
			System.out.println("选择机票类型\t请输入头等座或经济舱：");
			Scanner scanner = new Scanner(System.in);
			String type = scanner.nextLine();//得到用户输入的类型
			
			
			if(type.equals("头等座")){
	//			//方法一  写法1：随机数控制行列，但对于只剩下几个座位来选择，效率会降低。
	//			//随机数生成行
	//			int hang=(int) (Math.random()*2);
	//			//随机数生成列
	//			int lie=(int) (Math.random()*6);
	//			//当随机选中的值不是1时，赋值为1，表示已经选中，否则，再次随机挑座位
	//			if()
				
				if(count1==0){
					System.out.println("头等舱余票为：0 张。");
				}else {
					System.out.println("头等舱尚且余票为："+count1+"张。");
					//方法一  写法2：通过随机数直接控制可选的座位
					int id=(int) Math.random()*12;
					if(seats[id/2][id%6]!=1){
						seats[id/2][id%6]=1;
						count1--;
					}
					
					System.out.println("");
				}
				
				
			}else if(type.equals("经济舱")){
				if(count2==0){
					System.out.println("经济舱余票为：0 张。");
				}else {
					System.out.println("经济舱尚且余票为："+count2+"张。");
					//方法一  写法2：通过随机数直接控制可选的座位
					int id=(int) Math.random()*len;
					if(seats[id/seats[0].length+2][id%seats.length]!=1){
						seats[id/seats[0].length+2][id%seats.length]=1;
						count2--;
					}
					
					System.out.println("");
				}
				
			}else {
				System.out.println("退出选票系统！");
				break;
			}
		}//while
		//输出seats
		System.out.println(seats[0].length+"\t"+seats.length);
		
		for(int i=0;i<seats.length;i++){
			for(int j=0;j<seats[0].length;j++){
				System.out.print(seats[i][j]+"  ");	
			}
			System.out.println();
		}

	}

}
