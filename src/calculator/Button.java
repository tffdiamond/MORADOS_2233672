package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    public Button(){
        frame = new JFrame();
        Font myFont1 = new Font("Arial", Font.BOLD, 12);

        button = new JButton("Click me nigga");
        button.addActionListener(this);
        button.setFont(myFont1);
        label = new JLabel("Number of Clicks: 0");
        label.setFont(myFont1);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(button);


        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CALCULATOR");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Button();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count += 10;
        label.setText("Number of Clicks "+count);
    }
}
