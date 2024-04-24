package project1;
/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Represents a cube, a three-dimensional shape with six equal square faces.
 */
class Cube extends ThreeDimensionalShape {
    private double side; // Length of each side of the cube.

    public Cube(double side) {
        this.side = side; // Set the length of each side of the cube.
    }

    @Override
    double volume() {
        return Math.pow(side, 3); // Calculate the volume of the cube.
    }
}
