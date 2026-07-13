import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog3 extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private boolean running = false;
    private int hours = 0, minutes = 0, seconds = 0;
    private Thread timerThread;

    public prog3() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        add(timeLabel);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        add(startButton);
        add(stopButton);
        add(resetButton);

        // Event handling for buttons
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!running) {
                    running = true;
                    startTimer();
                }
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = false;
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = false;
                hours = minutes = seconds = 0;
                timeLabel.setText("00:00:00");
            }
        });

        setVisible(true);
    }

    // Multi-threaded method for updating time
    private void startTimer() {
        timerThread = new Thread(() -> {
            while (running) {
                try {
                    Thread.sleep(1000);
                    seconds++;
                    if (seconds == 60) {
                        seconds = 0;
                        minutes++;
                    }
                    if (minutes == 60) {
                        minutes = 0;
                        hours++;
                    }
                    timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        timerThread.start();
    }

    public static void main(String[] args) {
        new d8q3();
    }
}
