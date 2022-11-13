package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;

    JButton[] numberButton = new JButton[10];
    JButton[] functionButton = new JButton[9];
    JButton addButton, subButton, mulButton, divButton, equalButton, decButton, negaButton, delButton, clrButton;
    JPanel panel;
    Font myFont = new Font("Monaco", Font.BOLD, 20);

    double num1, num2, result = 0;
    char operator;
    Calculator(){
        frame = new JFrame("CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        clrButton = new JButton("Clear");
        delButton = new JButton("Delete");
        equalButton = new JButton("=");
        negaButton = new JButton("(-)");

        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = mulButton;
        functionButton[3] = divButton;
        functionButton[4] = decButton;
        functionButton[5] = clrButton;
        functionButton[6] = delButton;
        functionButton[7] = equalButton;
        functionButton[8] = negaButton;

        for (int i = 0; i < 9; i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myFont);
            functionButton[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++){
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
            numberButton[i].setFont(myFont);
            numberButton[i].setFocusable(false);
        }
        negaButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.GRAY);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(divButton);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(mulButton);
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(subButton);
        panel.add(decButton);
        panel.add(numberButton[0]);
        panel.add(equalButton);
        panel.add(addButton);

        frame.add(panel);
        frame.add(textField);
        frame.add(negaButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i=0; i<10; i++){
            if (e.getSource() == numberButton[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton){
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == equalButton){
            num2 = Double.parseDouble(textField.getText());

            switch (operator){
                case'+':
                    result = num1 + num2;
                    break;
                case'-':
                    result = num1 - num2;
                    break;
                case'*':
                    result = num1 * num2;
                    break;
                case'/':
                    result = num1 / num2;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton){
            textField.setText("");
        }
        if (e.getSource() == delButton){
            String string = textField.getText(); // store the text to a string
            textField.setText(""); // set the text field to empty
            for (int i=0; i<string.length()-1; i++){
                textField.setText(textField.getText()+string.charAt(i)); // set the text from the text field to a
                //text that deletes the last character of the original text || it remove the last character of the
                // text field.
            }
        }
        if (e.getSource() == negaButton){
            double temp = Double.parseDouble(textField.getText()); // store the text from the text field to a data
            // type of double by parsing/making the text field as double
            temp *= -1; // multiply the value by -1
            textField.setText(String.valueOf(temp)); // converts the double to a string by the String.valueOf and
            // used that string to then set the text from the text field.
        }
    }
}
