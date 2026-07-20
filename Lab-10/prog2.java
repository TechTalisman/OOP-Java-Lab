import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog2 extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    
    public prog2() {
        setTitle("Simple Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));
        getContentPane().setBackground(Color.BLACK); // Set background color
        
        // Labels and Text Fields
        JLabel num1Label = new JLabel("Enter First Number:");
        num1Label.setForeground(Color.WHITE);
        add(num1Label);
        num1Field = new JTextField();
        add(num1Field);
        
        JLabel num2Label = new JLabel("Enter Second Number:");
        num2Label.setForeground(Color.WHITE);
        add(num2Label);
        num2Field = new JTextField();
        add(num2Field);
        
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setForeground(Color.WHITE);
        add(resultLabel);
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);
        
        // Buttons
        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton resetButton = new JButton("Reset");
        
        add(addButton);
        add(subButton);
        add(mulButton);
        add(resetButton);
        
        // Button Actions
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("add");
            }
        });
        
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("subtract");
            }
        });
        
        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("multiply");
            }
        });
        
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1Field.setText("");
                num2Field.setText("");
                resultField.setText("");
            }
        });
        
        setVisible(true);
    }
    
    private void performOperation(String operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;
            
            switch (operation) {
                case "add": result = num1 + num2; break;
                case "subtract": result = num1 - num2; break;
                case "multiply": result = num1 * num2; break;
            }
            
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
        }
    }
    
    public static void main(String[] args) {
        new d10q2();
    }
}

