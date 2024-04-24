package project1;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Represents a rectangle, which is a two-dimensional shape.
 */
class Rectangle extends TwoDimensionalShape {
    private double length; // Length of the rectangle.
    private double width;  // Width of the rectangle.S

    public Rectangle(double length, double width) {
        this.length = length; // Set the length of the rectangle.
        this.width = width;   // Set the width of the rectangle.
    }

    @Override
    double area() {
        return length * width; // Calculate the area of the rectangle.
    }
}
