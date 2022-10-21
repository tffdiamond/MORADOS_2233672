package something.tutorials;

// an elements consist of several arrays restart the process of length method -> this means that if there is an elements consist of several arrays and we want to take the value of that element that is in array, we will start with zero again.
public class Loops {
    static void myMethod(String name) {
        System.out.println(name + " " + "Diamond");
    }

    public static void main(String[] args) {
        //System.out.println(Math.max(12, 8));
   /*String[] nicknames = {"Lou", "Dia", "Dagul", "Diamond"};
    nicknames[0] = "Pogi";
        System.out.print(nicknames[0]);*/
        //String[] cars = {"Buggati", "Lambo", "Mercedes", "Horse"};
        /*for (String car : cars) System.out.println(car);*/
        // for (int i = 0; i < 10; i++) System.out.println("Panget si rizza");
        // for (String i: cars) System.out.println(i);
        int[][] x = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}}; //this is an array (multidimensional array tawag jan)
        for (int i = 0; i < x.length; ++i) {
            for (int j = 0; j < x[i].length; ++j) {
                System.out.println(x[i][j]);
            }
        }
    }
}


