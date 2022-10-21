package midterms.exercises;
import java.util.Scanner;
/**
 * Problem:
 * Write a program for computing the amount of money in a bank account at the end of each quarter
 * for a period of one year. A quarter is equivalent to 3 months. Assume that the account is created
 * at the beginning of a year (i.e. January 1). The year will be entered at run time through the
 * keyboard. The account has an initial principal that is entered at run time through the keyboard. No
 * deposit or withdrawal is made within the one-year period. The interest is compounded quarterly
 * which means that the interest earned for the first quarter will form part of the principal for the
 * second quarter, the interest earned for the second quarter will form part of the principal for the
 * third quarter and so on. The annual interest rate is 5%. The interest rate for a quarter is computed
 * by dividing the annual interest rate by 4 since there are four quarters in a year. The computational
 * procedure (see algorithm) and the output of the program (see sample run) are shown below. The
 * output includes a table showing the year, quarter number, interest earned and the new principal.
 * The new principal is the amount at the end of the quarter.
 * ALGORITHM:
 * Declare the necessary variables.
 * Let annual interest rate be set to 0.05. (Note 5.00% = 0.05).
 * Accept the year.
 * Accept the initial principal.
 * Display principal formatted with two digits after decimal point.
 * Display annual interest rate in percent form.
 * Display the column headings for the table.
 * Compute the interest rate for a quarter.
 * Let quarter be 1.
 * Compute the interest earned for the first quarter
 * Compute the new amount (amount at the end of the first quarter)
 * Display the year, quarter, interest earned and balance at the end of 1
 *
 * 1st quarter
 *
 * Let quarter be 2
 * Compute the interest earned for the second quarter
 * Compute the new amount (amount at the end of the second quarter)
 * Display the year, quarter, interest earned and balance at the end of 2
 *
 * 2nd quarter
 *
 * Let quarter be 3.
 * Compute the interest earned for the third quarter
 * Compute the new amount (amount at the end of the third quarter)
 * Display the year, quarter, interest earned and balance at the end of 3
 *
 * 3rd quarter
 *
 * Let quarter be 4.
 * Compute the interest earned for the fourth quarter
 * Compute the new amount (amount at the end of the fourth quarter)
 * Display the year, quarter, interest earned and balance at the end of 4
 *
 * 4th quarter
 *
 * SAMPLE RUN:
 * Enter the year: 2005
 * Enter the initial principal: 10000.00
 * Principal: 10000.00
 * Annual Interest Rate: 5.00%
 * Year Quarter Interest Earned Amount at end of quarter
 * 2005 1 125.00 10125.00
 *
 * 2005 2 126.56 10251.56
 * 2005 3 128.14 10379.70
 * 2005 4 129.75 10509.45
 **/
public class MidtermExercise3B {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            float annualRate;
            float quarterlyRate;
            double principal;
            double interest;
            double finalAmount;
            byte quarter =1;
            int year;
            annualRate = 0.05F; // set annual interest to 5%
            System.out.print("Enter the year: ");
            year = Integer.parseInt(keyboard.nextLine()); // item 1
            System.out.print("Enter the initial principal: ");
            principal = Double.parseDouble(keyboard.nextLine()); // item 2
            System.out.printf("%s%.2f%n", "Principal = ", +principal); // item 3
            System.out.printf("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%');
            System.out.printf("%6s%8s%16s%30s%n", "Year", "Quarter", "Interest Earned",
                    "Amount at end of quarter");
            quarterlyRate = annualRate/4; // item 4
            interest = quarterlyRate * principal; // item 5
            finalAmount = principal + interest;
            for(int i=4; i>=quarter; quarter++){
                System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest,
                        finalAmount);
                principal = finalAmount;
                interest = quarterlyRate * principal;
                finalAmount = principal + interest;
            }
            System.exit(0);
        } // end of the main method
    } // end of the class
