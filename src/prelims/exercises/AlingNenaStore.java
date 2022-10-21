package prelims.exercises;
import java.util.Scanner;

/**
 Name: Lou Diamond T. Morados
 Date: 9/7/2022
 Activity Name and Number: Prelim Exercise Number 6


 Problem: Create a program that satisfies aling nena's needs for her check out counter.

 Algorithm:

 Input:
 - Product Name
 - Quantity
 - Price
 - Discount
 - Cash Tendered

 Output :
 - Total Purchase Amount
 - Total Discount
 - Amount to be Paid
 - Change

 Process :
 1. Create an object Scanner class for the inputs
 3. Declare variables holds the value of the inputs from the scanner objects (product, quantity, price, discount, cash tendered);
 5. Get the inputs from the user
 6. Calculate the total purchase amount by multiplying the quantity and the price
 6. Calculate the discount using the formula totalPurchaseAmount * (inputedDiscount/100)
 7. Calculate the total amount to be paid using the formula totalPurchaseAmount-discount
 7. Calculate the total change using the formula cashTendered - amountToBePaid
 9. Print the outputs using println
 **/

public class AlingNenaStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product;
        int qnty;
        double price;
        int discount;
        int cashTendered;

        System.out.print("Product: ");
        product = scanner.nextLine();
        System.out.print("Quantity: ");
        qnty = Integer.parseInt(scanner.nextLine());
        System.out.print("Price: ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.print("Discount: ");
        discount = Integer.parseInt(scanner.nextLine());
        System.out.print("Cash Tendered: ");
        cashTendered = Integer.parseInt(scanner.nextLine());

        double totalPurchaseAmount = qnty*price;
        double totalDiscount = (totalPurchaseAmount * ((double) discount/100));
        double amountToBePaid = totalPurchaseAmount - totalDiscount;
        double change = cashTendered - amountToBePaid;


        System.out.println("\nTransaction Rundown for "+ product +":"  + "\n");
        System.out.println("    Total Purchase Amount = " + totalPurchaseAmount);
        System.out.println("    Total Discount = " +totalDiscount);
        System.out.println("    Amount to be Paid = " + amountToBePaid);
        System.out.println("    Change = " + change);
    }
}