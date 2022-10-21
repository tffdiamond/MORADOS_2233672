package something.tutorials;

import java.util.Scanner;

public class ComputationArithmetic {
    public static void main(String[] args) {
        //create a scanner
        Scanner userInput = new Scanner(System.in);
        //user input
        System.out.println("Please input a value: ");
        double x = userInput.nextDouble();
        System.out.println("Please input a value: ");
        double y = userInput.nextDouble();
        //close the scanner
        userInput.close();
        //compute
        double sum = x + y;
        double difference = x + y;
        double multiply = x * y;
        double div = x/y;
        //output
        System.out.println("The results are as follows:");
        System.out.printf("Sum: %.2f + %.2f = %.2f\n",x,y,sum);
        System.out.printf("Difference: %.2f - %.2f = %.2f\n",x,y,difference);
        System.out.printf("Multiplication: %.2f * %.2f = %.2f\n",x,y,multiply);
        System.out.printf("Division: %.2f / %.2f = %.2f\n",x,y,div);
    }
}