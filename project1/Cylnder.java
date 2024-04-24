package project1;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Represents a cylinder, a three-dimensional shape with circular ends and a straight, round body.
 */
class Cylinder extends ThreeDimensionalShape {
    private double radius; // Radius of the cylinder's circular base.
    private double height; // Height of the cylinder.

    public Cylinder(double radius, double height) {
        this.radius = radius; // Set the radius of the cylinder's base.
        this.height = height; // Set the height of the cylinder.
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height; // Calculate the volume of the cylinder.
    }
}
