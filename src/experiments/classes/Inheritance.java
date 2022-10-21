package experiments.classes;
class NameLast{
    protected String lastName = "Morados";
    protected String fName = "Lou";
    public void honk(){
        System.out.print("20TH Davidson Street, West Bajac-Bajac Olongapo City, Zambales");
    }
}

public class Inheritance extends NameLast{
    public static void main(String[] args) {
        Inheritance myObj = new Inheritance();
        Student fObj = new Student();
        System.out.println(myObj.lastName+","+myObj.fName+" "+fObj.secondName);
        myObj.honk();
    }
}
class Student extends Person{
    protected String secondName = "Diamond";
}