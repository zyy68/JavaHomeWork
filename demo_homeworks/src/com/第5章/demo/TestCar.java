/**
 *Car.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2019��2��2�� ����7:44:23
 */
package com.��5��.demo;

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
		this.brand = "��������";
		this.color = "ɧ��ɫ";
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