package midterms.quiz;

import java.util.Scanner;
//prof quiz, program I wrote a paper
public class Taxable {
    public static void main(String[] args) {
        showIntroduction();
        double taxableIncome1 = readTaxableIncome();
        computeTaxdue(taxableIncome1);
    }
    public static void showIntroduction(){
        System.out.println("Tax Computation");
        System.out.println("Application");
        System.out.println("Computer");
    }
    public static double readTaxableIncome() {
        Scanner kyb = new Scanner(System.in);
        double taxableIncome;
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
        if (taxableIncome < 250000){
            double computed = 0;
            System.out.println("Tax due "+computed);
        }
        else if (taxableIncome >= 250000 && taxableIncome <= 400000){
            double computed = 10;
            System.out.println("Tax due"+computed);
        }
        return taxableIncome;
    }
}
