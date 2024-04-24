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

    // Method to calculate shape based on selection and dimensions
private static String calculateShape(String selectedShape, double dimension1, double dimension2) {
    Shape shape; // General shape reference for creating instances
    String result; // To store the result of area or volume calculation
    switch (selectedShape) {
        case "Circle":
            shape = new Circle(dimension1);
            result = "Area: " + df.format(((TwoDimensionalShape)shape).area());
            break;
        case "Rectangle":
            shape = new Rectangle(dimension1, dimension2);
            result = "Area: " + df.format(((TwoDimensionalShape)shape).area());
            break;
        case "Square":
            shape = new Square(dimension1);
            result = "Area: " + df.format(((TwoDimensionalShape)shape).area());
            break;
        case "Triangle":
            shape = new Triangle(dimension1, dimension2);
            result = "Area: " + df.format(((TwoDimensionalShape)shape).area());
            break;
        case "Sphere":
            shape = new Sphere(dimension1);
            result = "Volume: " + df.format(((ThreeDimensionalShape)shape).volume());
            break;
        case "Cube":
            shape = new Cube(dimension1);
            result = "Volume: " + df.format(((ThreeDimensionalShape)shape).volume());
            break;
        case "Cone":
            shape = new Cone(dimension1, dimension2);
            result = "Volume: " + df.format(((ThreeDimensionalShape)shape).volume());
            break;
        case "Cylinder":
            shape = new Cylinder(dimension1, dimension2);
            result = "Volume: " + df.format(((ThreeDimensionalShape)shape).volume());
            break;
        case "Torus":
            shape = new Torus(dimension1, dimension2);
            result = "Volume: " + df.format(((ThreeDimensionalShape)shape).volume());
            break;
        default:
            result = "Unknown shape";
    }
    return result;
}
    }
}
