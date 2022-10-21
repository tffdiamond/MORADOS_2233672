package midterms.exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class MidtermExercise4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String pName = "";
        double uPrice, totalCost = 0, discount, discountedCost, amountTendered, change;
        int qty, dRate;
        ArrayList<String> listOfProduct = new ArrayList<>();
        listOfProduct.add("Hotdog");
        listOfProduct.add("Egg");
        listOfProduct.add("Turon");
        listOfProduct.add("Siopao");
        listOfProduct.add("Pancake");
        do {
            System.out.print("Product: ");
            pName = keyboard.nextLine();
            if (!listOfProduct.contains(pName)){
                System.out.println("We do not sell this product");
            }
        }while (!listOfProduct.contains(pName));
        do {
            System.out.print("Quantity: ");
            qty = Integer.parseInt(keyboard.nextLine());
            if (qty < 0){
                System.out.println("Quantity cannot be negative");
            }
        }while (qty < 0);
        do {
            System.out.print("Unit Price: ");
            uPrice = Double.parseDouble(keyboard.nextLine());
            if (uPrice < 0){
                System.out.println("Unit Price must be greater than zero");
            }
        }while (uPrice < 0);
        do {
            System.out.print("Discount: ");
            dRate = Integer.parseInt(keyboard.nextLine());
            discount = totalCost * (dRate / 100.0);
            discountedCost = totalCost - discount;
            totalCost = uPrice * qty;
            if (dRate < 0 || dRate > 100){
                System.out.println("Discount rate cannot be negative and it cannot be more than 100 percent");
            }

        }while (dRate < 0 || dRate > 100);
        do {
            System.out.print("Cash Tendered: ");
            amountTendered = Double.parseDouble(keyboard.nextLine());
            change = amountTendered - discountedCost;
            if (amountTendered < uPrice){
                System.out.println("Amount tendered cannot be lower than the amount to be paid.");
            }
        }while (amountTendered < uPrice);
        System.out.printf("%-25s%12s%n", "----------------------", "--------------");

        System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
        System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
        System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
        System.out.printf("%-25s%12.2f%n", "Change: ", change);
        System.exit(0);
    } // end of main method
} // end of class