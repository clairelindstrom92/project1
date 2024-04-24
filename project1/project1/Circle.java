package project1;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Represents a circle, which is a two-dimensional shape.
 */
class Circle extends TwoDimensionalShape {
    private double radius; // Radius of the circle.

    public Circle(double radius) {
        this.radius = radius; // Set the radius of the circle.
    }

    @Override
    double area() {
        return Math.PI * radius * radius; // Calculate the area of the circle.
    }
}
