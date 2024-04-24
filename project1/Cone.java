package project1;
/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Represents a cone, a three-dimensional shape with a circular base and a single vertex.
 */
class Cone extends ThreeDimensionalShape {
    private double radius; // Radius of the base of the cone.
    private double height; // Height of the cone.

    public Cone(double radius, double height) {
        this.radius = radius; // Set the radius of the base of the cone.
        this.height = height; // Set the height of the cone.
    }

    @Override
    double volume() {
        return (Math.PI * radius * radius * height) / 3.0; // Calculate the volume of the cone.
    }
}

