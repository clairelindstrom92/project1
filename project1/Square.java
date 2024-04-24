package project1;
/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Represents a square, which is a two-dimensional shape with all sides equal.
 */
class Square extends TwoDimensionalShape {
    private double side; // Side length of the square.

    public Square(double side) {
        this.side = side; // Set the side length of the square.
    }

    @Override
    double area() {
        return side * side; // Calculate the area of the square.
    }
}
