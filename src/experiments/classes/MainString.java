package experiments.classes;

public class MainString {
    public static void main(String[] args) {
        GlobalClass myCar = new GlobalClass(); // define an object for the Ments2 class to call attributes of the class
        myCar.fullThrottle(); // calls the method
        myCar.speed(150); // calls the built-in method
    }
}
