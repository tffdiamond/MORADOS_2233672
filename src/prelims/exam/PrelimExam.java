package prelims.exam;

import java.util.*;

public class PrelimExam {
    public static void main(String[] args) {
        int reversed = 0;
        Scanner kyb = new Scanner(System.in);
        System.out.println("Number: ");
        String num = kyb.nextLine();
        String reversednum = "";                 //the length() does not use indexing of java it counts the first
                // value or string (char) as 1
                for (int i = 0; i < num.length(); i++) { //the charAt() indexing is the reverse of length()
                    char ch = num.charAt(i);    //extract the user input into a char
                    reversednum = ch + reversednum; //converts the ch into string
                }
                System.out.println("Reversed output: " + reversednum);
                //        int num = Integer.parseInt(kyb.nextLine());
                //        StringBuilder num = new StringBuilder((kyb.nextLine()));
                //        num.reverse();
                //        System.out.println(num);
                        //        while (num != 0){
                        //            int digit = num % 10;
                        //            reversed = reversed * 10 + digit;
                        //            num /= 10; //remove the last term
                        //        }
                        //        System.out.println(reversed);
                                //        char[] Array = num.toCharArray();
                                //        ArrayList<Character> charList = new ArrayList<Character>();
                                //        String reversedString = "";
                                //
                                //        for(char c : Array)
                                //        {
                                //            charList.add(c);
                                //        }
                                //
                                //        Collections.reverse(charList);
                                //        for(char c : charList)
                                //        {
                                //            reversedString += c;
                                //        }
                                //
                                //        System.out.println(reversedString);
                                        //        while (num != 0)
                                        //        {
                                        //            int digit = num % 10;
                                        //            reversed = reversed * 10 + digit;
                                        //            num /= 10;
                                        //        }
                                        //        System.out.println(reversed);
    }
}
