package com.blobtest3;

public class Car {

	public void fullThrottle() {
		System.out.println("The car is going as fast as it can");

	}
hjhhgf
	public void speed(int maxSpeed) {
		System.out.println("Max speed is " + maxSpeed);

	}

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.fullThrottle();
		myCar.speed(45);

	}

}
