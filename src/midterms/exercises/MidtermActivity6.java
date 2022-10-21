package midterms.exercises;

import java.util.Scanner;

public class MidtermActivity6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double taxableIncome;
        double taxDue = 0.0;
        byte bracket = 0;
        System.out.println("Income Tax Computation");
        System.out.print("Enter the taxable income: ");
        taxableIncome = keyboard.nextDouble();
        if (taxableIncome <= 25000.00)
            bracket = 1;
        if (taxableIncome > 25000.00 && taxableIncome <= 125000.00)
            bracket = 2;
        if (taxableIncome > 125000.00 && taxableIncome <= 525000.00)
            bracket = 3;
        if (taxableIncome > 525000.00)
            bracket = 4;
        taxDue = switch (bracket) {
            case 1 -> 4000.00;
            case 2 -> 4000.00 + (taxableIncome - 25000.00) * 0.08;
            case 3 -> 12000.00 + (taxableIncome - 125000.00) * 0.10;
            case 4 -> 62000.00 + (taxableIncome - 525000.00) * 0.12;
            default -> 0.00;
        }; // end of switch-case
        System.out.printf("%s%.2f%n", "Tax Due = ", taxDue);
        System.exit(0);
    }
}
