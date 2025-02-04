/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
//Subclass 2
public class Cat extends Animal {
 // Overriding sound method in the Cat class
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
 
 public static void main(String[] args) {
     // Creating objects of Dog and Cat classes
     Animal myDog = new Dog(); // Reference type is Animal, object is Dog
     Animal myCat = new Cat(); // Reference type is Animal, object is Cat
     
     // Demonstrating polymorphism: method calls based on object type
     myDog.sound();  // Calls the Dog's sound method
     myCat.sound();  // Calls the Cat's sound method
 }
}
