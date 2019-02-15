/**
 *Car.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2019年2月2日 下午7:44:23
 */
package com.第5章.demo;

/**
 * @author sylvia.zhao
 *
 */
class Car {

	private String brand;
	private String color;
	
	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
		this.brand = "兰博基尼";
		this.color = "骚红色";
	}
	Car(String brand,String color){
		this.brand = brand;
		this.color =color;
	}
	
	public String getBrand() {
		return this.brand;
		
		
	}
	
	public String getColor() {
		return this.color;  
	}
}

public class TestCar{
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getBrand());
	}
}