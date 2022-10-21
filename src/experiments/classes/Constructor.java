package experiments.classes;

public class Constructor {
    int x;
    //created a constructor
    public Constructor(){
        x = 5;
    }
    public static void main(String[] args) {
        //define an object for the class
        Constructor numMy = new Constructor();
        System.out.println(numMy.x);
    }
}
