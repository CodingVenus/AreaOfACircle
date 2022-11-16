package com.teksystems.areacalculator;

public class AreaCircle {
	
	private static double area;
	private static double radius = 50;
	private static double pi = 3.14;

	/**
	 * Invoke each method in main method
	 */
	public static void main(String[] args) {
		
		
		calcAreaOfCircle(radius, pi);
		displayArea();
	}
	
	/**
	 * First Method with two parameters (radius and pi)
	 */
	
	public static void calcAreaOfCircle(double radius, double pi) {
		
		area = pi * radius * radius;
		
	}
	
	
	/**
	 * Second method will display the area
	 */
	public static void displayArea() {
		System.out.println("If the radius of the circle is " + radius + " the area of the circle will be " + area);
	}
			
	

}
