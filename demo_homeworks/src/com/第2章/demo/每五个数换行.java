/**
 *
 *IndexNum.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年10月19日 上午11:21:45
 *
 */
package com.第2章.demo;

/**
 * @author sylvia.zhao
 *
 */
public class 每五个数换行 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<21;i++){
			System.out.print(i+"\t");
			if(i%5 == 0){
				System.out.println("");
			}
		}

	}

}
