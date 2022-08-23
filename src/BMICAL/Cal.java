package BMICAL;

public class Cal {
    static int getAge(int x, int y){
        return x+y;
    }
    static int getAge(int x){
        return x;
    }

    public static void main(String[] args) {
        /*int age = getAge(5,12);
        System.out.println(age);*/
        int y = getAge(10);
        System.out.println(y);
    }
}
