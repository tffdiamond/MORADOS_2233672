package experiments.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner kyb = new Scanner(System.in);
        System.out.println("Input any to reversed ");
        String num = kyb.nextLine();
        char[] ch = num.toCharArray();
        String reversedString = "";
        LinkedList<Character> list = new LinkedList<Character>();
        for (char c : ch) {
            list.add(c);
        }
        Collections.reverse(list);
        for (char c : list){
//BUG            reversedString += list.get(c);
            reversedString += c;
        }
        System.out.println(reversedString);
//        int num = Integer.parseInt(kyb.nextLine());
//        String num2 = String.valueOf(num);
//        String reversedString = "";

//                    for (int i = 0; i<num2.length(); i++){
//                        char ch = num2.charAt(i);
//                        reversedString = ch+reversedString ;
            /*visualising reversedString = reversedString + ch;
            * For ex; input =123
            * reversedString is assigned to ""+ch
            * reversedString = ""+3
            * reversedString = "3"+2
            * reversedString = "23"+1
            * reversedString = "123"
            * */
//                    }
//                    System.out.println("The reversed of "+num+" is "+reversedString);
            //        ArrayList<String> myObj = new ArrayList<String>();
            //        myObj.add("number");
            //        myObj.add("integer");
            //        myObj.add("natural numbers");
            //        myObj.add("whole numbers");
            //        System.out.println(myObj);
            //        System.out.println(myObj.get(0));
            //        myObj.set(0,"one");
            //        Collections.sort(myObj);
            //        System.out.println(myObj);
    }
}