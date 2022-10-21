package experiments.others;

public class Ject1 {
    public static void main(String[] args) {
        Ai osip = Ai.SAMPU; // from Ai class define osip object equal to the enum Ai that has a value defined as PISO
        System.out.println(osip.val); // output piso = 1 #osip.val -> means for the osip object, we take the integer value NOT THE VARIABLE of enum class
        Dog x = new Dog(); //from the Dog class we call a variable object that is equal to the object of Dog()
        String dog = x.iAmDog(); //define a new variable object that is equivalent to the x.method()
        System.out.println(dog);//print out an output of I am Dog
    }
}