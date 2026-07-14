import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;

public class prog4 extends JFrame {
    private JLabel imageLabel, textLabel;
    private ImageIcon[] images;
    private String[] messages = {"Welcome", "Enjoy", "Thanks", "Visit Again"};
    private int imgX = 50, imgY = 50, step = 10, direction = 0;
    private int messageIndex = 0;
    
    public  prog4 () {
        setTitle("Image and Message Animation");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        images = new ImageIcon[]{
            new ImageIcon("image1.jpg"),
            new ImageIcon("image2.jpg"),
            new ImageIcon("image3.jpg"),
            new ImageIcon("image4.jpg")
        };
        
        imageLabel = new JLabel(images[0]);
        imageLabel.setBounds(imgX, imgY, 100, 100);
        add(imageLabel);
        
        textLabel = new JLabel(messages[0], SwingConstants.CENTER);
        textLabel.setBounds(150, 400, 200, 30);
        textLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(textLabel);
        
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.scheduleAtFixedRate(this::moveImage, 0, 10, TimeUnit.MILLISECONDS);
        executor.scheduleAtFixedRate(this::changeMessage, 0, 1000, TimeUnit.MILLISECONDS);
        
        setVisible(true);
    }
    
    private void moveImage() {
        switch (direction) {
            case 0: imgX += step; if (imgX >= 350) direction = 1; break;
            case 1: imgY += step; if (imgY >= 350) direction = 2; break;
            case 2: imgX -= step; if (imgX <= 50) direction = 3; break;
            case 3: imgY -= step; if (imgY <= 50) direction = 0; break;
        }
        
        imageLabel.setBounds(imgX, imgY, 100, 100);
        imageLabel.setIcon(images[(imgX / step) % images.length]);
    }
    
    private void changeMessage() {
        textLabel.setText(messages[messageIndex]);
        messageIndex = (messageIndex + 1) % messages.length;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(d8q4::new);
    }
}
