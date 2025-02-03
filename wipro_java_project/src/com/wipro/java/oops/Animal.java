/**
 * 
 */
package com.wipro.java.oops;

/**
 * no constructors
 * getters have return value
 * setters have no return value
 * properties are determined by private fields
 * values are behaviors are determined via setters
 *toString will convert entire animal class properties and behaviors
 */
public class Animal {

	/**
	 * 
	 */
	private String name;
	private String weight;
	private String color;
	private String type;

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", color=" + color + ", type=" + type + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}

	public void setSalary(String type) {
		this.type = type;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
