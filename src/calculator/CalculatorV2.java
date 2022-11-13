package calculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorV2 implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButton = new JButton[10];
    JButton[] functionButton = new JButton[14];
    JButton addB, minusB, timesB, divB, clrB, delB, negativeB, decB, equB, expB, sqrtB, fracB, percentB, clreB;
    JPanel panel;
    double num1, num2, result=0;
    char operator;

    Font myFont = new Font(Font.SANS_SERIF,  Font.BOLD, 10);
    CalculatorV2(){
        frame = new JFrame("CALCULATORV2");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(340, 540);
        frame.setLayout(null);
        frame.setFont(myFont);

        textField = new JTextField();
        textField.setBounds(10,25, 300,50);
        textField.setFont(myFont);
        textField.setEditable(false);


        addB = new JButton("+");
        minusB = new JButton("-");
        timesB = new JButton("*");
        divB = new JButton("/");
        clrB = new JButton("C");
        delB = new JButton("{x]");
        decB = new JButton(".");
        negativeB = new JButton("+/-");
        equB = new JButton("=");
        expB = new JButton("x^2");
        sqrtB = new JButton("x^1/2");
        fracB = new JButton("1/x");
        percentB = new JButton("%");
        clreB = new JButton("CE");

        functionButton[0] = addB;
        functionButton[1] = minusB;
        functionButton[2] = timesB;
        functionButton[3] = divB;
        functionButton[4] = clrB;
        functionButton[5] = delB;
        functionButton[6] = decB;
        functionButton[7] = negativeB;
        functionButton[8] = equB;
        functionButton[9] = expB;
        functionButton[10] = sqrtB;
        functionButton[11] = fracB;
        functionButton[12] = percentB;
        functionButton[13] = clreB;

        for (int i =0; i<numberButton.length; i++){
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
            numberButton[i].setFont(myFont);
            numberButton[i].setFocusable(false);
            numberButton[i].setBackground(Color.DARK_GRAY);
            numberButton[i].setForeground(Color.white);
            numberButton[i].setBorder(new RoundedBorder(10));
        }

        for (int i=0; i<functionButton.length; i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myFont);
            functionButton[i].setFocusable(false);
            functionButton[i].setBackground(Color.DARK_GRAY);
            functionButton[i].setForeground(Color.white);
            functionButton[i].setBorder(new RoundedBorder(10));
        }

        panel = new JPanel();
        panel.setBounds(10,80, 300, 400);
        panel.setLayout(new GridLayout(6, 4, 5 ,5));
        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.setBackground(Color.DARK_GRAY);
        panel.add(percentB);
        panel.add(clreB);
        panel.add(clrB);
        panel.add(delB);
        panel.add(fracB);
        panel.add(expB);
        panel.add(sqrtB);
        panel.add(divB);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(timesB);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(minusB);
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(addB);
        panel.add(negativeB);
        panel.add(numberButton[0]);
        panel.add(decB);
        panel.add(equB);

        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        CalculatorV2 calc = new CalculatorV2();
    }
    private static class RoundedBorder implements Border {

        private int radius;


        RoundedBorder(int radius) {
            this.radius = radius;
        }


        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        public boolean isBorderOpaque() {
            return true;
        }


        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0; i<numberButton.length; i++) {
            if (e.getSource() == numberButton[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == addB){
            num1 = Double.parseDouble(textField.getText());
            operator += '+';
            textField.setText("");
        }
        if (e.getSource() == minusB){
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator += '-';
        }
        if (e.getSource() == timesB){
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator += '*';
        }
        if (e.getSource() == divB){
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator += '/';
        }
        if (e.getSource() == equB){
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrB){
            textField.setText("");
        }
        if (e.getSource() == clreB){
            textField.setText("");
        }
        if (e.getSource() == decB){
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == negativeB){
            num1 = Double.parseDouble(textField.getText()) * -1;
            textField.setText(String.valueOf(num1));
        }
        if (e.getSource() == delB){
            String string = textField.getText();
            textField.setText("");
            for (int i=0; i<string.length()-1; i++){
                textField.setText(textField.getText().concat(String.valueOf(string.charAt(i))));
            }
        }
    }
}
