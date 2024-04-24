package project1;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Abstract class for two-dimensional shapes. Inherits from Shape.
 */
abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape() {
        super(2); // All two-dimensional shapes have 2 dimensions.
    }

    abstract double area(); // Method to calculate the area of the shape.
}
