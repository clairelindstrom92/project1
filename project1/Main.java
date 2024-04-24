package project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * CMSC 335 Project 1
 * Name: Claire Lindstrom
 * Date:
 * Description: Main class for the Shapes project with a GUI for interaction.
 */
public class Main {
    
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
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
                        // Implementation for constructing a Circle
                        break;
                    case 2:
                        // Implementation for constructing a Rectangle
                        break;
                    case 3:
                        // Implementation for constructing a Square
                        break;
                    case 4:
                        // Implementation for constructing a Triangle
                        break;
                    case 5:
                        // Implementation for constructing a Sphere
                        break;
                    case 6:
                        // Implementation for constructing a Cube
                        break;
                    case 7:
                        // Implementation for constructing a Cone
                        break;
                    case 8:
                        // Implementation for constructing a Cylinder
                        break;
                    case 9:
                        // Implementation for constructing a Torus
                        break;
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
