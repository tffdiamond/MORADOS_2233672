package bmical;

public class ReturnGethod {
    static int getAge(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        int z = getAge(10,20);
        System.out.println(z);
    }
}
