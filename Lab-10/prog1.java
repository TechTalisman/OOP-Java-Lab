import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog1 extends JFrame {
    public prog1() {
        setTitle("Registration Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Labels and Text Fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(3, 20);
        
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        
        JLabel termsLabel = new JLabel("Accept Terms & Conditions:");
        JCheckBox termsCheckBox = new JCheckBox();
        
        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (termsCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Registration Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Please accept terms & conditions.");
                }
            }
        });
        
        // Image
        JLabel imageLabel = new JLabel(new ImageIcon("user.png")); // Replace with actual image path
        
        // Adding components
        add(imageLabel);
        add(nameLabel); add(nameField);
        add(addressLabel); add(new JScrollPane(addressArea));
        add(genderLabel); add(maleButton); add(femaleButton);
        add(termsLabel); add(termsCheckBox);
        add(submitButton);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new d10q1();
    }
}
