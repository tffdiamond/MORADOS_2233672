package midterms.activities;

import java.util.Scanner;

public class ImproveMoneyInBank {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float annualRate;
        float quarterlyRate;
        double principal;
        double interest;
        double finalAmount;
        byte quarter;
        int year;
        annualRate = 0.05F; // set annual interest to 5%
        System.out.print("Enter the year: ");
        year = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter the initial principal: ");
        principal = Double.parseDouble(keyboard.nextLine());
        System.out.printf("%s%.2f%n", "Principal = ", principal);
        System.out.printf("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%');
        System.out.printf("%6s%8s%16s%30s%n", "Year", "Quarter", "Interest Earned",
                "Amount at end of quarter");
        quarterlyRate = annualRate/4;
        quarter = 1;
        interest = principal*quarterlyRate;
        finalAmount = principal + interest;
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte) (quarter + 1);
        interest = principal*quarterlyRate;
        finalAmount = principal + interest;
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte) (quarter +1);
        interest = principal*quarterlyRate;
        finalAmount = principal + interest;

        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte) (quarter +1);
        interest = principal * quarterlyRate;
        finalAmount = principal + interest;
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        System.exit(0);
    }
}
