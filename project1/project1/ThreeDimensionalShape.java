package project1;
/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Abstract class for three-dimensional shapes. Inherits from Shape.
 */
abstract class ThreeDimensionalShape extends Shape {
    public ThreeDimensionalShape() {
        super(3); // All three-dimensional shapes have 3 dimensions.
    }

    abstract double volume(); // Method to calculate the volume of the shape.
}
