package project1;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date:
 * Description: Represents a torus, a three-dimensional doughnut-shaped ring defined by two radii.
 */
class Torus extends ThreeDimensionalShape {
    private double majorRadius; // Major radius (distance from the center of the tube to the center of the torus).
    private double minorRadius; // Minor radius (radius of the tube).

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    double volume() {
        return (2 * Math.PI * majorRadius) * (Math.PI * minorRadius * minorRadius); // Formula for the volume of a torus
    }
}
