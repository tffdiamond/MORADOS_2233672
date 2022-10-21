package experiments.classes;
class Grand {
    private String cars; //creates a private String

    public String getCars() { //returns value of the cars
        return cars;
    }

    public void setCars(String cars2) {
        this.cars = cars2; //this - refers to the current object that has same attribute values of cars2
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Grand cars3 = new Grand(); //cars3 instantiates Grand class
        cars3.setCars("Lou Diamond"); //set an input to the set method (which is a non-primitive type)
        System.out.println(cars3.getCars()); //print out the value of getCars()
    }
}
