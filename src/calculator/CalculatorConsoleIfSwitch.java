package calculator;

import java.util.Objects;
import java.util.Scanner;

public class CalculatorConsoleIfSwitch {
    public static void main(String[] args) {
        Scanner kyb = new Scanner(System.in);
        double num1, num2;
        double result = 0;
        String operator,choice;
        System.out.println("***********************************");
        System.out.printf("%23s","Calculator\n");
        System.out.println("Input any number: ");
        num1 = Double.parseDouble(kyb.nextLine());
        System.out.println("What is the arithmetic operator? ");
        operator = String.valueOf(kyb.nextLine());
        System.out.println("Input any number: ");
        num2 = Double.parseDouble(kyb.nextLine());
        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
        }
        System.out.println("The computation for the two integer is "+result);
        System.out.println("Do you wish to proceed? (Y/N)");
        choice = String.valueOf(kyb.nextLine());
        if (Objects.equals(choice, "Y")){
            System.out.println("What is the arithmetic operator? ");
            operator = String.valueOf(kyb.nextLine());
            System.out.println("Input any number: ");
            num1 = Double.parseDouble(kyb.nextLine());
            System.out.println("Thank you for using our calculator!");
            switch (operator){
                case "+":
                    result += num1;
                    break;
                case "-":
                    result -= num1;
                    break;
                case "*":
                    result *= num1;
                    break;
                case "/":
                    result /= num1;
                    break;
            }
        } else if (Objects.equals(choice, "N")) {
            System.out.println("Thank you for using our calculator!");
        } else {
            System.out.println("INPUT INVALID!");
            System.out.println("The computation for the two integer is "+result);
        }
        System.out.println("Total value "+result);
        System.out.println("***********************************");
    }
}
