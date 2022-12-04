/**
 Appending the output of a program to a text file
 Sometimes, you want to add the program output to
 the end of an existing text file.
 This process is called appending to a file.
 To be able to append to an existing file, create an
 object of the PrintWriter class that points to the textfile
 where strings will be appended as shown below.

 Notice the use of the “true” Boolean Expression.
 */

package midterms.activities;
import java.io.*;

public class AppendToFileDemo {
    public static void main(String[] args) {
        run();
        System.exit(0);
    }
    public static void run(){
        BufferedReader keyboard =new BufferedReader(new InputStreamReader(System.in));
        String lineOfText="";
        char moreLine='y';
        String response = "";
        PrintWriter outputWriter=null;
        try {
            outputWriter = new PrintWriter(new FileWriter("outputfile.txt", true));
            //or   outputStream = new PrintWriter(new FileOutputStream("outputfile.txt", true));
            while ( Character.toUpperCase(moreLine)=='Y') {
                System.out.print("Type a line of text: ");
                lineOfText = keyboard.readLine();
                outputWriter.println(lineOfText);

                System.out.print("Do you have some more lines to enter <y/n>? ");
                response = keyboard.readLine();
                moreLine = response.charAt(0);
            }
            outputWriter.close();
            System.out.println("The lines of text you entered were appended in outputfile.txt.");

        } catch (Exception e1) {
            System.out.println("File Opening Error" + e1);
            e1.printStackTrace();
        }
    }// end of run method
}