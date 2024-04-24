package project1;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date: 
 * Description: Represents a sphere, a three-dimensional shape with all points at the same distance from the center.
 */
class Sphere extends ThreeDimensionalShape {
    private double radius; // Radius of the sphere.

    public Sphere(double radius) {
        this.radius = radius; // Set the radius of the sphere.
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Calculate the volume of the sphere.
    }
}
