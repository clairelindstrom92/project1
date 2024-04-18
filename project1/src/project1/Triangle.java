package project1;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Represents a triangle, typically defined here as a right-angled triangle for simplicity.
 */
class Triangle extends TwoDimensionalShape {
    private double base;   // Base of the triangle.
    private double height; // Height of the triangle.

    public Triangle(double base, double height) {
        this.base = base; // Set the base of the triangle.
        this.height = height; // Set the height of the triangle.
    }

    @Override
    double area() {
        return 0.5 * base * height; // Calculate the area of the triangle.
    }
}
