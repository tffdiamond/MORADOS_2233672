package something.tutorials;
import java.lang.*;
import java.util.Scanner;
// The filename for the following source code must be AlingNenaStore.java
/*
Name: LOU DIAMOND T. MORADOS
Programming Date: August 31 , 2022,
Activity Name and Number: Prelim Exercise Number 6
Problem: Write a Java program that will be used at the check-out counter of Aling Nena's Sari-Sari Store with the following
assumptions. Aling Nena's customers always buy only one type of product, but may buy one or more pieces of the
said product. For example, a customer may buy a dozen eggs. Depending on the customer, Aling Nena may decide to give
the customer a discount, expressed as an integer value from 1 to 100, which indicates the percentage deducted from
the total amount of the customer's purchase. For example, assuming that eggs cost P5.00 a piece, a dozen eggs would
cost a total of P60.00, and if the customer is then given a 10 percent discount, then the customer will have to pay
only P54.00 for one dozen of eggs. Customers who are not entitled to discounts are given zero (0) percent discount.
Aling Nena's customers always pay in cash, and the cash amount tendered is always greater than or equal to the total
purchase amount. Your program must calculate the change given to the customer.
Analysis:
Input:
1) Name of the product
2) Quantity of the product
3) Submitted Cash
Processes: Compute the product amount and the new cash after buying a product
Display the data relating to the product
Output: The change after buying a product
Algorithm:
1. Give the name of the product and its quantity(productQuantity)
2. Give a cash(cashReceived) not less than the product amount(productQuantityAmount)
3. Compute the productQuantityAmount = productQuantity * 8
    if the productQuantityAmount is less than 12 then there is no discount
4. Show the quantity and the price of the product
5. Show the price(unitPrice) of the product
6. Show the total amount of a product(productQuantityAmount)
6. Show the change after buying the product

*/

public class AlingNenaStore1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of product: ");
        String productName = keyboard.nextLine();
        System.out.println("How many quantity: ");
        int productQuantity = Integer.parseInt(keyboard.nextLine());
        System.out.println("Unit Price: ");
        double unitPrice = keyboard.nextDouble();
        System.out.println("Cash: ");
        double cashReceived = keyboard.nextDouble();
        if (productQuantity >= 12) {
            int discount = 8;
            double productQuantityAmount = productQuantity * unitPrice - discount;
            double cashTotal = cashReceived - productQuantityAmount;
            System.out.println("The product is: "+productName);
            System.out.println("Quantity is "+productQuantity);
            System.out.println("Unit Price is "+unitPrice);
            System.out.println("Total Purchase Amount: "+productQuantityAmount);
            System.out.printf("Change: "+ cashTotal + " pesos\n");
        } else {
            double productQuantityAmount = productQuantity * unitPrice;
            double cashTotal = cashReceived - productQuantityAmount;
            System.out.println("The product is: "+productName);
            System.out.println("Quantity is " + productQuantity);
            System.out.println("Unit Price is "+unitPrice);
            System.out.println("Total Purchase Amount: "+productQuantityAmount);
            System.out.printf("Change: " + cashTotal + " pesos\n");
        }
    }
}
