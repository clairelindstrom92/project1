package project1;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date:
 * Description: Main class for the Shapes project with a CLI for interaction.
 */
public class Main {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double dimension1, dimension2;

        while (choice != 10) {
            System.out.println("\n********* Welcome to the Java OO Shapes Program **********");
            System.out.println("Select from the menu below:");
            System.out.println("1. Construct a Circle");
            System.out.println("2. Construct a Rectangle");
            System.out.println("3. Construct a Square");
            System.out.println("4. Construct a Triangle");
            System.out.println("5. Construct a Sphere");
            System.out.println("6. Construct a Cube");
            System.out.println("7. Construct a Cone");
            System.out.println("8. Construct a Cylinder");
            System.out.println("9. Construct a Torus");
            System.out.println("10. Exit the program");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("You have selected a Circle");
                        System.out.print("Enter the radius: ");
                        dimension1 = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        Circle circle = new Circle(dimension1);
                        System.out.println("The area of the Circle is " + df.format(circle.area()));
                        break;
                    case 2:
                        System.out.println("You have selected a Rectangle");
                        System.out.print("Enter the length: ");
                        dimension1 = scanner.nextDouble();
                        System.out.print("Enter the width: ");
                        dimension2 = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        Rectangle rectangle = new Rectangle(dimension1, dimension2);
                        System.out.println("The area of the Rectangle is " + df.format(rectangle.area()));
                        break;
                    // ... Implementations for other shapes
                    case 10:
                        System.out.println("Thanks for using the program. Today is " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now());
                        break;
                    default:
                        System.out.println("Invalid option, please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number 1-10.");
            }
        }
        scanner.close();
    }
    // Further methods for shape construction and calculation
}

