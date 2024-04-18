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
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Create the main window (a JFrame)
        JFrame frame = new JFrame("Shapes GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 2, 10, 10));

        // Create a panel for inputs
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        frame.add(inputPanel);

        // Create a panel for results
        JTextArea resultArea = new JTextArea(20, 30);
        resultArea.setEditable(false);
        JScrollPane resultScrollPane = new JScrollPane(resultArea);
        frame.add(resultScrollPane);

        // Add a combo box for shape selection
        String[] shapes = {"Circle", "Rectangle", "Square", "Triangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus"};
        JComboBox<String> shapeComboBox = new JComboBox<>(shapes);
        inputPanel.add(shapeComboBox);

        // Add input fields
        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);
        inputPanel.add(new JLabel("Dimension 1:"));
        inputPanel.add(inputField1);
        inputPanel.add(new JLabel("Dimension 2:"));
        inputPanel.add(inputField2);
        
        // Add a button to calculate
        JButton calculateButton = new JButton("Calculate");
        inputPanel.add(calculateButton);

        // Add action listener for the calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedShape = (String) shapeComboBox.getSelectedItem();
                try {
                    double dimension1 = Double.parseDouble(inputField1.getText());
                    double dimension2 = inputField2.isVisible() ? Double.parseDouble(inputField2.getText()) : 0;
                    String result = calculateShape(selectedShape, dimension1, dimension2);
                    resultArea.setText(result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers for dimensions.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Update input fields based on shape selection
        shapeComboBox.addActionListener(e -> {
            String selectedShape = (String) shapeComboBox.getSelectedItem();
            if ("Sphere".equals(selectedShape) || "Cube".equals(selectedShape)) {
                inputField2.setVisible(false);
            } else {
                inputField2.setVisible(true);
            }
            frame.pack();
        });

        // Pack the frame and make it visible
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static String calculateShape(String shape, double dimension1, double dimension2) {
        switch (shape) {
            case "Circle":
                Circle circle = new Circle(dimension1);
                return "The area of the Circle is: " + df.format(circle.area());
            case "Rectangle":
                Rectangle rectangle = new Rectangle(dimension1, dimension2);
                return "The area of the Rectangle is: " + df.format(rectangle.area());
            case "Square":
                Square square = new Square(dimension1);
                return "The area of the Square is: " + df.format(square.area());
            case "Triangle":
                Triangle triangle = new Triangle(dimension1, dimension2);
                return "The area of the Triangle is: " + df.format(triangle.area());
            case "Sphere":
                Sphere sphere = new Sphere(dimension1);
                return "The volume of the Sphere is: " + df.format(sphere.volume());
            case "Cube":
                Cube cube = new Cube(dimension1);
                return "The volume of the Cube is: " + df.format(cube.volume());
            // Continue with other shapes...
            default:
                return "Shape not recognized.";
        }
    }
}
