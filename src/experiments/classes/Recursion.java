package experiments.classes;

public class Recursion {
    public static void main(String[] args) {
        int result = sum(10, 40); // define an object
        System.out.println(result); // print result
    }
    public static int sum(int x, int y) { //create a sum method
        if (y > x)
            return y + sum(x, y - 1); //return y + sum(x,y-1) to the sum() that is initialized by an object result
        else
            return y; // it returns y from some storage so the recursion will stop? or the return y statement is there to stop the recursion
    }
}
