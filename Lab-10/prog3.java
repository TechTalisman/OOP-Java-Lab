import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog3 extends JFrame {
    private JPanel panel;
    private JList<String> colorList;
    private JButton applyButton;
    
    public prog3() {
        setTitle("Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Panel to change color
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel, BorderLayout.CENTER);
        
        // List of colors
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        colorList = new JList<>(colors);
        add(new JScrollPane(colorList), BorderLayout.WEST);
        
        // Apply Button
        applyButton = new JButton("Apply Color");
        add(applyButton, BorderLayout.SOUTH);
        
        // Button Action Listener
        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColor = colorList.getSelectedValue();
                if (selectedColor != null) {
                    switch (selectedColor) {
                        case "Red": panel.setBackground(Color.RED); break;
                        case "Green": panel.setBackground(Color.GREEN); break;
                        case "Blue": panel.setBackground(Color.BLUE); break;
                        case "Yellow": panel.setBackground(Color.YELLOW); break;
                    }
                }
            }
        });
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new d10q3();
    }
}
