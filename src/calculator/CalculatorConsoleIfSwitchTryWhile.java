package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
//line 27,28 is the easiest way to create the parts of a calculator
//line 25-27 used an array for the arithmetic of two integers
public class CalculatorConsoleIfSwitchTryWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader kyb = new BufferedReader(new InputStreamReader(System.in));
        double num1 =0;
        double num2 =0;
        double result = 0;
        String[] operator = {"+", "-", "*", "/"};
        String arithmetic1, arithmetic2;
        String option = "";
        int ope;
        try {
            System.out.println("***********************************");
            System.out.println("WELCOME TO CALCULATOR!");
            System.out.println("Enter any integer: ");
            num1 = Double.parseDouble(kyb.readLine());
            System.out.println("What is the arithmetic operator? ");
            ope = Integer.parseInt(kyb.readLine());
            arithmetic1 = operator[ope];
//            System.out.println("What is the arithmetic operator? ");
//            operator = String.valueOf(kyb.readLine());
            System.out.println("Enter any integer: ");
            num2 = Double.parseDouble(kyb.readLine());
            switch (arithmetic1) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            System.out.println("The value is " + result);
            num1 = result;
            while (true) {
                System.out.println("Do you wish to proceed? (Y/N) ");
                option = String.valueOf(kyb.readLine());
                if (Objects.equals(option, "Y")) {
                    System.out.println("What is the arithmetic operator? ");
                    arithmetic2 = String.valueOf(kyb.readLine());
                    System.out.println("Enter any integer: ");
                    result = Double.parseDouble(kyb.readLine());
                    switch (arithmetic2) {
                        case "+":
                            result += num1;
                            break;
                        case "-":
                            result = num1 - result;
                            break;
                        case "*":
                            result *= num1;
                            break;
                        case "/":
                            result = num1/result;
                            break;
                    }
                    System.out.println(result);
                    num1 = result;
                } else if (Objects.equals(option, "N")) {
                    System.out.println("The final value is " + result);
                    break;
                } else {
                    System.out.println("Invalid Input!");
                }
            }
        }finally {
            System.out.println("Thank you for using the calculator!");
        }
    }
}
