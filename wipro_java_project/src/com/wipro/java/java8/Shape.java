package com.wipro.java.java8;


@FunctionalInterface
interface ShapeInterface {
    // Only one abstract method
    public void calculateArea();

    // Default method 1
    default String showShapeInfo() {
        return "Shape Info: Default method 1";
    }

    // Default method 2
    default String showAdditionalInfo() {
        return "Shape Info: Default method 2";
    }

    // Static method 1
    static String getDescription() {
        return "Shape: This is a generic shape";
    }

    // Static method 2
    static String getMoreDescription() {
        return "Shape: More information about shapes.";
    }
}

// Implement the ShapeInterface for a specific shape, e.g., Circle
class Circle implements ShapeInterface {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the abstract method (calculateArea)
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Optionally, override default method (not required, just an example)
    @Override
    public String showShapeInfo() {
        return "This is a Circle with radius: " + radius;
    }

    // Optionally, override default method (not required, just an example)
    @Override
    public String showAdditionalInfo() {
        return "This is additional info for Circle with radius: " + radius;
    }
}

// Implement the ShapeInterface for another shape, e.g., Rectangle
class Rectangle implements ShapeInterface {
    private double length, width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the abstract method (calculateArea)
    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    // Optionally, override default method (not required, just an example)
    @Override
    public String showShapeInfo() {
        return "This is a Rectangle with length: " + length + " and width: " + width;
    }

    // Optionally, override default method (not required, just an example)
    @Override
    public String showAdditionalInfo() {
        return "This is additional info for Rectangle with length: " + length + " and width: " + width;
    }
}

public class Shape {
    public static void main(String[] args) {
        // Create an object of Circle
        Circle circle = new Circle(5);

        // Calculate the area of the circle using the abstract method
        circle.calculateArea();

        // Use the default method from the ShapeInterface
        System.out.println(circle.showShapeInfo());
        System.out.println(circle.showAdditionalInfo());

        // Call the static method from the ShapeInterface
        System.out.println(ShapeInterface.getDescription());
        System.out.println(ShapeInterface.getMoreDescription());

        // Create an object of Rectangle
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculate the area of the rectangle using the abstract method
        rectangle.calculateArea();

        // Use the default method from the ShapeInterface
        System.out.println(rectangle.showShapeInfo());
        System.out.println(rectangle.showAdditionalInfo());

        // Call the static method from the ShapeInterface
        System.out.println(ShapeInterface.getDescription());
        System.out.println(ShapeInterface.getMoreDescription());
    }
}
