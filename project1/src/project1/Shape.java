package project1;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Abstract base class for all shapes, defining the core properties of shapes.
 */
abstract class Shape {
    protected int numberOfDimensions; // Number of dimensions of the shape (2D or 3D).

    public Shape(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions; // Initialize the dimensions of the shape.
    }
}
