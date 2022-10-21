package prelims.exercises;

import java.util.Scanner;

/**The filename for the following source code must be Dispenser.java
Name: LOU DIAMOND T. MORADOS
Programming Date: September 8, 2022,
Activity Name and Number: Prelim Exercise Number 7
Problem: Write a program that will read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
then compute and output the least number of peso bills (P100 peso bills, P500 peso bills, P1000 peso bills) that
will be dispensed by the machine for the requested amount. Determine also the amount of money corresponding
to each peso bill dispensed, the sum total of number of bills dispensed, and sum total of amounts per
denomination as shown below. Assume that enough bills are always available from the machine. Assume
further that the machine can only dispense P100 peso bills, P500 peso bills, and P1000 peso bills.
Analysis:
Input: amount of cash to be withdrawn
Processes:
Display the data connecting to the cash withdrawn
Output:
 - Total Quantity Dispensed of P1000
 - Total Quantity Dispensed of P500
 - Total Quantity Dispensed of P100
 - Total Amount of P1000
 - Total Amount of P500
 - Total Amount of P100

Algorithm:
 1. Create an object of Scanner class for the desired inputs
 2. Represent a variables that take out the input values for which the value is carry out until
 the process is completed.
 3. Calculate the quantity of P1000, P500, P100 to be dispensed involving the input value(cashWithdrawn) in the first
 Peso Bill:
     oneThousandQnty = cashWithdrawn/1000
     fiveHundredQnty = oneThousandRemder / 1000         where (variable)Remder is the remainder of the identifier that
     oneHundredQnty = fiveHundredRemder / 100           consist a modulo operator(%)
 4. Calculate the remaining value of the input value using modulo(%) in order to proceed from the smaller value to
 count its quantity and remainder, that is,
     oneThousandRemder = cashWithdrawm % 1000           where (variable)Remder is the remaining values of the identifier
     fiveHundredRemder = oneThousandRemder % 500
 5. Calculate the total amount of each Peso bills
        total(PesoBill) = (PesoBill)Qnty * (PesoBill)
 6. Compute the sum of the quantity dispensed in each Peso bills
        (PesoBill)Qnty +...+ (PesoBill)Qnty
 7. Compute the sum of the total amount of Peso bills
        (PesoBill)Amount +...+(PesoBill)Amount
 8. Print the outputs in the main string using println
 **/
public class Dispenser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn, whole numbers only: ");
        int cashWithdrawn = Integer.parseInt(keyboard.nextLine());
        int oneThousandQnty = cashWithdrawn / 1000;
        int oneThousandRemder = cashWithdrawn % 1000;
        int fiveHundredQnty = oneThousandRemder / 500;
        int fiveHundredRemder = oneThousandRemder % 500;
        int oneHundredQnty = fiveHundredRemder / 100;
        int totalThousandAmount = oneThousandQnty * 1000;
        int totalFiveHundredAmount = fiveHundredQnty * 500;
        int totalOneHundredAmount = oneHundredQnty * 100;
        int totalBillsQnty = oneThousandQnty + fiveHundredQnty + oneHundredQnty;
        int totalBillsAmount = totalThousandAmount + totalFiveHundredAmount + totalOneHundredAmount;
        System.out.println("PESO BIILS"+"   "+"QUANTITY DISPENSED"+"   "+"AMOUNT");
        System.out.println("=========="+"   "+"=================="+"   "+"======");
        System.out.println("P1000 "+"                        "+oneThousandQnty  +"    "+totalThousandAmount);
        System.out.println("P500 "+"                         "+fiveHundredQnty  +"    "+totalFiveHundredAmount);
        System.out.println("P100 "+"                         "+oneHundredQnty   +"    "+totalOneHundredAmount);
        System.out.println("----------   ------------------   -------");
        System.out.println("Total No. of Bills:           "+totalBillsQnty+"    "+totalBillsAmount);
    }
}
