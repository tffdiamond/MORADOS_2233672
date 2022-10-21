package midterms.quiz;

import java.util.Scanner;

public class Taxable {
    public static void main(String[] args) {
        double taxableIncome = 0;
        showIntroduction();
        readTaxableIncome(taxableIncome);
        computeTaxdue(taxableIncome);
    }
    public static void showIntroduction(){
        System.out.println("Tax Computation");
        System.out.println("Application");
        System.out.println("Computer");
    }
    public static double readTaxableIncome(double taxableIncome) {
        Scanner kyb = new Scanner(System.in);
        do {
            System.out.println("Enter the taxable income: ");
            taxableIncome = kyb.nextDouble();
            if (taxableIncome < 0) {
                System.out.println("The amount cannot be negative");
            }
        } while (taxableIncome < 0);
        return taxableIncome;
    }
    public static double computeTaxdue(double taxableIncome){
        double a = taxableIncome;
        if (a < 250000){
            double computed = 0;
            System.out.println("Tax due "+computed);
        }
        return a;
    }
}
