package experiments.classes;

import java.util.HashMap;
import java.util.HashSet;

public class Hashes {
    public static void main(String[] args) {
        HashSet<String> myObj = new HashSet<String>();
        HashMap<String, Integer> myNameAge = new HashMap<String, Integer>();

        myNameAge.put("Lou",18);
        myNameAge.put("Ian",13);
        myNameAge.put("Ruru",3);
        myNameAge.put("Jugler",2);
        myObj.add("Baguio");
        myObj.add("Olongapo");
        myObj.add("Bataan");
        myObj.add("Ilocos");
//        myObj.add("Olongapo");
        for (String i:myNameAge.keySet()) {
            System.out.println("Name: " + i + ", Age: " + myNameAge.get(i));
        }
        for (String i: myObj) {
            System.out.println(i);
        }
    }
}
