/*
Getting Inputs from the keyboard
If an input stream is connected to the keyboard, \
   data flow from the keyboard into the program.
*/
package midterms.activities;
import java.io.*;
public class KeyboardInputDemo{
    public static void run(){
        BufferedReader keyboard=null;
        double dividend=0, divisor=0, quotient=0;
        try{
            keyboard=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the dividend: ");
            dividend = Double.parseDouble( keyboard.readLine());
            System.out.print("Enter the divisor: ");
            divisor = Double.parseDouble( keyboard.readLine());
            System.out.println();
            quotient = dividend/divisor;
            System.out.println("Quotient = " + quotient);
        } catch (Exception exception){
            System.out.println("Problem detected!");
            System.out.println(exception.getMessage());
        }
    }// end run
    public static void main(String[] args) {
        run();
        System.exit(0);
    }  // end main

}// end of class