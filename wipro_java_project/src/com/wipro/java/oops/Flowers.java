/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flowers {
	String flowerWeather;
	String flowerColor;

	Flowers(String weather, String color) {
		this.flowerWeather = weather;
		this.flowerColor = color;
	}

	void display() {
		System.out.println("Flower weather:" + flowerWeather + " and Flower Color is :" + flowerColor);
		;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flowers flowerobject1 = new Flowers("Dianthus", "Red");
		Flowers flowerobject2 = new Flowers("Hubiscus", "Yellow");
		Flowers flowerobject3 = new Flowers("Gazania", "Orange");
		flowerobject1.display();
		flowerobject2.display();
		flowerobject3.display();
	}

}
