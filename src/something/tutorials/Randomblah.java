package something.tutorials;
import java.util.Random;
import java.util.Scanner;

public class Randomblah {

    public static void main(String[] args) {
        Scanner kyb = new Scanner(System.in);
        System.out.println("Letter: ");
        String upperbound = kyb.nextLine();
        randomOutput(upperbound);
    }
    public static void randomOutput(String abc){
        Random randomGenerator = new Random();
        String s = "";
        for (int i=0; i<abc.length(); i++){
            int randomNum = randomGenerator.nextInt(abc.length()-1);
            char c = abc.charAt(randomNum);
            s += c;
        }
        System.out.println(s);
    }
}
