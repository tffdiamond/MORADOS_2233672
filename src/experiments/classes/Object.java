package experiments.classes;

public class Object {
    int x = 5; // global variables
    double y = 18.1;

    public static void main(String[] args) {
        Object num = new Object(); //from class Ments1, define new object name, that instantiate the global class in order to call any global variable.
            System.out.println(num.y == num.x); //new object name that takes the global variable x
    }
}
